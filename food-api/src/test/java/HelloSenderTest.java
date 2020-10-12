import com.imooc.Application;
import com.imooc.controller.rabbitmq.HelloSender;
import com.imooc.controller.rabbitmq.HelloSender2;
import com.imooc.controller.rabbitmq.UserSender;
import com.imooc.controller.rabbitmq.model.User;
import io.swagger.annotations.ApiModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 转自:https://www.cnblogs.com/flgb/p/12831426.html
 * @author jianjun
 * @version 1.0
 * @date 2020/10/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class HelloSenderTest {
    @Autowired
    private HelloSender helloSender;

    @Autowired
    private HelloSender2 helloSender2;

    @Autowired
    private UserSender userSender;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void test(){
        helloSender.send();
    }

    @Test
    public void oneToMany() throws Exception {
        for (int i=0;i<100;i++){
            helloSender.send(i);
        }
    }


    @Test
    public void user() throws Exception {
        User user = new User();
        user.setUsername("张三");
        user.setPassword("123456");
        userSender.send(user);
    }

    @Test
    public void sendMessage() {
        String context = "hi, i am message 1";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("exchange", "topic.message", context);
    }
    @Test
    public void sendMessages() {
        String context = "hi, i am messages 2";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("exchange", "topic.messages", context);
    }

    @Test
    public void sendFanout() {
        String context = "hi, fanout msg ";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("fanoutExchange","无论输什么队列", context);
    }
}

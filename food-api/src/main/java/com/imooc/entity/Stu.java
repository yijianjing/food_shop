package com.imooc.entity;

import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.*;
/**
 * 自已定义
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Data
public class Stu implements Serializable {

    private Integer id;
    /**  */
    private String name;
    /**  */
    private Integer age;


}
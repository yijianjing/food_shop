package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.dao.ItemsCommentsMapper;
import com.imooc.entity.ItemsComments;
import com.imooc.service.ItemsCommentsService;
import org.springframework.stereotype.Service;
/**
 * 商品评价表 
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Service
public class ItemsCommentsServiceImpl extends ServiceImpl<ItemsCommentsMapper, ItemsComments> implements ItemsCommentsService {

}
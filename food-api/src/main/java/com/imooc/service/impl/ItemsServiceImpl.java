package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.dao.ItemsMapper;
import com.imooc.entity.Items;
import com.imooc.service.ItemsService;
import org.springframework.stereotype.Service;
/**
 * 商品表 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Service
public class ItemsServiceImpl extends ServiceImpl<ItemsMapper, Items> implements ItemsService {

}
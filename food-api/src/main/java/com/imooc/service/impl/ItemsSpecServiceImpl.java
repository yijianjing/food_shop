package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.dao.ItemsSpecMapper;
import com.imooc.entity.ItemsSpec;
import com.imooc.service.ItemsSpecService;
import org.springframework.stereotype.Service;
/**
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Service
public class ItemsSpecServiceImpl extends ServiceImpl<ItemsSpecMapper, ItemsSpec> implements ItemsSpecService {

}
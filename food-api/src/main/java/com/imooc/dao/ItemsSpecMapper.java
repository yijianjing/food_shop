package com.imooc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.imooc.entity.ItemsSpec;

/**
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */

public interface ItemsSpecMapper extends BaseMapper<ItemsSpec> {

}
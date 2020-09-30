package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.imooc.dao.CategoryMapper;
import com.imooc.entity.Category;
import com.imooc.service.CategoryService;
import org.springframework.stereotype.Service;
/**
 * 商品分类 
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
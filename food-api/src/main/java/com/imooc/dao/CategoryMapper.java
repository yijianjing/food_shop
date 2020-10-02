package com.imooc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.imooc.entity.Category;
import com.imooc.entity.vo.CategoryVO;
import com.imooc.entity.vo.NewItemsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 商品分类 
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */

public interface CategoryMapper extends BaseMapper<Category> {
    List<CategoryVO> getSubCatList(Integer rootCatId);

    List<NewItemsVO> getSixNewItemsLazy(@Param("paramsMap") Map<String, Object> map);

}
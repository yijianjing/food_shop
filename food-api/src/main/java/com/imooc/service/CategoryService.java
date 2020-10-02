package com.imooc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.entity.Category;
import com.imooc.entity.vo.CategoryVO;
import com.imooc.entity.vo.NewItemsVO;

import java.util.List;

/**
 * 商品分类 
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
public interface CategoryService extends IService<Category> {
    /**
     * 查询所有一级分类
     * @return
     */
    public List<Category> queryAllRootLevelCat();

    /**
     * 根据一级分类id查询子分类信息
     * @param rootCatId
     * @return
     */
    public List<CategoryVO> getSubCatList(Integer rootCatId);

    /**
     * 查询首页每个一级分类下的6条最新商品数据
     * @param rootCatId
     * @return
     */
    public List<NewItemsVO> getSixNewItemsLazy(Integer rootCatId);

}
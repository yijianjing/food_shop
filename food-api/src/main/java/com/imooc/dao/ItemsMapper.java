package com.imooc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.imooc.entity.Items;
import com.imooc.entity.vo.ItemCommentVO;
import com.imooc.entity.vo.SearchItemsVO;
import com.imooc.entity.vo.ShopcartVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 商品表 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */

public interface ItemsMapper extends BaseMapper<Items> {
    public List<ItemCommentVO> queryItemComments(@Param("paramsMap") Map<String, Object> map);

    public List<SearchItemsVO> searchItems(@Param("paramsMap") Map<String, Object> map);

    public List<SearchItemsVO> searchItemsByThirdCat(@Param("paramsMap") Map<String, Object> map);

    public List<ShopcartVO> queryItemsBySpecIds(@Param("paramsList") List specIdsList);

    public int decreaseItemSpecStock(@Param("specId") String specId,
                                     @Param("pendingCounts") int pendingCounts);

}
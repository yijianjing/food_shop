package com.imooc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.entity.Carousel;

import java.util.List;

/**
 * 轮播图 
 * @author jianjun
 * @version 1.0
 * @date 2020-09-30
 */
public interface CarouselService extends IService<Carousel> {
    /**
     * 查询所有轮播图列表
     * @param isShow
     * @return
     */
    public List<Carousel> queryAll(Integer isShow);

}
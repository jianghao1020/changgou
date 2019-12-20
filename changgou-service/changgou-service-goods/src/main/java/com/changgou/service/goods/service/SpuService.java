package com.changgou.service.goods.service;

import com.changgou.service.api.goods.pojo.Spu;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author oliver
 * @date 2019/12/20 14:25
 */
public interface SpuService {

    /**
     * Spu多条件分页查询
     *
     * @param spu  spu
     * @param page page
     * @param size size
     * @return pageInfo
     */
    PageInfo<Spu> findPage(Spu spu, int page, int size);

    /**
     * Spu分页查询
     *
     * @param page page
     * @param size size
     * @return pageInfo
     */
    PageInfo<Spu> findPage(int page, int size);

    /**
     * Spu多条件搜索方法
     *
     * @param spu spu
     * @return list
     */
    List<Spu> findList(Spu spu);

    /**
     * 删除Spu
     *
     * @param id id
     */
    void delete(String id);

    /***
     * 修改Spu数据
     * @param spu spu
     */
    void update(Spu spu);

    /**
     * 新增Spu
     *
     * @param spu spu
     */
    void add(Spu spu);

    /**
     * 根据ID查询Spu
     *
     * @param id id
     * @return spu
     */
    Spu findById(String id);

    /**
     * 查询所有Spu
     *
     * @return list
     */
    List<Spu> findAll();
}

package com.changgou.service.goods.service;

import com.changgou.service.api.goods.pojo.Sku;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author oliver
 * @date 2019/12/20 14:28
 */
public interface SkuService {

    /**
     * Sku多条件分页查询
     *
     * @param sku  sku
     * @param page page
     * @param size size
     * @return pageInfo
     */
    PageInfo<Sku> findPage(Sku sku, int page, int size);

    /**
     * Sku分页查询
     *
     * @param page page
     * @param size size
     * @return pageInfo
     */
    PageInfo<Sku> findPage(int page, int size);

    /**
     * Sku多条件搜索方法
     *
     * @param sku sku
     * @return list
     */
    List<Sku> findList(Sku sku);

    /**
     * 删除Sku
     *
     * @param id id
     */
    void delete(String id);

    /**
     * 修改Sku数据
     *
     * @param sku sku
     */
    void update(Sku sku);

    /**
     * 新增Sku
     *
     * @param sku sku
     */
    void add(Sku sku);

    /**
     * 根据ID查询Sku
     *
     * @param id id
     * @return sku
     */
    Sku findById(String id);

    /**
     * 查询所有Sku
     *
     * @return list
     */
    List<Sku> findAll();
}

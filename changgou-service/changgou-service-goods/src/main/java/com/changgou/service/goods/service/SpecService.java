package com.changgou.service.goods.service;

import com.changgou.service.api.goods.pojo.Spec;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author oliver
 * @date 2019/12/20 10:08
 */
public interface SpecService {

    /**
     * Spec多条件分页查询
     *
     * @param spec spec
     * @param page page
     * @param size size
     * @return pageInfo
     */
    PageInfo<Spec> findPage(Spec spec, int page, int size);

    /**
     * Spec分页查询
     *
     * @param page page
     * @param size size
     * @return pageInfo
     */
    PageInfo<Spec> findPage(int page, int size);

    /**
     * Spec多条件搜索方法
     *
     * @param spec spec
     * @return list
     */
    List<Spec> findList(Spec spec);

    /**
     * 删除Spec
     *
     * @param id id
     */
    void delete(Integer id);

    /**
     * 修改Spec数据
     *
     * @param spec spec
     */
    void update(Spec spec);

    /**
     * 新增Spec
     *
     * @param spec spec
     */
    void add(Spec spec);

    /**
     * 根据ID查询Spec
     *
     * @param id id
     * @return spec
     */
    Spec findById(Integer id);

    /**
     * 查询所有Spec
     *
     * @return list
     */
    List<Spec> findAll();

    /**
     * 根据分类ID查询模板集合信息
     * @param categoryId categoryId
     * @return list
     */
    List<Spec> findByCategoryId(Integer categoryId);
}

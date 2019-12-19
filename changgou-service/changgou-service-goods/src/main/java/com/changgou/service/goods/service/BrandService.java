package com.changgou.service.goods.service;

import com.changgou.service.api.goods.pojo.Brand;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * @author oliver
 */
public interface BrandService {

    /**
     * 品牌列表查询
     *
     * @return list
     */
    List<Brand> findList();

    /**
     * 根据id查询品牌数据
     *
     * @param id id
     * @return brand
     */
    Brand findById(Integer id);

    /**
     * 品牌新增
     */
    void add(Brand brand);

    /**
     * 品牌修改
     *
     * @param brand brand
     */
    void update(Brand brand);

    /**
     * 品牌删除
     */
    void delById(Integer id);

    /**
     * 品牌列表条件查询
     *
     * @param searchMap 查询条件
     * @return list
     */
    List<Brand> list(Map<String, Object> searchMap);

    /**
     * 品牌列表分页查询
     *
     * @param page 当前的页码
     * @param size 每页显示多少条
     * @return page
     */
    Page<Brand> findPage(int page, int size);

    /**
     * 品牌列表分页+条件查询
     *
     * @param brand brand
     * @param page  当前的页码
     * @param size  每页显示多少条
     * @return page
     */
    PageInfo<Brand> findPage(Brand brand, Integer page, Integer size);

    /**
     * 品牌列表分页+条件查询
     *
     * @param searchMap searchMap
     * @param page      当前的页码
     * @param size      每页显示多少条
     * @return page
     */
    Page<Brand> findPage(Map<String, Object> searchMap, int page, int size);

    /**
     * 根据分类名称查询品牌列表
     *
     * @param categoryName 分类名称
     * @return list
     */
    List<Map<String, Object>> findBrandListByCategoryName(String categoryName);
}

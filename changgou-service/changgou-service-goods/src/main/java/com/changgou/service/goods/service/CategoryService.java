package com.changgou.service.goods.service;

import com.changgou.service.api.goods.pojo.Category;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author oliver
 * @date 2019/12/18 15:59
 */
public interface CategoryService {

    /**
     * Category多条件分页查询
     *
     * @param category category
     * @param page     page
     * @param size     size
     * @return pageInfo
     */
    PageInfo<Category> findPage(Category category, int page, int size);

    /**
     * Category分页查询
     *
     * @param page
     * @param size
     * @return
     */
    PageInfo<Category> findPage(int page, int size);

    /**
     * Category多条件搜索方法
     *
     * @param category
     * @return
     */
    List<Category> findList(Category category);

    /**
     * 删除Category
     *
     * @param id
     */
    void delete(Integer id);

    /**
     * 修改Category数据
     *
     * @param category
     */
    void update(Category category);

    /**
     * 新增Category
     *
     * @param category category
     */
    void add(Category category);

    /**
     * 根据ID查询Category
     *
     * @param id id
     * @return category
     */
    Category findById(Integer id);

    /**
     * 查询所有Category
     *
     * @return list
     */
    List<Category> findAll();

    /**
     * 根据父级ID查询
     *
     * @param id 父级id
     * @return list
     */
    List<Category> findByParentId(Integer id);
}

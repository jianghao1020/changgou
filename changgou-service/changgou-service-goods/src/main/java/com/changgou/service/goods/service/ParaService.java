package com.changgou.service.goods.service;

import com.changgou.service.api.goods.pojo.Para;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author oliver
 * @date 2019/12/20 10:51
 */
public interface ParaService {

    /**
     * Para多条件分页查询
     *
     * @param para para
     * @param page page
     * @param size size
     * @return pageInfo
     */
    PageInfo<Para> findPage(Para para, int page, int size);

    /**
     * Para分页查询
     *
     * @param page page
     * @param size size
     * @return pageInfo
     */
    PageInfo<Para> findPage(int page, int size);

    /**
     * Para多条件搜索方法
     *
     * @param para para
     * @return list
     */
    List<Para> findList(Para para);

    /**
     * 删除Para
     *
     * @param id id
     */
    void delete(Integer id);

    /**
     * 修改Para数据
     *
     * @param para para
     */
    void update(Para para);

    /**
     * 新增Para
     *
     * @param para para
     */
    void add(Para para);

    /**
     * 根据ID查询Para
     *
     * @param id id
     * @return para
     */
    Para findById(Integer id);

    /**
     * 查询所有Para
     *
     * @return list
     */
    List<Para> findAll();

    /**
     * 根据分类id查询参数集合->分类的template_id->根据template_id查询参数集合
     *
     * @param categoryId categoryId
     * @return list
     */
    List<Para> findParaByCategoryId(Integer categoryId);
}

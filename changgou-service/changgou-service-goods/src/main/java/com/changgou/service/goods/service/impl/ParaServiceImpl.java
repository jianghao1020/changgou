package com.changgou.service.goods.service.impl;

import com.changgou.service.api.goods.pojo.Category;
import com.changgou.service.api.goods.pojo.Para;
import com.changgou.service.goods.mapper.CategoryMapper;
import com.changgou.service.goods.mapper.ParaMapper;
import com.changgou.service.goods.service.ParaService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oliver
 * @date 2019/12/20 10:54
 */
@Service
public class ParaServiceImpl implements ParaService {

    @Resource
    private ParaMapper paraMapper;

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public PageInfo<Para> findPage(Para para, int page, int size) {
        return null;
    }

    @Override
    public PageInfo<Para> findPage(int page, int size) {
        return null;
    }

    @Override
    public List<Para> findList(Para para) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Para para) {

    }

    @Override
    public void add(Para para) {

    }

    @Override
    public Para findById(Integer id) {
        return null;
    }

    @Override
    public List<Para> findAll() {
        return paraMapper.selectAll();
    }

    @Override
    public List<Para> findParaByCategoryId(Integer categoryId) {
        Category category = categoryMapper.selectByPrimaryKey(categoryId);
        Para para = new Para();
        para.setTemplateId(category.getTemplateId());
        return paraMapper.select(para);
    }
}

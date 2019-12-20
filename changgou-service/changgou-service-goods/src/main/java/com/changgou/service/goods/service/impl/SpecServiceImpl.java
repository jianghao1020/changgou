package com.changgou.service.goods.service.impl;

import com.changgou.service.api.goods.pojo.Category;
import com.changgou.service.api.goods.pojo.Spec;
import com.changgou.service.goods.mapper.CategoryMapper;
import com.changgou.service.goods.mapper.SpecMapper;
import com.changgou.service.goods.service.SpecService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oliver
 * @date 2019/12/20 10:11
 */
@Service
public class SpecServiceImpl implements SpecService {

    @Resource
    private SpecMapper specMapper;

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public PageInfo<Spec> findPage(Spec spec, int page, int size) {
        return null;
    }

    @Override
    public PageInfo<Spec> findPage(int page, int size) {
        return null;
    }

    @Override
    public List<Spec> findList(Spec spec) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Spec spec) {

    }

    @Override
    public void add(Spec spec) {

    }

    @Override
    public Spec findById(Integer id) {
        return null;
    }

    @Override
    public List<Spec> findAll() {
        return specMapper.selectAll();
    }

    @Override
    public List<Spec> findByCategoryId(Integer categoryId) {
        Category category = categoryMapper.selectByPrimaryKey(categoryId);
        Spec spec = new Spec();
        spec.setTemplateId(category.getTemplateId());
        return specMapper.select(spec);
    }
}

package com.changgou.service.goods.service.impl;

import com.changgou.service.api.goods.pojo.Brand;
import com.changgou.service.goods.mapper.BrandMapper;
import com.changgou.service.goods.service.BrandService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author oliver
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Resource
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findList() {
        return brandMapper.selectAll();
    }

    @Override
    public Brand findById(Integer id) {
        return null;
    }

    @Override
    public void add(Brand brand) {

    }

    @Override
    public void update(Brand brand) {

    }

    @Override
    public void delById(Integer id) {

    }

    @Override
    public List<Brand> list(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public Page<Brand> findPage(int page, int size) {
        return null;
    }

    @Override
    public PageInfo<Brand> findPage(Brand brand, Integer page, Integer size) {
        // 静态分页 PageHelper.startPage(pageNum,size)
        PageHelper.startPage(page, size);
        // 条件搜索
        Example example = createExample(brand);
        // 搜索
        List<Brand> brands = brandMapper.selectByExample(example);
        // 封装PageInfo<T>
        return new PageInfo<>(brands);
    }

    @Override
    public Page<Brand> findPage(Map<String, Object> searchMap, int page, int size) {
        PageHelper.startPage(page, size);
        Example example = createExample(searchMap);
        return (Page<Brand>) brandMapper.selectByExample(example);
    }

    @Override
    public List<Map<String, Object>> findBrandListByCategoryName(String categoryName) {
        return brandMapper.findBrandListByCategoryName(categoryName);
    }

    public Example createExample(Brand brand) {
        // 动态构建条件Example,criteria:动态组装条件
        Example example = new Example(Brand.class);
        Example.Criteria criteria = example.createCriteria();
        // 组装条件
        if (brand != null) {
            // id
            if (!StringUtils.isEmpty(brand.getId())) {
                criteria.andEqualTo("id", brand.getId());
            }

            if (!StringUtils.isEmpty(brand.getName())) {
                // 1)输入name-根据name查询[模糊查询]   select * from tb_brand where name like '%brand.getName%'
                criteria.andLike("name", "%" + brand.getName() + "%");
            }

            if (!StringUtils.isEmpty(brand.getLetter())) {
                // 2)输入了letter-根据letter查询       select * from tb_brand where letter= 'brand.getLetter'
                criteria.andEqualTo("letter", brand.getLetter());
            }
        }
        return example;
    }

    private Example createExample(Map<String, Object> searchMap) {
        Example example = new Example(Brand.class);
        Example.Criteria criteria = example.createCriteria();

        if (searchMap != null) {

            if (searchMap.get("name") != null && !"".equals(searchMap.get("name"))) {
                criteria.andLike("name", "%" + searchMap.get("name") + "%");
            }
            if (searchMap.get("letter") != null && !"".equals(searchMap.get("letter"))) {
                criteria.andEqualTo("letter", searchMap.get("letter"));
            }
        }
        return example;
    }
}

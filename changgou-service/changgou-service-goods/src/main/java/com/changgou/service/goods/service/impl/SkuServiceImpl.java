package com.changgou.service.goods.service.impl;

import com.changgou.service.api.goods.pojo.Sku;
import com.changgou.service.goods.service.SkuService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author oliver
 * @date 2019/12/20 14:32
 */
@Service
public class SkuServiceImpl implements SkuService {

    @Override
    public PageInfo<Sku> findPage(Sku sku, int page, int size) {
        return null;
    }

    @Override
    public PageInfo<Sku> findPage(int page, int size) {
        return null;
    }

    @Override
    public List<Sku> findList(Sku sku) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(Sku sku) {

    }

    @Override
    public void add(Sku sku) {

    }

    @Override
    public Sku findById(String id) {
        return null;
    }

    @Override
    public List<Sku> findAll() {
        return null;
    }
}

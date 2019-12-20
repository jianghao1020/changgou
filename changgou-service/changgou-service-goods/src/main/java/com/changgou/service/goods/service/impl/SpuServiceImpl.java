package com.changgou.service.goods.service.impl;

import com.changgou.service.api.goods.pojo.Spu;
import com.changgou.service.goods.service.SpuService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author oliver
 * @date 2019/12/20 14:31
 */
@Service
public class SpuServiceImpl implements SpuService {

    @Override
    public PageInfo<Spu> findPage(Spu spu, int page, int size) {
        return null;
    }

    @Override
    public PageInfo<Spu> findPage(int page, int size) {
        return null;
    }

    @Override
    public List<Spu> findList(Spu spu) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(Spu spu) {

    }

    @Override
    public void add(Spu spu) {

    }

    @Override
    public Spu findById(String id) {
        return null;
    }

    @Override
    public List<Spu> findAll() {
        return null;
    }
}

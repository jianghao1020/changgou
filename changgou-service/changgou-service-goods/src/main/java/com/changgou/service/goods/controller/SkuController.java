package com.changgou.service.goods.controller;

import com.changgou.common.entity.Result;
import com.changgou.common.entity.StatusCode;
import com.changgou.service.api.goods.pojo.Sku;
import com.changgou.service.goods.service.SkuService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oliver
 * @date 2019/12/20 14:33
 */
@RestController
@RequestMapping("/sku")
@CrossOrigin
public class SkuController {

    @Resource
    private SkuService skuService;

    /**
     * 查询Sku全部数据
     *
     * @return list
     */
    @GetMapping
    public Result findAll() {
        //调用SkuService实现查询所有Sku
        List<Sku> list = skuService.findAll();
        return new Result(true, StatusCode.OK, "查询成功", list);
    }
}

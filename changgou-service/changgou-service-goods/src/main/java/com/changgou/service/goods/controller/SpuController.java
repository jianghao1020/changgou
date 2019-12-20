package com.changgou.service.goods.controller;

import com.changgou.common.entity.Result;
import com.changgou.common.entity.StatusCode;
import com.changgou.service.api.goods.pojo.Spu;
import com.changgou.service.goods.service.SpuService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oliver
 * @date 2019/12/20 14:35
 */
@RestController
@RequestMapping("/spu")
@CrossOrigin
public class SpuController {

    @Resource
    private SpuService spuService;

    @GetMapping
    public Result findAll() {
        // 调用SpuService实现查询所有Spu
        List<Spu> list = spuService.findAll();
        return new Result(true, StatusCode.OK, "查询成功", list);
    }
}

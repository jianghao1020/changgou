package com.changgou.service.goods.controller;

import com.changgou.common.entity.Result;
import com.changgou.common.entity.StatusCode;
import com.changgou.service.api.goods.pojo.Para;
import com.changgou.service.goods.service.ParaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oliver
 * @date 2019/12/20 10:55
 */
@RestController
@RequestMapping("/para")
@CrossOrigin
public class ParaController {

    @Resource
    private ParaService paraService;

    @GetMapping
    public Result findAll() {
        List<Para> all = paraService.findAll();
        return new Result(true, StatusCode.OK, "查询参数成功", all);
    }

    @GetMapping(value = "category/{id}")
    public Result findParaByCategoryId(@PathVariable(value = "id") Integer categoryId) {
        List<Para> paras = paraService.findParaByCategoryId(categoryId);
        return new Result(true, StatusCode.OK, "查询参数集合成功", paras);
    }
}

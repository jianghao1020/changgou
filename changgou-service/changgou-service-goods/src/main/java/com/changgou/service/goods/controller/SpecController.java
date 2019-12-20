package com.changgou.service.goods.controller;

import com.changgou.common.entity.Result;
import com.changgou.common.entity.StatusCode;
import com.changgou.service.api.goods.pojo.Spec;
import com.changgou.service.goods.service.SpecService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oliver
 * @date 2019/12/20 10:12
 */
@RestController
@RequestMapping("/spec")
@CrossOrigin
public class SpecController {

    @Resource
    private SpecService specService;

    /**
     * 查询所有
     *
     * @return list
     */
    @GetMapping
    public Result findAll() {
        // 调用SpecService实现查询所有Spec
        List<Spec> all = specService.findAll();
        return new Result(true, StatusCode.OK, "查询规格列表成功", all);
    }

    /**
     * @param spec spec
     * @param page page
     * @param size size
     * @return pageInfo
     */
    @PostMapping(value = "/search/{page}/{size}")
    public Result findPage(@RequestBody(required = false) Spec spec, @PathVariable int page, @PathVariable int size) {
        // 调用SpecService实现分页条件查询Spec
        PageInfo<Spec> pageInfo = specService.findPage(spec, page, size);
        return new Result(true, StatusCode.OK, "查询成功", pageInfo);
    }

    /**
     * 根据分类ID查询模板规格信息
     * @param categoryId categoryId
     * @return
     */
    @GetMapping(value = "category/{id}")
    public Result findByCategoryId(@PathVariable(value = "id") Integer categoryId) {
        List<Spec> specList = specService.findByCategoryId(categoryId);
        return new Result(true, StatusCode.OK, "查询成功", specList);
    }
}

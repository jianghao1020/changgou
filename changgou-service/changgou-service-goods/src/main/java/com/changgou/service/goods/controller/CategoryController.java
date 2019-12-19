package com.changgou.service.goods.controller;

import com.changgou.common.entity.Result;
import com.changgou.common.entity.StatusCode;
import com.changgou.service.api.goods.pojo.Category;
import com.changgou.service.goods.service.CategoryService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oliver
 * @date 2019/12/18 16:24
 */
@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    /**
     * 分页条件搜索实现
     *
     * @param category category
     * @param page     page
     * @param size     size
     * @return list
     */
    @PostMapping(value = "/search/{page}/{size}")
    public Result findPage(@RequestBody(required = false) Category category, @PathVariable int page, @PathVariable int size) {
        // 调用CategoryService实现分页条件查询Category
        PageInfo<Category> pageInfo = categoryService.findPage(category, page, size);
        return new Result(true, StatusCode.OK, "查询成功", pageInfo);
    }

    /**
     * 分页搜索实现
     *
     * @param page page
     * @param size size
     * @return list
     */
    @GetMapping(value = "/search/{page}/{size}")
    public Result findPage(@PathVariable int page, @PathVariable int size) {
        // 调用CategoryService实现分页查询Category
        PageInfo<Category> pageInfo = categoryService.findPage(page, size);
        return new Result(true, StatusCode.OK, "查询成功", pageInfo);
    }

    /**
     * 多条件搜索品牌数据
     *
     * @param category category
     * @return list
     */
    @PostMapping(value = "/search")
    public Result findList(@RequestBody(required = false) Category category) {
        //调用CategoryService实现条件查询Category
        List<Category> list = categoryService.findList(category);
        return new Result(true, StatusCode.OK, "查询成功", list);
    }

    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable Integer id) {
        //调用CategoryService实现根据主键删除
        categoryService.delete(id);
        return new Result(true, StatusCode.OK, "删除成功");
    }

    @PutMapping(value = "/{id}")
    public Result update(@RequestBody Category category, @PathVariable Integer id) {
        // 设置主键值
        category.setId(id);
        // 调用CategoryService实现修改Category
        categoryService.update(category);
        return new Result(true, StatusCode.OK, "修改成功");
    }

    @PostMapping
    public Result add(@RequestBody Category category) {
        // 调用CategoryService实现添加Category
        categoryService.add(category);
        return new Result(true, StatusCode.OK, "添加成功");
    }

    @GetMapping("/{id}")
    public Result findById(@PathVariable Integer id) {
        //调用CategoryService实现根据主键查询Category
        Category category = categoryService.findById(id);
        return new Result(true, StatusCode.OK, "查询成功", category);
    }

    /**
     *
     * @return list
     */
    @GetMapping
    public Result findAll() {
        //调用CategoryService实现查询所有Category
        List<Category> list = categoryService.findAll();
        return new Result(true, StatusCode.OK, "查询成功", list);
    }
}

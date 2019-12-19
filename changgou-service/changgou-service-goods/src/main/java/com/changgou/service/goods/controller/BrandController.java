package com.changgou.service.goods.controller;

import com.changgou.common.entity.Result;
import com.changgou.common.entity.StatusCode;
import com.changgou.service.api.goods.pojo.Brand;
import com.changgou.service.goods.service.BrandService;
import com.github.pagehelper.Page;
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
import java.util.Map;

/**
 * @author oliver
 */
@RequestMapping("/brand")
@RestController
@CrossOrigin
public class BrandController {

    @Resource
    private BrandService brandService;

    @GetMapping
    public Result findList() {
        List<Brand> brandList = brandService.findList();
        return new Result(true, StatusCode.OK, "查询成功", brandList);
    }

    @PostMapping("/findPage/{page}/{size}")
    public Result findPage(@RequestBody Map<String, Object> searchMap,
                           @PathVariable(value = "page") int page,
                           @PathVariable(value = "size") int size) {
        Page<Brand> brands = brandService.findPage(searchMap, page, size);
        return new Result(true, StatusCode.OK, "成功", brands);
    }

    @PostMapping("/searchPage/{page}/{size}")
    public Result findPage(@RequestBody Brand brand,
                           @PathVariable(value = "page") Integer pageNum,
                           @PathVariable(value = "size") Integer size) {
        PageInfo<Brand> pageInfo = brandService.findPage(brand, pageNum, size);
        return new Result(true, StatusCode.OK, "条件查询品牌集合成功！", pageInfo);
    }
}

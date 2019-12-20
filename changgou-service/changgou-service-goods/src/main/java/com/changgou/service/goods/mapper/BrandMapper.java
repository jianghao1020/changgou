package com.changgou.service.goods.mapper;

import com.changgou.service.api.goods.pojo.Brand;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author oliver
 */
public interface BrandMapper extends Mapper<Brand> {

    /**
     * 根据分类名称查询品牌列表
     *
     * @param categoryName 分类名称
     * @return list
     */
    @Select("SELECT name,image FROM tb_brand where id in( SELECT brand_id FROM tb_category_brand WHERE category_id in ( SELECT id from tb_category where name=#{categoryName}))")
    List<Map<String, Object>> findBrandListByCategoryName(@Param("categoryName") String categoryName);

    /**
     * 根据分类id查询品牌集合
     *
     * @param categoryId categoryId
     * @return list
     */
    @Select("select * from tb_brand tb,tb_category_brand tcb where tb.id = tcb.brand_id and tcb.category_id = #{categoryId}")
    List<Brand> findBrandByCategoryId(Integer categoryId);
}

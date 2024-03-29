package com.changgou.service.api.goods.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author oliver
 */
@Table(name = "tb_category")
@Data
public class Category implements Serializable {

    /**
     * 分类ID
     */
    @Id
    private Integer id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 商品数量
     */
    private Integer goodsNum;

    /**
     * 是否显示
     */
    private String isShow;

    /**
     * 是否导航
     */
    private String isMenu;

    /**
     * 排序
     */
    private Integer seq;

    /**
     * 上级ID
     */
    private Integer parentId;

    /**
     * 模板ID
     */
    private Integer templateId;
}

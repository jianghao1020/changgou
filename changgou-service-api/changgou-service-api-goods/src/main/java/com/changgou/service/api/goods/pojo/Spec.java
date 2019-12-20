package com.changgou.service.api.goods.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author oliver
 */
@Table(name = "tb_spec")
@Data
public class Spec implements Serializable {

    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 规格选项
     */
    private String options;

    /**
     * 排序
     */
    private String seq;

    /**
     * 模板ID
     */
    private Integer templateId;
}

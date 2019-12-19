package com.changgou.service.api.goods.pojo;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * para实体类
 *
 * @author oliver
 */
@Table(name = "tb_para")
@Data
@ToString
public class Para implements Serializable {

    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 选项
     */
    private String options;

    /**
     * 排序
     */
    private Integer seq;

    /**
     * 模板ID
     */
    private Integer templateId;
}

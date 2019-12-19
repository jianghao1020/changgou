package com.changgou.service.api.goods.pojo;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author oliver
 */
@Table(name="tb_template")
@Data
@ToString
public class Template implements Serializable {

    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 模板名称
     */
    private String name;

    /**
     * 规格数量
     */
    private Integer specNum;

    /**
     * 参数数量
     */
    private Integer paraNum;
}

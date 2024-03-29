package com.changgou.service.api.goods.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author oliver
 */
@Table(name = "tb_album")
@Data
public class Album implements Serializable {

    /**
     * 编号
     */
    @Id
    private Long id;

    /**
     * 相册名称
     */
    private String title;

    /**
     * 相册封面
     */
    private String image;

    /**
     * 图片列表
     */
    private String imageItems;
}

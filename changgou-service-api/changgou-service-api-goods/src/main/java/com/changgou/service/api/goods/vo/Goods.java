package com.changgou.service.api.goods.vo;

import com.changgou.service.api.goods.pojo.Sku;
import com.changgou.service.api.goods.pojo.Spu;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * 商品信息组合对象
 *
 * @author oliver
 * @date 2019/12/20 14:22
 */
@Getter
@Setter
@Data
public class Goods implements Serializable {

    private Spu spu;

    private List<Sku> skuList;
}

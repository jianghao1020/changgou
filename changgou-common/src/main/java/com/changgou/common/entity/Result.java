package com.changgou.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author oliver
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    /**
     * 是否成功
     */
    private boolean flag;

    /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回消息
     */
    private String message;

    /**
     * 返回数据
     */
    private Object data;

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }
}

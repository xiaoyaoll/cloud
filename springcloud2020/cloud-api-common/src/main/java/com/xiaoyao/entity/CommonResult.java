package com.xiaoyao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author liulei
 * @date 2020/3/27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable{

    private int     code;

    private String  message;

    private T       data;

    public CommonResult(int code,String message){
        this(code,message,null);
    }

}

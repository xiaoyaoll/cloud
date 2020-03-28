package com.xiaoyao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author liulei
 * @date 2020/3/27
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment implements Serializable{

    private long    id;

    private String  name;

}

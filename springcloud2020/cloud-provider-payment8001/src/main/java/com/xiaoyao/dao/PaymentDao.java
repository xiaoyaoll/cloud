package com.xiaoyao.dao;

import com.xiaoyao.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author liulei
 * @date 2020/3/27
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment get(@Param("id") long id);

}

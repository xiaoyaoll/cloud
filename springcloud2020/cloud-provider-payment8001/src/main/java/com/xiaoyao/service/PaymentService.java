package com.xiaoyao.service;

import com.xiaoyao.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public int create(Payment payment);

    public Payment get(long id);

}

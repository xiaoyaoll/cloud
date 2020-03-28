package com.xiaoyao.service;

import com.xiaoyao.entity.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment get(long id);

}

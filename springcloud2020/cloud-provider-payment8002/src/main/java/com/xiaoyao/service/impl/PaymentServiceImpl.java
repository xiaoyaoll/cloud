package com.xiaoyao.service.impl;

import com.xiaoyao.dao.PaymentDao;
import com.xiaoyao.entity.Payment;
import com.xiaoyao.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liulei
 * @date 2020/3/27
 */

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment get(long id) {
        return paymentDao.get(id);
    }
}

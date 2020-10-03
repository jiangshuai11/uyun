package com.uyun.service.impl;


import com.uyun.entity.Payment;
import org.springframework.stereotype.Service;
import com.uyun.dao.PaymentDao;
import com.uyun.service.PaymentService;

import javax.annotation.Resource;

/**
 * @program: com.uyun
 * @description:
 * @author: 姜帅
 * @create: 2020-09-20 18:05
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById( Long id){

        return paymentDao.getPaymentById(id);

    }
}

package com.uyun.service;

import com.uyun.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: com.uyun
 * @description:
 * @author: 姜帅
 * @create: 2020-09-20 18:03
 */
public interface PaymentService {

    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取
}

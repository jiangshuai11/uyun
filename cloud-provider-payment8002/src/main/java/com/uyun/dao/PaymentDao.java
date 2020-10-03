package com.uyun.dao;

import com.uyun.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: com.uyun
 * @description:
 * @author: 姜帅
 * @create: 2020-09-20 17:58
 */
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}

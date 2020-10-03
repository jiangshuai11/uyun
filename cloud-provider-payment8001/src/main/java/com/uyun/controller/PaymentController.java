package com.uyun.controller;

import com.uyun.common.CommonResult;
import com.uyun.entity.Payment;
import com.uyun.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: com.uyun
 * @description:
 * @author: 姜帅
 * @create: 2020-09-20 18:06
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        AtomicInteger atomicInteger = new AtomicInteger();
        log.info("*****插入结果："+result);
        if (result>0){  //成功
            System.out.println("插入数据库成功,我是8001");
            return new CommonResult(200,"插入数据库成功,我是8001",result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果："+payment);
        if (payment!=null){  //说明有数据，能查询成功
            return new CommonResult(200,"查询成功,我是8001",payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询ID："+id,null);
        }
    }
}


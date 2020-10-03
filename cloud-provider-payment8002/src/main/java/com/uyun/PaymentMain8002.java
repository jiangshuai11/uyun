package com.uyun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: com.uyun
 * @description:
 * @author: 姜帅
 * @create: 2020-09-20 17:23
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.uyun.dao")
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}

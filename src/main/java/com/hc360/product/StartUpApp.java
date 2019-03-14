package com.hc360.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 启动类
 */
@SpringBootApplication
@ServletComponentScan
@EnableFeignClients
@EnableDiscoveryClient
@EnableCircuitBreaker
@MapperScan("com.hc360.product.dao")
public class StartUpApp {


    public static void main(String[] args) {
        SpringApplication.run(StartUpApp.class, args);
    }
}

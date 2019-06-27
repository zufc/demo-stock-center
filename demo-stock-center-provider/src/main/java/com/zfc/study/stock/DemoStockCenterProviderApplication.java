package com.zfc.study.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author zufeichao
 * @Description //TODO
 * @Date 9:33 2019/6/26
 * EnableDiscoveryClient 用于启动服务发现功能
 * EnableFeignClients 用于启动Fegin功能
 **/
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class DemoStockCenterProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoStockCenterProviderApplication.class, args);
    }

}

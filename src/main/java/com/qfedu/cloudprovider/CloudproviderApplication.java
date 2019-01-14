package com.qfedu.cloudprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.qfedu.cloudprovider.mapper")
public class CloudproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudproviderApplication.class, args);
        System.out.println("111111");
    }
}

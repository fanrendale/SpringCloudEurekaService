package com.xjf.springcloudeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动服务注册中心
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServiceApplication.class, args);
    }

}

package com.changgou.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 声明当前的工程是eureka的注册中心
 *
 * @author oliver
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    /**
     * 加载启动类
     *
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}

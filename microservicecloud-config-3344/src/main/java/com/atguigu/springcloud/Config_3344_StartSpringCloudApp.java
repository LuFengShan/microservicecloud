package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring Cloud 配置中心
 * 
 */
@SpringBootApplication
@EnableConfigServer // 开启服务配置中心
public class Config_3344_StartSpringCloudApp {
	public static void main(String[] args) {
		SpringApplication.run(Config_3344_StartSpringCloudApp.class, args);
	}
}

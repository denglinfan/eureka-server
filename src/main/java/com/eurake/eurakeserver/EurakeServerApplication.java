package com.eurake.eurakeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 通过使用注解@EnableEurekaServer启动一个服务注册中心提供给其他应用进行对话
 */
@EnableEurekaServer
@SpringBootApplication
public class EurakeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakeServerApplication.class, args);
	}
}

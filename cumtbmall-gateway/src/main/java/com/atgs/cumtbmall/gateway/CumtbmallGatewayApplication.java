package com.atgs.cumtbmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.开启服务注册发现
 */
@EnableDiscoveryClient
//排除和数据库相关的依赖
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CumtbmallGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CumtbmallGatewayApplication.class, args);
	}

}

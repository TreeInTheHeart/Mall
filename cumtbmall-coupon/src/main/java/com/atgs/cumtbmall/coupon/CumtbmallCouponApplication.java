package com.atgs.cumtbmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.atgs.cumtbmall.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class CumtbmallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(CumtbmallCouponApplication.class, args);
	}

}

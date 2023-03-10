package com.atgs.cumtbmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.atgs.cumtbmall.order.dao")
@SpringBootApplication
public class CumtbmallOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CumtbmallOrderApplication.class, args);
	}

}

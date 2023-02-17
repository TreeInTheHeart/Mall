package com.atgs.cumtbmall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.atgs.cumtbmall.ware.dao")
@SpringBootApplication
public class CumtbmallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(CumtbmallWareApplication.class, args);
	}

}

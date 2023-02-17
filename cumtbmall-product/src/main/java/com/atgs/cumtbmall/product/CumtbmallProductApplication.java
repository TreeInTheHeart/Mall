package com.atgs.cumtbmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.整合Mybatis-Plus
 *  （1）导入依赖
 *  （2）配置
 *  	1.配置数据源
 *  		1）Maven导入数据库驱动
 *  		2)在application.yml配置数据源相关信息
 *  	2.配置Mybatis-plus
 *  		1)使用@MapperScan配置扫描范围
 *  		2）告诉Mybatis-plus，sql映射文件在哪里
 *
 *2、逻辑删除
 * 1）、配置全局的逻辑删除规则(省略)
 * 2）、配置逻辑删除的组件Bean(省略)
 * 3)、给bean加上逻辑删除注
 */
//配置扫描范围
@MapperScan("com.atgs.cumtbmall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class CumtbmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(CumtbmallProductApplication.class, args);
	}

}

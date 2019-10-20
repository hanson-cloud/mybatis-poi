package com.hanson.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.PropertySource;

//@EnableCaching
@SpringBootApplication
//@EnableAutoConfiguration
@MapperScan("com.hanson.mybatis.dao")
public class MybatisPoiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisPoiApplication.class, args);
	}

}

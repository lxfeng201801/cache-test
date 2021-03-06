package com.xyyh.ehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EhCacheApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EhCacheApplication.class, args);
	}
}

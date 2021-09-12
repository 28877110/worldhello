package org.learn.worldhello;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.learn.worldhello.mapper")
public class WorldHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldHelloApplication.class, args);
	}

}

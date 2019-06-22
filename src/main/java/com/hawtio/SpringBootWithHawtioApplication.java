package com.hawtio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.hawtio.config.WebConfig;

@SpringBootApplication
@Import({WebConfig.class})
@ComponentScan("com.hawtio")
public class SpringBootWithHawtioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithHawtioApplication.class, args);
	}

}

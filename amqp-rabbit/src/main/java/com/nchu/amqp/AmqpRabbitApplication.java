package com.nchu.amqp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class AmqpRabbitApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AmqpRabbitApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(AmqpRabbitApplication.class, args);
	}
}

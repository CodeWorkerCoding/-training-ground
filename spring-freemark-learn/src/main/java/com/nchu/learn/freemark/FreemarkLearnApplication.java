package com.nchu.learn.freemark;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/2 18:22
 */

@SpringBootApplication
@MapperScan(basePackages = {"com.nchu.learn.freemark.repo"})
public class FreemarkLearnApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FreemarkLearnApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FreemarkLearnApplication.class);
    }
}

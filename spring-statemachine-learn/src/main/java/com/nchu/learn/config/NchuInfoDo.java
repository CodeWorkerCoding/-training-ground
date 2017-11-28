package com.nchu.learn.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * nchu 配置信息
 *
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/28 20:53
 */
@Data
@ConfigurationProperties(prefix = "com.nchu.info")
public class NchuInfoDo {

    private  Integer order;

    private String name;

    private Integer capacity;

    private Address address;


    @Data
    private class Address {
        private String province;

        private String city;

        private String district;

        private String zipCode;

        private String location;
    }
}


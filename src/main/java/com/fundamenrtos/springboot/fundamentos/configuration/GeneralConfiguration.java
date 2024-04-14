package com.fundamenrtos.springboot.fundamentos.configuration;

import com.fundamenrtos.springboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamenrtos.springboot.fundamentos.bean.MyBeanWithPropertiesImplement;
import com.fundamenrtos.springboot.fundamentos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class GeneralConfiguration {


    @Value("${value.name}")
    private String name;
    @Value("${value.apellido}")
    private String apellido;
    @Value("${value.random}")
    private String random;


    @Bean
    public MyBeanWithProperties funtion(){
        return new MyBeanWithPropertiesImplement(name, apellido);
    }

}

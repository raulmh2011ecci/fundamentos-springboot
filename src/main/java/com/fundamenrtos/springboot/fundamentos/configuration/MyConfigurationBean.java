package com.fundamenrtos.springboot.fundamentos.configuration;

import com.fundamenrtos.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public MyBean myBeanOperation(){
        return new MyBean2Implement();
    }
    @Bean
    public MyOperation beanOperation(){
        return new MyOperationNumber();
    }

    @Bean
    public MyBeanWithDependency beanOperationWithDependency(MyOperation beanOperation){

        return new MyBeanWithDependencyImplement(beanOperation);
    }
}

package com.fundamenrtos.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency{


    @Override
    public  void saludar(){
        System.out.println("holla world desde dependencia 2 ");
    }

}

package com.fundamenrtos.springboot.fundamentos.bean;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{


    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);
    private MyOperation myOperation;


    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }




    @Override
    public void printWithDependency() {
        LOGGER.info("sumando");

        int numero = 1 ;
        LOGGER.debug("el numero enviado"+ numero);
        System.out.println(myOperation.sum(numero));
        System.out.println("hola desde la implementacion de un bean con dependencia");
    }
}

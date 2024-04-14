package com.fundamenrtos.springboot.fundamentos.bean;

public class MyOperationNumber implements MyOperation{
    @Override
    public int sum(int number) {
        return number +1 ;
    }
}

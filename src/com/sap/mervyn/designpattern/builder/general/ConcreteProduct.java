package com.sap.mervyn.designpattern.builder.general;

public class ConcreteProduct extends Builder {
    private final Product product = new Product();

    @Override
    public void setPart() {
        // 产品内的逻辑处理
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}

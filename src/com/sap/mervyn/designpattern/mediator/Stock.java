package com.sap.mervyn.designpattern.mediator;

public class Stock extends AbstractColleague {

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    private static int computerNumber = 100;

    public void increase(int number) {
        computerNumber += number;
        System.out.println("库存数量为：" + computerNumber);
    }

    public void decrease(int number) {
        computerNumber -= number;
        System.out.println("库存数量为：" + computerNumber);
    }

    public int getStockNumber() {
        return computerNumber;
    }

    public void clearStock() {
        System.out.println("清理库存数量为：" + computerNumber);
        super.mediator.execute("stock.clear");
    }

}

package it.albertomosconi.designpatters.command;

import it.albertomosconi.designpatters.Pattern;

public class CommandPattern implements Pattern {
    @Override
    public void execute() {
        System.out.println("COMMAND PATTERN");

        Stock stockABC = new Stock("ABC");

        BuyStockOrder buyStockOrder = new BuyStockOrder(stockABC);
        SellStockOrder sellStockOrder = new SellStockOrder(stockABC);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();

        System.out.println();
    }

    @Override
    public String toString() {
        return "Command Pattern";
    }
}

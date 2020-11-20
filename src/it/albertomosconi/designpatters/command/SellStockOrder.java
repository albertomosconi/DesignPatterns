package it.albertomosconi.designpatters.command;

public class SellStockOrder implements IOrder {
    private Stock stock;

    public SellStockOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}

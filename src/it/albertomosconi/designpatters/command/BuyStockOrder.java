package it.albertomosconi.designpatters.command;

public class BuyStockOrder implements IOrder {
    private Stock stock;

    public BuyStockOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}

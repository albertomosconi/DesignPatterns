package it.albertomosconi.designpatters.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<IOrder> orderList = new ArrayList<>();

    public void takeOrder(IOrder order) {
        orderList.add(order);
    }

    public void placeOrders() {

        for (IOrder order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}

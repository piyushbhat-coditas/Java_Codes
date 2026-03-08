package Assignment_Week4;

import java.util.List;

public class OrderLogic {
    public static double totalRevenue(List<Order> orders) {
        return orders.stream()
                .mapToDouble(Order::amount)
                .sum();
    }

    public static List<Order>getPremiumOrders(List<Order> orders){
        return orders.stream()
                .filter(order -> order.amount() > 5000)
                .toList();

    }

    public static double applyDiscount(Order order){
        double discount = switch (order.type()){
            case ONLINE -> order.amount()*0.10;
            case OFFLINE -> order.amount()*0.05;
        };
        return order.amount() - discount;
    }
}

package Assignment_Week4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderLogic service = new OrderLogic();

        List<Order> orders = List.of(
                new Order(1, "Piyush Bhat", 20000, OrderType.ONLINE),
                new Order(3, "Prajwal", 15000, OrderType.OFFLINE),
                new Order(4, "Kere Saab", 2490, OrderType.ONLINE),
                new Order(5, "Sadha Bhai", 1056, OrderType.OFFLINE)
        );
        double revenue = OrderLogic.totalRevenue(orders);
        System.out.println("Total Revenue: " +revenue);

        System.out.println("Premium Orders: ");
        OrderLogic.getPremiumOrders(orders)
                .forEach(System.out::println);

        System.out.println("Discounted Offers:");
        for(Order order1 : orders){
            double finalPrice = OrderLogic.applyDiscount(order1);
            System.out.println(
                    order1.customerName() + " Final Price: " + finalPrice
            );
        }




        String log = LogFormatter_4.formatLog("AdminUser", "SUCCESS");
        System.out.println("\n" + log);
    }
}

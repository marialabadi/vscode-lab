package org.example;

public class OrderProcessor {
    public void printOrderSummary(Order order) {
        // نستخدم الدوال التي استخرجناها (Extracted Methods)
        double totalPrice = calculateTotalPrice(order);

        if (order.getCustomer().isMember()) {
            totalPrice = applyMemberDiscount(totalPrice);
        }

        printHeader(order.getCustomer().getName());
        printItems(order);
        System.out.printf("Total Final Price: $%.2f%n", totalPrice);
    }

    // استخراج منطق الحساب
    private double calculateTotalPrice(Order order) {
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    // استخراج منطق الخصم
    private double applyMemberDiscount(double price) {
        return price * 0.9;
    }

    // استخراج منطق الطباعة
    private void printHeader(String name) {
        System.out.println("--- Order Summary ---");
        System.out.println("Customer: " + name);
    }

    private void printItems(Order order) {
        for (Item item : order.getItems()) {
            double itemTotal = item.getQuantity() * item.getPrice();
            System.out.println("  - " + item.getName() + ": " + item.getQuantity() + " x $" + item.getPrice() + " = $" + itemTotal);
        }
    }
}
 

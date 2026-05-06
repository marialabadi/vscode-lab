package org.example;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // 1. إنشاء زبون (Maria عضو في النادي)
        Customer customer = new Customer("Maria", true);

        // 2. إنشاء بعض المشتريات
        Item item1 = new Item("Laptop", 1200.00, 1);
        Item item2 = new Item("Mouse", 25.00, 2);

        // 3. إنشاء الطلب وجمع العناصر فيه
        Order order = new Order(customer, Arrays.asList(item1, item2));

        // 4. تشغيل المعالج لطباعة الفاتورة
        OrderProcessor processor = new OrderProcessor();
        processor.printOrderSummary(order);
    }
}ٍ
 package org.example;

public class Calculator {
    
    // قمنا بتغيير أسماء المتغيرات (a, b) إلى (num1, num2) لتصبح واضحة
    // وتغيير (calc) إلى اسم يعبر عن وظيفة الدالة
    public double calculateSumAndProductRatio(double num1, double num2) {
        double sum = num1 + num2;
        double product = num1 * num2;
        
        if (product == 0) return 0; // حماية من القسمة على صفر
        
        return sum / product;
    }

    // تغيير (prtRes) إلى (printResult)
    public void printResult(double result) {
        System.out.println("Result: " + result);
    }
}

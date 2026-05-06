 package mecheri.informatique;

public class App {

    public double calculateSum(double num1, double num2) {
        return num1 + num2;
    }

    public double calculateProduct(double num1, double num2) {
        return num1 * num2;
    }

    public double calculateRatio(double sum, double product) {
        if (product == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return sum / product;
    }

    public void displayResult(double result) {
        System.out.println("The final result is: " + result);
    }

    public static void main(String[] args) {
        App myApp = new App();

        double sum = myApp.calculateSum(10, 5);
        double product = myApp.calculateProduct(10, 5);
        double result = myApp.calculateRatio(sum, product);

        myApp.displayResult(result);
    }
}
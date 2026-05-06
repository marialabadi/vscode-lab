 package mecheri.informatique;
public class App {

    public double calculateSumProductRatio(double num1, double num2) {
        double sum = num1 + num2;
        double product = num1 * num2;
         
        if (product == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        
        return sum / product;
    }
 
    public void displayResult(double result) {
        System.out.println("The final result is: " + result);
    }

    public static void main(String[] args) {
        App myApp = new App();
        double res = myApp.calculateSumProductRatio(10, 5);
        myApp.displayResult(res);
    }
}
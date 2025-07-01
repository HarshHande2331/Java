class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

public class Adddiv {
    public static void main(String[] args) {
        Calculator HarshCalc = new Calculator();

        int a = 10, b = 2;

        System.out.println("Harsh's Add: " + harshCalc.add(a, b));
        System.out.println("Harsh's Subtract: " + harshCalc.subtract(a, b));
        System.out.println("Harsh's Multiply: " + harshCalc.multiply(a, b));
        System.out.println("Harsh's Divide: " + harshCalc.divide(a, b));
    }
}

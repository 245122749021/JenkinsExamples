public class BasicArithmetic {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        // Addition
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = num1 * num2;
        System.out.println("Product: " + product);

        // Division
        double quotient = (double) num1 / num2; // Cast to double for accurate division
        System.out.println("Quotient: " + quotient);

        // Modulus (Remainder)
        int remainder = num1 % num2;
        System.out.println("Remainder: " + remainder);

        //Demonstrating increment and decrement

        int counter = 0;

        counter++; // post increment. counter is now 1.
        System.out.println("Counter after increment: " + counter);

        ++counter; // pre increment. counter is now 2.
        System.out.println("Counter after pre-increment: " + counter);

        counter--; // post decrement. counter is now 1.
        System.out.println("Counter after decrement: " + counter);

        --counter; // pre decrement. counter is now 0.
        System.out.println("Counter after pre-decrement: " + counter);

        //Demonstrating compound assignment operators.

        int value = 10;

        value += 5; // value = value + 5; value is now 15.
        System.out.println("value += 5: " + value);

        value -= 3; // value = value - 3; value is now 12.
        System.out.println("value -= 3: " + value);

        value *= 2; // value = value * 2; value is now 24.
        System.out.println("value *= 2: " + value);

        value /= 4; // value = value / 4; value is now 6.
        System.out.println("value /= 4: " + value);

        value %= 3; // value = value % 3; value is now 0.
        System.out.println("value %= 3: " + value);

    }
}

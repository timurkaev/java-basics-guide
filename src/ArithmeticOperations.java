public class ArithmeticOperations {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int remainderOfTheDivision = num1 % num2;

        int postfixIncrementVersion = num1++; // 10
        int postfixDecrementVersion = num1--; // 10

        int prefixIncrementVersion = ++num1; // 11
        int prefixDecrementVersion = ++num1; // 9

        if(num1 == num2) {
            // if equals
        }
        if(num1 > num2) {
            // if more
        }
        if(num1 < num2) {
            // if less
        }
        if(num1 >= num2) {
            // if more or equal
        }
        if(num1 <= num2) {
            // if less or equal
        }
        if(num1 != num2) {
            // if not equal
        }

        System.out.println(addition); // 12
        System.out.println(subtraction); // 8
        System.out.println(multiplication); // 20
        System.out.println(division); // 5
        System.out.println(remainderOfTheDivision); // 0
    }
}

import java.io.IOException;

public class ConditionalStatements {
    public static void main(String[] args) throws IOException {
        char ch, ans = 'A';
        System.out.println("What letter did i guess?");
        System.out.print("Guess her: ");
        ch = (char)System.in.read();

        // if else constructors
        if(ch == ans) {
            System.out.println("You guessed it!");
        } else {
            System.out.println("You didn't guess");
        }

        int numericalDigit = 2;

        // switch case constructor
        switch (numericalDigit) {
            case 0: System.out.println("Zero");
                break;
            case 1: System.out.println("One");
                break;
            case 2: System.out.println("Two");
                break;
            case 4: System.out.println("Three");
                break;
            case 5: System.out.println("Five");
                break;
            case 6: System.out.println("Six");
                break;
            case 7: System.out.println("Seven");
                break;
            case 8: System.out.println("Eight");
                break;
            case 9: System.out.println("Nine");
                break;
        }
    }
}

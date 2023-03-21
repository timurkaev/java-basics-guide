public class Cycles {
    public static void main(String[] args) {
        // for cycle
        for(int i = 0; i < 10; i++) {
            System.out.println("for " + i);
        }

        // while
        int count = 0;
        while(count < 10) {
            System.out.println("while " + count);
            count++;
        }

        // do while
        int count2 = 0;
        do {
            System.out.println("do while" + count2);
            count2++;
        } while (count2 < 10);
    }
}

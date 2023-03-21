public class Variables {
    // static означает, то переменная принадлежит конкертно этому классу и должна использоваться конкретно в этом классе
    static int number = 141;

    // public означает, что переменная станет достуна только для других классов
    public int number2 = 10;

    // final делает из нашей переменной константу
    static final int number3 = 2;
    public static void main(String[] args) {
        number = 333; // good
        // number3 = 222; -> error
    }

}

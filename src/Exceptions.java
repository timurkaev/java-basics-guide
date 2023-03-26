public class Exceptions {

    public static void main(String[] args) {
        int[] nums = new int[5];

        try {
            System.out.println("Start");
            nums[7] = 10;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc);
        }
        catch (ArithmeticException exc) {
            System.out.println(exc);
        }
    }

    // ArrayStoreException -> Несовместимый тип
    // ArrayIndexOutOfBoundsException -> Переполнение массива
    // ClassCastException -> Недопустимое приведение типов
    // IllegalAccessException -> Недопустимый параметр при вызове метода
    // NegativeArraySizeException -> Недопустимы отрицательные числа в массиве
    // NullPointerException -> Несуществующий метод объекта
    // TypeNotPresentException -> Неизвестный тип
    // UnsupportedOperationException ->  Операция не поддерживается
    // ClassNotFoundException -> Класс не найден
    // InstantiationException -> когда приложение пытается создать экземпляр класса, используя newInstance метод в классе Class , но указанный объект класса нельзя инстанцировать.
}


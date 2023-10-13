public class Runner3 {
    public static void main(String[] args) {
        int intValue = 0; //объявление целочисленной переменной
        //по соглашениям примитивные переменные при объявлении
        // обязательно должны быть проинициализированы

        //при попытке вывода не проинициализированной переменной
        //получаем синтаксическую ошибку
        System.out.println(intValue);

        byte byteValue = (byte) 150;//ошибки нет, но хранится -106
        short shortValue = 15;
        long longValue = 1500;

        System.out.println(byteValue);

        longValue = 3000000000l;//l - компилятор примет это значение как long
        // по умолчанию компилятор все целые числа в коде воспринимает как int

        byte b1 = 2;
        byte b2 = 3;

        //продвижение типов данных в арифметических выражениях
        //byte, short, int -> int
        //byte, short, int, long -> long
        byteValue = (byte) (b1 + b2);
        longValue = intValue + longValue;

        //по умолчанию компилятор все вещественные числа в коде
        //воспринимает как double
        float floatValue = 3.6f;// f - компилятор примет это значение как float

        //byte, short, int, float -> float
        //byte, short, int, long, float -> float
        //byte, short, int, long, float, double -> double

        double doubleValue = 4.9;

        char s1 = 'g';

        boolean f1 = true;

        //final величины можно проинициализировать только один раз
        final int SIZE;
        SIZE = 10;
        //SIZE = 15; ошибка, нельзя переприсвоить final величину

        System.out.println("переменая int: " + intValue);
        doubleValue = 10 / 3;//выделяется целая часть от деления
        System.out.println("doubleValue: " +doubleValue);
        doubleValue = (double) 10/3.;//для получения вещественного результата
        // при делении двух целочисленных значений необходимо хотя бы один из
        // участников преобразовать к double
        System.out.println("doubleValue: " +doubleValue);

        System.out.printf("doubleValue %.2f%n", doubleValue); //2f - вывод двух
        // знаков после занятой, %n - для перехода на след строку

        System.out.printf("%d %d %d %d %f %f %c %b %s%n", byteValue, shortValue,
                intValue, longValue, floatValue, doubleValue, s1, f1, "Строка");
    }
}

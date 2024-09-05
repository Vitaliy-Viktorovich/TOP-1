public class Main {
    public static void main(String[] args) {


        byte countRunCycleForField; //объявление переменой
        countRunCycleForField = 127; //инициализация переменой

        byte countRunCycleForField2 = 122;
        short myShort = 127;  // camel case
        short my_short = 127; //snake case напримур SQL

        int myInt = 2_000_000_000;
        long myLong = 3_000_000_000L;

        float myFloat = 3.0f;
        double myDouble = 3.0;

        char myChar = 'a';

        boolean myBoolean = false;





        int i = 100;
        double d = 28.3;
        byte b =60;
        float f= 13;
        short s = 52;
        long l = 14;
        char a = 120;
        boolean c = i > b;

        int Sum = (int) (i+ d);          // сложение
        int difference = (int) (b - f); //Вычитание
        int product = (int) (s * l);    //умножение
        int quotient = a / b;          //Деление
        int remainder = b % s;        //Остаток от деления

        System.out.println("сложение (double): " + Sum);
        System.out.println("Вычитание (double): " + difference);
        System.out.println("умножение (double): " + product);
        System.out.println("Деление (double): " + quotient);
        System.out.println("Остаток от деления (double): " + remainder);
        System.out.println(c);

            }
    }
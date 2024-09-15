package Homework;

import java.util.Scanner;
import java.util.Random;
public class Homework {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.nextInt();

        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();



       Random random = new Random();

        int a = random.nextInt();
        int b = random.nextInt();
        int c = random.nextInt();
        int d = random.nextInt();

        char charaA = (char) ('0' + a);
        char charB = (char) ('0' + b);
        char charC = (char) ('0' + c);
        char charD = (char) ('0' + d);

        System.out.println("Пароль: " + charaA + charB + charC + charD);


        long mylong = 2_000_000_000;
        int i1 = (int) mylong;
        System.out.println("mylong" + mylong);
        System.out.println(i1 + "int");



    }


}




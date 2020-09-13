package task3;

import java.util.Scanner;

public class Calk {
    public static void calk()  {
        //дробное число 1
        /** @param one input one*/
        System.out.println("введите своё дробное число");
        Scanner scanner = new Scanner(System.in);
        double one = scanner.nextDouble();


        System.out.println("введите знак: сложение '+', вычитание '-'," + "умножение '*', деление '/', другие символы не допускаются ");
        Scanner sum = new Scanner(System.in);
        String symbol = sum.nextLine();


        //дробное число 2
        /**@param two input two*/
        System.out.println("введите второе число");
        double two = scanner.nextDouble();




        scanner.close();
        scanner.close();
        vivod(one, two, symbol);
    }

    public static void vivod(double one, double two, String symbol) {
        if (symbol.equals("+")) {
            //  Cумма
            System.out.printf("Cумма : %.4f", one + two);
            // деление
        } else if (symbol.equals( "/")) {
            System.out.printf("деление: %.4f", one / two);
            // вычетание
        } else if (symbol.equals( "-")) {
            System.out.printf("вычетание: %.4f", one - two);
            // Умножение
        } else if (symbol.equals( "*")) {
            System.out.printf("Умножение: %.4f", one * two);
        } else

            System.out.println("вы ввели не верный символ, введите только + - * /");

    }
}

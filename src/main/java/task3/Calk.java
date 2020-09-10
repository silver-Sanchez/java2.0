package task3;

import java.util.Scanner;

public class Calk {
    public static void calk()  {
        System.out.println("введите своё дробное число");

        Scanner scanner = new Scanner(System.in);

        double one = scanner.nextDouble();
        //дробное число 1
        /** @param one input one*/

        System.out.println("введите второе число");
        double two = scanner.nextDouble();
        //дробное число 2
        /**@param two input two*/

        System.out.println("введите знак: сложение '+', вычитание '-'," +
                "умножение '*', деление '/', другие символы не допускаются ");
        /** @param znak input  math operation symbol*/



        Scanner scanner1 = new Scanner(System.in);
        String symbol = scanner1.nextLine();



        scanner.close();
        scanner1.close();


        System.out.printf("Cумма чисел: %.4f", one + two);

    }
}

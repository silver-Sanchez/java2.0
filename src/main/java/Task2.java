import java.util.Scanner;


//Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
//        Использовать комментарии и JavaDoc при описании метода. Использовать форматирование при выводе
//        результата в консоль. Полученный результат округлять до 4-х знаков после запятой.


public class Task2 {
    public static void main(String[] args) throws Exception {
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

package task7;

import java.util.Scanner;


//Задание №7
//Добавить обработку исключений в задание с ООП калькуляторам (например, исключение может возникнуть при делении на ноль)


public class Calculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("введите своё дробное число");
            double one = scanner.nextDouble();


            System.out.println("введите знак: сложение '+', вычитание '-'," + "умножение '*', деление '/', другие символы не допускаются ");
            char operaciya = scanner.next().charAt(0);
            Operation operation = new Operation();


            System.out.println("введите второе дробное число");
            double two = scanner.nextDouble();
            Numeric bNumber = new Numeric();
            Numeric aNumber = new Numeric();

            bNumber.setNumber(two);
            aNumber.setNumber(one);


            operation.setOper(operaciya);
            operation.setResult(one, two, operaciya);

        }
 catch (RuntimeException e)
        {
            System.out.println("ошибка работы. " + e.getLocalizedMessage());
        }

}

}

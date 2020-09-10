package task3;
import java.util.Scanner;

//Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.

public class task3 {
    public static void main(String[] args) {

        System.out.println("номер задачи (1 - калькулятор, 2 - массив)");

        Scanner scanner = new Scanner(System.in);
        int numberTask = scanner.nextInt();

        if (numberTask == 1) {
            Calk.calk();

        } else if (numberTask == 2) {
            Array.arrays();

        } else {
            System.out.println("данная задача еще не реализована");
        }
    }
}

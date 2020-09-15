package task4;

public class Task4 {

    /**
     * Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
     * Найти максимальный отрицательный и минимальный положительный элементы массива.
     * Поменять их местами.
    * */

    public static void main(String[] args) {


        /**
         * Массив размерностью 20
         * */
        int[] array = new int[20];

        /**
         * заполняется случайными целыми числами от -10 до 10
         */

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 21) - 10;
        }


        /**
         * Вывод первого массива
         */
       System.out.println("первый массив \n");
        for (int point : array) {
            System.out.print(point + " ");
        }

        int minArray = 10;
        int maxArray = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (maxArray > array[i]) {
                    maxArray = array[i];

                }
            } else if (array[i] > 0) {
                if (minArray > array[i]) {
                    minArray = array[i];

                }
            }
        }

        System.out.println("\n \nмаксимальное отрицательное число: [" + maxArray + "]");

        System.out.println("\nминимальное положительное число: [" + minArray + "]");


        /**
         * Вывод Второго массива
         */
       System.out.println("\n Второго массив \n");
        for (int point : array) {
            System.out.print(point + " ");
        }
    }
}

package task6;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//Задание №6:
//
//        Есть входной файл с набором слов, написанных через пробел
//        Необходимо:
//        Прочитать слова из файла.
//        Отсортировать в алфавитном порядке.
//        Посчитать сколько раз каждое слово встречается в файле.       Вывести статистику на консоль
//        Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле

public class Main {



    public static void main(String[] args) {
        Scanner myScanner;
        try
        {
            myScanner = new Scanner(new File("D:\\MYjava\\first\\src\\main\\java\\task6\\text.txt"));  //прочитать слова из файла.
        }
        catch (IOException exc)
        {
            System.out.println("Ошибка: " + exc);
            return;
        }



        Map<String, Integer> slova = new TreeMap<>();


        int max = 0;
        String maxWord = null;
        while (myScanner.hasNext()) {
            String word = myScanner.next();
            int counter = slova.getOrDefault(word, 0);
            counter++;
            if (counter > max) {
                max = counter;
                maxWord = word;
            }

            slova.put(word, counter);
        }


        System.out.println("Отсортировать в алфавитном порядке: " + slova.keySet());


        System.out.println("Посчитать сколько раз каждое слово встречается в файле:");

        for (Map.Entry<String, Integer> entry : slova.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue() + " раз");
        }



        System.out.println("айти слово с максимальным количеством повторений: " + maxWord + " (" + max + " повтора)");

    }
}

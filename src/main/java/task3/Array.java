package task3;
import java.util.Scanner;

//        задать массив слов.Размерность массива произвольна, задается в консоли.
//        После чего в консоли вводятся слова в количестве равном заданной длине массива.
//        В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль


public class Array {
    public static void arrays() {

        System.out.println("задать число массива слов");
        Scanner scannertxt = new Scanner(System.in);
        //задать массив слов

        int n = scannertxt.nextInt();
        String[] arrayTxt = new String[n];
        Scanner scannerone = new Scanner(System.in);



        for (int i = 0; i < arrayTxt.length; i++) {
            System.out.println("введите " + (i + 1) + "-e слово");

            arrayTxt[i] = scannerone.nextLine();
        }
        //массив слов


        for (String a : arrayTxt) {
            System.out.println(a);
        }
        int maxTxt = 0;

        String txt = null;

        for (int i = 0; i < arrayTxt.length; i++) {
            if (maxTxt < arrayTxt[i].length()) {
                maxTxt = arrayTxt[i].length();
            txt = arrayTxt[i];
            }
        }
        //найти самое длинное слово

        System.out.println("самое длинное слово " + txt);



        scannertxt.close();
        scannerone.close();
    }
}

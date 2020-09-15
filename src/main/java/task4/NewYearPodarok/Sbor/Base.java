package task4.NewYearPodarok.Sbor;

import task4.NewYearPodarok.Sbor.Podarki.Candys;
import task4.NewYearPodarok.Sbor.Podarki.Kinder;
import task4.NewYearPodarok.Sbor.Podarki.Setc;
import task4.NewYearPodarok.Sbor.Podarki.Toys;



//        Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
//        У каждой сладости есть название, вес, цена и свой уникальный параметр.
//        Необходимо собрать подарок из сладостей. Найти общий вес подарка,
//                общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.

public class Base {

    public static void main(String[] args) {
        Candys candy = new Candys("alenka", 22.22, 2.2, "nuts");
        Kinder kinder = new Kinder("milk", 20.01, 1.2, "standart");
       Toys toys = new Toys("japan", 10.01, 10.2, "red");



        Setc[] box = {candy, kinder, toys};

        //  содержит
        System.out.println("подарок содержит: ");
        for (Setc gift : box) {
            System.out.println(gift.toString());
        }

        //  цена
        double allPrice = 0;
        for (int i = 0; i < box.length; i++) {
            allPrice = allPrice + box[i].getPrice();
        }
        System.out.println("стоимость подарка: " + allPrice);


        //  Вес
        double allWeight = 0;
        for (Setc gift: box) {
            allWeight = allWeight + gift.getWeight();
        }
        System.out.println("Oбщий вес подарка: " + allWeight);
    }
}

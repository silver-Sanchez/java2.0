package task4.NewYearPodarok.Sbor.Podarki;

public class Toys extends Setc {
    private String color;


    public Toys (String made, double price, double weight, String color) {

        super(made, price, weight);
        this.color = color;
    }



    @Override
    public String toString() {
        return " ★ Игрушка  ➤ " + super.toString() + ", цвет = " + color + "";
    }
}

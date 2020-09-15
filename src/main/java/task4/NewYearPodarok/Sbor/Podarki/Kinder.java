package task4.NewYearPodarok.Sbor.Podarki;

public class Kinder extends Setc {
    private String size;

    public Kinder (String made, double price, double weight, String size) {
        super(made, price, weight);
        this.size = size;
    }



    @Override
    public String toString() {
        return " ★ Киндер  ➤ " + super.toString() + ", размер = " + size + "";
    }
}

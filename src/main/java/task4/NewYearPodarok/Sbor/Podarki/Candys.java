package task4.NewYearPodarok.Sbor.Podarki;


public class Candys extends Setc{

    private String filling;

    public Candys(String name, double price, double weight, String filling) {

        super(name, price, weight);
        this.filling = filling;
    }



    @Override
    public String toString() {
        return " ✪ Конфеты ➤ " + super.toString() + ", начинка = " + filling + "";
    }
}

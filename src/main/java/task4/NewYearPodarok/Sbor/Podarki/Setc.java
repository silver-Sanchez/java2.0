package task4.NewYearPodarok.Sbor.Podarki;

public class Setc {

    private String made;
    private double price;
    private double weight;


    public Setc(String made, double price, double weight) {
        this.made = made;
        this.price = price;
        this.weight = weight;
    }

    // MADE
    public String getMade() {
        return made;
    }


    // price
    public double getPrice() {
        return price;
    }


    // weight
    public double getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "название = " + made + ", цена = " + price + ", вес = " + weight;
    }
}

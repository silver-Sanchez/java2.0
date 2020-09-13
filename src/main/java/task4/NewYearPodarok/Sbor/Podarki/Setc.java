package task4.NewYearPodarok.Sbor.Podarki;

public class Setc {

    private String made;
    private double price;
    private double weight;

    public Setc() {}

    public Setc(String made, double price, double weight) {
        this.made = made;
        this.price = price;
        this.weight = weight;
    }

    // MADE
    public String getMade() {
        return made;
    }
    public void setMade(String made) {
        this.made = made;
    }

    // price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // weight
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "производства = " + made + ", цена = " + price + ", вес = " + weight;
    }
}

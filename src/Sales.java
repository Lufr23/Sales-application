public class Sales implements Comparable<Sales> {

    private String product;
    private double value;


    public Sales (String product, double value) {
        this.product = product;
        this.value = value;
    }

    public double getValue() {
        return value;
    }


    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Sales : product = " + product + "value =" + value;
    }

    @Override
    public int compareTo(Sales otherSales) {
        return Double.valueOf(this.value).compareTo(Double.valueOf(otherSales.value));
    }
}


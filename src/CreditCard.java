import java.util.ArrayList;

public class CreditCard {
    private double limitCard;
    private double balance;

    ArrayList<Sales> sales;

    public CreditCard (double limitCard){
        this.limitCard = limitCard;
        this.balance= limitCard;
        this.sales = new ArrayList<>();
    }

    public boolean releaseSale(Sales sale){
        if(this.balance> sale.getValue()){
            this.balance -= sale.getValue();
            this.sales.add(sale);
            return true;
        }
        return false;
    }

    public double getLimitCard() {
        return limitCard;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Sales> getSales() {
        return sales;
    }

}


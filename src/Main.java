import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double limit = 2500.00;
        CreditCard card = new CreditCard(2500.00);

        int sair =1;
        while (sair != 0){

            System.out.println("Choose your option: \n");
            System.out.println("1. Pay for a purchase ");
            System.out.println("2. Take a statement");

            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();

            switch (choose){
                case 1 :
                    System.out.println("Describe your purchase:");
                    String product = scanner.next();
                    System.out.println("Enter the purchase price: ");
                    double price = scanner.nextDouble();

                    Sales sale = new Sales(product,price);
                    boolean releaseSales = card.releaseSale(sale);

                    if (releaseSales){
                        System.out.println("Credit card purchase of R$  " + sale.getValue() +" successful.");
                       // System.out.println("Type 0 to exit and 1 to continue");
                        //sair = scanner.nextInt();
                    }else{
                        System.out.println("Insufficient balance ");
                        sair =0;
                    }
                    break;
                case 2:
                    System.out.println("            EXTRACT            ");
                    System.out.println("*******************************\n");
                    Collections.sort(card.getSales());

                    System.out.println(card.getSales());
                   for (Sales c : card.getSales()) {
                        System.out.println(c.getProduct() + "-"+ "Total R$" + c.getValue());
                   }
                    System.out.println("*******************************\n");

                    System.out.println("Invoice amount: " + (card.getLimitCard()- card.getBalance()));
                    System.out.println("Limit avaiable: " + card.getBalance());
                    break;
            }
        }

    }
}

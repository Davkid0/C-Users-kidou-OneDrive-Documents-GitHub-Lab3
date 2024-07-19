import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int i = 0;
        double newPrice;
        Customer jack = new Customer();
        order newOrder = new order();
        newOrder.price = 20;
        newOrder.quantity = 0;
        jack.ord = newOrder;
        jack.name = "jack";
        while(i == 0)
        {



            System.out.println("what the price of the new article of jack? ");
            Scanner scan2 = new Scanner(System.in);
            newPrice = scan2.nextDouble();

            jack.ord.price += newPrice;
            jack.ord.quantity ++;
            QuantityObserver notif = new QuantityObserver();
            jack.ord.obs = notif;
            PriceObserver notif2 = new PriceObserver();
            jack.ord.obs = notif2;
            notif.update(jack.ord);
            notif2.update(jack.ord);
            System.out.println("add new article to jack ? y/n");
            Scanner scan = new Scanner(System.in);
            String continu = scan.nextLine();
            System.out.println(continu);

            System.out.println("You entered: '" + continu + "'");

            if (continu.equalsIgnoreCase("n")) {
                i = 1;
                break;
            } else if (continu.equalsIgnoreCase("y")) {
                System.out.println("Adding another article...");
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        }
    }
}

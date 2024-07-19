public class PriceObserver implements orderobserver
{

    @Override
    public void update(order ord) {
        System.out.println("Price change: " + ord.getTotalPrice());
    }
}

public class QuantityObserver implements orderobserver{
    @Override
    public void update(order ord) {
        System.out.println("Quantity change: " + ord.getCount());
    }
}

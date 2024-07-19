public class order {

    public orderobserver obs;
    public int quantity;
    public double price = 0;



    public void attach(orderobserver ords)
    {
        obs = ords;
    }
    public void detach()
    {
        obs = null;
    }

    public double getTotalPrice()
    {
        double finalPrice = 0;
        double deliver = 0;
        double Promoprice = 0;
        System.out.println(price);
        if (quantity < 5)
        {
            deliver = 10;
        }

        System.out.println(deliver);
        if (price > 200.0)
        {
            Promoprice = 20;
        }
        System.out.println(Promoprice);

        finalPrice = deliver + price - Promoprice;

        return finalPrice;
    }

    public int getCount()
    {
        return quantity;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

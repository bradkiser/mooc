public class Main{
    public static void main(String[] args) {
        // Storehouse store = new Storehouse();
        // store.addProduct("milk", 3, 10);
        // store.addProduct("coffee", 5, 6);
        // store.addProduct("buttermilk", 2, 20);
        // store.addProduct("jogurt", 2, 20);

        // System.out.println("products:");
        // for (String product : store.products()) {
        //     System.out.println(product);
        // }

        // Purchase purchase = new Purchase("milk", 4, 2);
        // System.out.println( "the total price of a purchase containing four milks is " + purchase.price() );
        // System.out.println( purchase );
        // purchase.increaseAmount();
        // System.out.println( purchase );

        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("buttermilk", 2);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");
            
    }
}
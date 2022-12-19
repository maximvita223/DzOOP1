import java.util.ArrayList;

public class les1 {
    public static void main(String[] args) {
        ArrayList<Product> productLst = new ArrayList<>();
        VendingMachineHotDrinks hotVenMach = new VendingMachineHotDrinks(productLst);
        Product coffee = new HotDrinksProduct("Coffee", 5, 50, 0, 0.3f, 50);
        Product greenTea = new HotDrinksProduct("Green Tea", 4, 40, 1, 0.5f, 40);
        Product blackTea = new HotDrinksProduct("Black tea", 5, 50, 2, 0.4f, 60);
        productLst.add(coffee);
        productLst.add(greenTea);
        productLst.add(blackTea);
        System.out.println(hotVenMach);
        hotVenMach.getMoney(100);
        hotVenMach.getProduct(1);
        hotVenMach.getProduct(0);
    }

}
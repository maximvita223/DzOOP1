import java.util.ArrayList;

public class VendingMachineHotDrinks implements VendingMachine {
    private ArrayList<Product> hotDrinks;
    private int cash;

    public VendingMachineHotDrinks(ArrayList<Product> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    @Override
    public void fullPrice(int index) {
        System.out.println(hotDrinks.get(index));

    }

    @Override
    public void getMoney(int cash) {
        System.out.printf("Баланс состовляет = %d\n", cash);
        this.cash = cash;

    }

    @Override
    public void getProduct(int index) {
        if (hotDrinks.get(index).getPrice() <= cash) {
            cash -= hotDrinks.get(index).getPrice();
            System.out.printf("Возьмите ваш = %s\n", hotDrinks.get(index).getName());
            System.out.printf("Ваш баланс составляет = %d\n", cash);
        }

    }

    @Override
    public String toString() {
        return "VendingMachineHotDrinks [hotDrinks=" + hotDrinks + "]";
    }

}

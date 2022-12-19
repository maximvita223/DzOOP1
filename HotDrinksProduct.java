public class HotDrinksProduct extends Product {
    private float volume;
    private int temperature;

    public HotDrinksProduct(String name, int amount, int price, int position, float volume, int temperature) {
        super(name, amount, price, position);
        this.volume = volume;
        this.temperature = temperature;
    }

    public float getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getPosition() {
        return super.getPosition();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return super.toString() + " volume = " + volume + " temperature = " + temperature;
    }

}

package implementation;

public class Checkout {
    private int total;
    public void add(int itemCount, int price) {
        total += itemCount * price;
    }

    public int total() {
        return total;
    }
}
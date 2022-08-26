public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min(int max) {
        int min = max;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
}
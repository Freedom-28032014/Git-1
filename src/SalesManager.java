public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min(long max) {
        long min = max;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
}
public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{});
        long max = salesManager.max();
        System.out.println(max);
        long min = salesManager.min(max);
        long sum = 0;
        for (long s : salesManager.sales) {
            sum += s;

        }
        long length = salesManager.sales.length;
        System.out.println(croppedMedium(min, max, sum, length));
    }

    public static long croppedMedium(long max, long min, long sum, long lenght) {
        if (lenght == 1) {
            return sum;
        }
        if (lenght == 2) {
            return sum / 2;

        }
        return (sum - (max + min) / (lenght - 2));

    }

}

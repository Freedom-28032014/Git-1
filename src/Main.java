public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{});
        int max = salesManager.max();
        System.out.println(max);
        int min = salesManager.min(max);
        int sum = 0;
        for (int s : salesManager.sales) {
            sum += s;

        }
        int length = salesManager.sales.length;
        System.out.println(croppedMedium(min, max, sum, length));
    }

    public static int croppedMedium(int max, int min, int sum, int lenght) {
        if (lenght == 1) {
            return sum;
        }
        if (lenght == 2) {
            return sum / 2;

        }
        return (sum - (max + min) / (lenght - 2));

    }

}

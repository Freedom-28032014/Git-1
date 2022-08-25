public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{});
        long max = salesManager.max();
        System.out.println(max);
    }
}
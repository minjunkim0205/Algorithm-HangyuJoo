public class Example01 {
    public static void main(String[] args) {
        System.err.print(factorial1(5));
    }

    public static int factorial1(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return (n * factorial1(n - 1));
        }
    }
}

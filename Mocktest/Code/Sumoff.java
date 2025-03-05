package Code;

public class Sumoff {
    public static int sumD(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10)+sumD(n / 10);
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum of digits of " + num+ " is: " +sumD(num));
    }
}

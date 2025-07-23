public class Strong{
    // Precompute factorials for digits 0–9
    private static final int[] FACTORIAL = new int[10];
    static {
        FACTORIAL[0] = 1;
        for (int i = 1; i < 10; i++) {
            FACTORIAL[i] = FACTORIAL[i - 1] * i;
        }
    }

    // Check if a number is strong
    public static boolean isStrong(int num) {
        int original = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += FACTORIAL[digit];
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println("Strong numbers from 1 to 5000:");
        for (int i = 1; i <= 5000; i++) {
            if (isStrong(i)) {
                System.out.println(i);
            }
        }
    }
}
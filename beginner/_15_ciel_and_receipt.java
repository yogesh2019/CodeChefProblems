package beginner;
import java.util.Scanner;
public class _15_ciel_and_receipt {
    public static int arr[] = new int[12];

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int num = 0;
        arr[0] = 1;
        while (++num < 12) {
            arr[num] = 2 * arr[num - 1];
        }
        while (T-- > 0) {
            int n = in.nextInt();
            System.out.println(menu(n));
        }
        in.close();
    }

    public static int menu(int n) {
        // System.out.println(n);
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (n >= arr[i]) {
                int n1 = n / arr[i];
                n = n - (arr[i] * n1);
                sum = sum + n1;
            }
        }
        return sum;
    }
}
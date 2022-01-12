package beginner;

import java.util.Scanner;;

public class _13_mahasena {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num[] = new int[2];
        while (n-- > 0) {
            int weapon = in.nextInt();
            if (weapon % 2 == 0) {
                num[0]++;
            } else {
                num[1]++;
            }
        }
        if (num[0] > num[1]) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }
        in.close();

    }
}

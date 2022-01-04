
import java.util.*;

class _6_the_lead_game {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int winner;
        int lead[] = new int[2];
        int diff;
        int a = 0;
        int b = 0;
        while (num-- > 0) {
            a += in.nextInt();
            b += in.nextInt();
            diff = a - b;
            if (diff > 0) {
                winner = 1;
            } else {
                winner = 2;
                diff *= -1;
            }
            if (diff > lead[1]) {
                lead[1] = diff;
                lead[0] = winner;
            }

            diff = 0;
        }
        System.out.println(lead[0] + " " + lead[1]);
        in.close();
    }

}

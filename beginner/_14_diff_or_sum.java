package beginner;
import java.util.Scanner;
public class _14_diff_or_sum {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		System.out.println(n1 > n2 ? (n1 - n2): (n1 + n2));
        in.close();
	}
}

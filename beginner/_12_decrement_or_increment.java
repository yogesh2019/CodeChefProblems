package beginner;
import java.util.Scanner;
public class _12_decrement_or_increment{
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(n%4 == 0 ? ++n : --n);
        in.close();
	}
}
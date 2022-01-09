package beginner;
import java.util.Scanner;
public class _10_valid_triangle {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		while(num-- > 0){
		    int a = in.nextInt();
		    int b = in.nextInt();
		    int c = in.nextInt();
		    System.out.println( a + b + c == 180 ? "YES" : "NO");
		    
		}
		in.close();
	}
}

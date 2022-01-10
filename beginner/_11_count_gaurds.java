package beginner;
import java.util.Scanner;
public class _11_count_gaurds{
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-- > 0){
		    int a = in.nextInt();
		    int b = in.nextInt();
		    int min = a < b ? b : a;
		    int max = a + b;
		    System.out.println(min + " " + max);
		    
		}
        in.close();
	}
}

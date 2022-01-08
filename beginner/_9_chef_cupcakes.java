package beginner;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class _9_chef_cupcakes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-- > 0){
		    int muffin = in.nextInt();
		    System.out.println((muffin/2)+1);
		}
        in.close();
	}
}

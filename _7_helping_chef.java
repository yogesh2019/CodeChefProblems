
import java.util.*;

public class _7_helping_chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
        int a=sc.nextInt();
        if(a<10)
            System.out.println("Thanks for helping Chef!");
        else    
             System.out.println("-1");
        }
        sc.close();
	}
}

import java.util.*;

public class _8_chef_and_oprt
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-->0){
		    int n1 = in.nextInt();
		    int n2 = in.nextInt();
		    if(n1 > n2){
		        System.out.println(">");
		    }
		    else if(n1 == n2){
		        System.out.println("=");
		    }
		    else{
		         System.out.println("<");
		    }
		    
		}
        in.close();
	}
}

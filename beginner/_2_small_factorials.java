package beginner;

import java.util.*;
import java.math.BigInteger;
public class _2_small_factorials {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-- > 0){
		    int num = in.nextInt();
		    BigInteger mul = BigInteger.valueOf(num);
		    while(--num > 0){
		        mul = mul.multiply(BigInteger.valueOf(num));
		    }
		    System.out.println(mul);
		}
		in.close();
		
	}
}

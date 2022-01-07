package beginner;

import java.util.*;
import java.io.*;

public class _5_small_factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader in = new FastReader();
		FastWriter out = new FastWriter();
		int num = in.nextInt();
		while(num-- > 0){
		    int fact = in.nextInt();
		    double res = fact;
		    
		    while(--fact > 0){
		        res*=fact;
		    }
		    if(res == 0)
		    {
		        res = 1;
		    }
		    out.println((int)res);
		}
		out.close();
	}
	static class FastReader{
	    BufferedReader br ;
	    StringTokenizer st ;
	    public FastReader(){
	        br = new BufferedReader(new InputStreamReader(System.in));
	        st = null;
	    }
	    String next(){
	        while(st == null || !st.hasMoreTokens()){
	            try{
	                st = new StringTokenizer(br.readLine());
	            }catch (IOException e){
	                e.printStackTrace();
	            }
	        }
	        return st.nextToken();
	    }
	    int nextInt(){
	        return Integer.parseInt(next());
	    }
	    double nextDouble(){
	        return Double.parseDouble(next());
	    }
	}
	static class FastWriter{
	    BufferedWriter bw ;
	   public FastWriter(){
	       this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
	   }
	   public void print(Object object) throws IOException {
			bw.append("" + object);
		}
	   public void println(Object object) throws IOException{
	        print(object);
	        bw.append("\n");
	    }
	    public void close() throws IOException {
			bw.close();
		}
	}
}

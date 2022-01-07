package beginner;
/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.lang.Math;

/* Name of the class has to be "Main" only if the class is public. */
class _3_sqrt_root
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    FastReader in = new FastReader();
            FastWriter out = new FastWriter();
		    int t = in.nextInt();
		    while(t-->0){
		        int sqrt = (int)Math.round(Math.sqrt(in.nextInt()));
		        out.println(sqrt);
		    }
		}catch(Exception e){
		    return;
		}
	}
	static class FastReader{
	    BufferedReader br ;
	    StringTokenizer st;
	    
	    public FastReader(){
	        br = new BufferedReader(new InputStreamReader(System.in));
	    }
	    String next(){
	        while(st == null || !st.hasMoreTokens()){
	            try{
	                st = new StringTokenizer(br.readLine());
	            }catch(IOException e){
	                e.printStackTrace();
	            }
	           
	        }
	        return  st.nextToken();
	    }
	     int nextInt(){
            return Integer.parseInt(next());
        }
        
	}
	static class FastWriter{
	    private final BufferedWriter bw;
	    public FastWriter(){
	        this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    }
	    public void print(Object object) throws IOException{
	        bw.append(""+object);
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

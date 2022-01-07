package beginner;
import java.util.*;
import java.io.*;

public class _3_T_sort{
	static final long mod =1000000007;
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            
            //int testCases=in.nextInt();
           // while(testCases-- > 0)
           // {
            	int n =in.nextInt();
            	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
                 for (int i=0;i<n;i++)
                 {   int k=in.nextInt();
                	 pq.add(k);
                 }
                 for (int i=0;i<n;i++)
                 {
                	 out.println(pq.poll());
                	 
                 }
                
            	   
              // }
            
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}


// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		Scanner s=new Scanner(System.in);
// 		    int n=s.nextInt();
// 		    int arr[]=new int[n];
// 		    for(int j=0;j<n;j++)
// 		    {
// 		        arr[j]=s.nextInt();
// 		    }
// 		    Arrays.sort(arr);
// 		    for(int j=0;j<n;j++)
// 		    {
// 		        System.out.println(arr[j]);
// 		    }
		
// 	}
// }


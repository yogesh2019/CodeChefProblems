package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1_Enormous_Input{
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);
        int n = in.nextInt();
        int k = in.nextInt();
        int ans = 0;
        while(n-- > 0){
            int x = in.nextInt();
            if(x % k == 0){
                ans++;
            }
        }
        System.out.println(ans);
        // System.out.println(n);
    }
    static class InputReader{
        public BufferedReader reader ;
        public StringTokenizer tokenizer;
        public InputReader(InputStream inputStream){
            reader = new BufferedReader(new InputStreamReader(inputStream),32768);
            tokenizer = null;
        }
        private String next() {
            while(tokenizer == null || !tokenizer.hasMoreTokens()){
                try{
                    tokenizer = new StringTokenizer(reader.readLine());
                    // tokenizer = new StringTokenizer(reader.readLine(),",");
                    // System.out.println(tokenizer.countTokens());
                }catch(IOException e){
                    throw new RuntimeException(e);
                }
            };
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        
    }
}

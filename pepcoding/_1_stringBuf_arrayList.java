
public class _1_stringBuf_arrayList {
    public static void main(String[] args) {
        String a = "abcd";
        for(int i = 0 ; i < a.length() ; i++){           
            for(int j = i+1; j <= a.length() ; j ++){
                System.out.println(a.substring(i, j));
            }
        }
    }
}
// declare    
// memory      stack saves s and heap saves hello, not just a char array
// input          next(), nextLine()
// output
// charAT and length
// non setchar
// substring   abcd 1,4 will give bcd 1,1 will give blank only startpoint till end
// string adds with + and characters can be added to simple string (ex s += " " s += 10 and 
// left to right  hello + 10 + 20 = hello1020     and 10 + 20 + hello = 30hello)
// s.split(" ") gives a array


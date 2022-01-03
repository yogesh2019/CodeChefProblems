
import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class _4_second_largest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-- > 0){
            PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
            pQueue.add(in.nextInt());
            pQueue.add(in.nextInt());
            pQueue.add(in.nextInt());
            pQueue.poll();
            System.out.println(pQueue.peek());
        }
        in.close();
	}
}


/* Minimum-cost-of-ropes
java program for minimum cost of ropes*/
//Given n ropes of length l add last two values and sum as min cost and then do so on
import java.util.*;
public class Gold
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
	    PriorityQueue<Integer> queue=new PriorityQueue<>();
	    for(int i=0;i<n;i++)
	    {
	        queue.add(a[i]);
	    }
	    int sum=0;
	    int temp1,temp2;
	    while(queue.size()>=2)
	    {
	       temp1= queue.poll();
	       temp2=queue.poll();
	       sum+=temp1+temp2;
	       queue.add(temp1+temp2);
	        
	    }
	    System.out.println(sum);
	}
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
public class Test
{
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		
		int N=sc.nextInt();
		int K=sc.nextInt();
		
		int arr []=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		int diff=MaxDiff(N,K,arr);
		System.out.println(diff);
	}
	public static int MaxDiff(int n,int k,int [] arr)
	{
		int A=0;
		int B=0;
		Arrays.sort(arr);
		
		for(int i=0;i<n;i++)
		{
			if(i<k)
			{	
				A=A+arr[i];
			}
			else
			{
				B=B+arr[i];
			}
		}
		if(A>B)
		{
			return A-B;
		}
		else
		{
			return B-A;
		}
	}
}
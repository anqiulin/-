package hello2;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int [100]; 
		for(int i=1;i<=n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println(F(n,a));
		
	}
	public static int F(int n,int[] arr)
	{
		int b=0,sum=0;
		if(n>0) 
		{
			
			for(int i=1;i<=n;i++)
			{
				if(b>0)
					b=b+arr[i];
				else
					b=arr[i];
				if(b>sum)
					sum=b;
			}
			return sum;
		}
		else
			return 0;
	}

}

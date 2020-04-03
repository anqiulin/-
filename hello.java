package hello2;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		if(n>0) {
		int[] a=new int [100];
		for(int i=1;i<=n;i++)
		{
			a[i]=in.nextInt();
		}
		int b=0,sum=0;
		for(int i=1;i<=n;i++)
		{
			if(b>0)
				b+=a[i];
			else
				b=a[i];
			if(b>sum)
				sum=b;
		}
		System.out.println(sum);
		}
		else
			System.out.println("0");
	}

}

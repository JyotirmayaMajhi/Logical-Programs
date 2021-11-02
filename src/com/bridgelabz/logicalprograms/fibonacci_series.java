package com.bridgelabz.logicalprograms;

public class fibonacci_series {
	static int fib(int n)
    {
		int f[] = new int[n + 2];
		int i;
		
		f[0]=0;
		f[1]=1;
		
		for(i=2;i<=n;i++)
		{
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];
    }
		
	public static void main(String[] args) {
		
		System.out.println("Fibonacci Series is: ");
		int N = 10;
		for (int i = 0; i < N; i++)
           System.out.print(fib(i) + " ");
	}

}

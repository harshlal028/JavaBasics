package com.java.test1;

public class Factorial {
	
	public int factorial1(Integer n)
	{
		int res = 1;
		while(n != 1)
		{
			res = res*n;
			n--;
		}
		return res;
	}
	
	public int factorial(Integer n)
	{
		int res = 1;
		int max_val = 19;
		
		if(n == null)
		{
			res = -1;
		}
		else if(n == 0 || n == 1)
		{
			res = 1;
		}
		else if(n>1)
		{
			if(n <= max_val)
			{
				while(n != 1)
				{
					res = res*n;
					n--;
				}
			}
			else
			{
				res = -1;
			}
		}
		else if(n < 0)
		{
			res = -1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		//System.out.println(positiveCaseObjectEmpty(obj));
		//System.out.println(positiveCaseObjectSpace(obj));
		//System.out.println(positiveCaseIntObjectSpace(obj));
		//System.out.println(positiveCaseIntObjectExp(obj));

	}
}

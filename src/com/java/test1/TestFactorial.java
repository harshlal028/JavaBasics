package com.java.test1;

public class TestFactorial {
	
	public static void main(String[] args) {
		
		Factorial obj = new Factorial();
		
		System.out.println(positiveCaseInt(obj)?"PASS":"FAIL");
		System.out.println(positiveCaseIntPlus(obj)?"PASS":"FAIL");
		System.out.println(positiveCaseIntZero(obj)?"PASS":"FAIL");
		System.out.println(positiveCaseIntObject(obj)?"PASS":"FAIL");
		System.out.println(positiveCaseIntObjectZero(obj)?"PASS":"FAIL");
		System.out.println(positiveCaseZero(obj)?"PASS":"FAIL");
		System.out.println(positiveCaseOne(obj)?"PASS":"FAIL");
		System.out.println(negativeCase(obj)?"PASS":"FAIL");
		System.out.println(negativeCaseZero(obj)?"PASS":"FAIL");
		//System.out.println(negativeCaseObject(obj)?"PASS":"FAIL");
		System.out.println(edgeCaseMax(obj)?"PASS":"FAIL");
		System.out.println(edgeCaseMax2(obj)?"PASS":"FAIL");
	}
	
	/* Submit positive value */
	public static boolean positiveCaseInt(Factorial obj)
	{
		if(obj.factorial(5) == 120)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/* Submit positive value */
	public static boolean positiveCaseIntPlus(Factorial obj)
	{
		if(obj.factorial(+5) == 120)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/* Submit positive value */
	public static boolean positiveCaseIntZero(Factorial obj)
	{
		if(obj.factorial(05) == 120)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/* Submit not null object */
	public static boolean positiveCaseIntObject(Factorial obj)
	{
		Integer i = new Integer(5);
		if(obj.factorial(i) == 120)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/* Submit not null object */
	public static boolean positiveCaseIntObjectZero(Factorial obj)
	{
		Integer i = new Integer("05");
		if(obj.factorial(i) == 120)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	/* Submit integer value at lower boundary [ 0 ] */
	public static boolean positiveCaseZero(Factorial obj)
	{
		if(obj.factorial(0) == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/* Submit integer value at lower boundary +1 [ 1 ] */
	public static boolean positiveCaseOne(Factorial obj)
	{
		if(obj.factorial(1) == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/* Submit integer value at upper boundary -1 */
	public static boolean negativeCase(Factorial obj)
	{
		if(obj.factorial(-1) == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/* Submit integer value at upper boundary -1 */
	public static boolean negativeCaseZero(Factorial obj)
	{
		if(obj.factorial(-01) == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/* Submit null object */
	public static boolean negativeCaseObject(Factorial obj)
	{
		if(obj.factorial(null) == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/* Submit null object */
	public static boolean edgeCaseMax(Factorial obj)
	{
		if(obj.factorial(Integer.MAX_VALUE) == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/* Submit null object */
	public static boolean edgeCaseMax2(Factorial obj)
	{
		if(obj.factorial(19) > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/* Submit null object */
	public static boolean edgeCaseMax3(Factorial obj)
	{
		if(obj.factorial(20) == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//*****************************************
	/* Submit not null object */
	public static boolean positiveCaseObjectEmpty(Factorial obj)
	{
		Integer i = new Integer("");
		if(obj.factorial(i) == 120)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/* Submit not null object */
	public static boolean positiveCaseObjectSpace(Factorial obj)
	{
		Integer i = new Integer(" ");
		if(obj.factorial(i) == 120)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/* Submit not null object */
	public static boolean positiveCaseIntObjectSpace(Factorial obj)
	{
		Integer i = new Integer("5 ");
		if(obj.factorial(i) == 120)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/* Submit not null object */
	public static boolean positiveCaseIntObjectExp(Factorial obj)
	{
		Integer i = new Integer("5e");
		if(obj.factorial(i) == 120)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}

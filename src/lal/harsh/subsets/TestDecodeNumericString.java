package lal.harsh.subsets;

/**
 * This is a test suite for testing {@link DecodeNumericString}
 * @author harsh
 *
 */
public class TestDecodeNumericString {
	
	public static boolean testNonCharacter(DecodeNumericString obj)
	{
		if(0 == obj.decodeString("123!!").size())
			return true;
		else
			return false;
	}
	
	public static boolean testZeroesAll(DecodeNumericString obj)
	{
		if(0 == obj.decodeString("00000").size())
			return true;
		else
			return false;
	}
	
	public static boolean testZeroes1(DecodeNumericString obj)
	{
		if(0 == obj.decodeString("01010").size())
			return true;
		else
			return false;
	}
	
	public static boolean testZeroes2(DecodeNumericString obj)
	{
		if(0 == obj.decodeString("1010100").size())
			return true;
		else
			return false;
	}
	
	public static boolean testZeroes3(DecodeNumericString obj)
	{
		if(1 == obj.decodeString("101010").size())
			return true;
		else
			return false;
	}
	
	public static boolean testSpaces(DecodeNumericString obj)
	{
		if(1 == obj.decodeString(" 101010 ").size())
			return true;
		else
			return false;
	}
	
	public static boolean testNull(DecodeNumericString obj)
	{
		if(0 == obj.decodeString(null).size())
			return true;
		else
			return false;
	}
	
	public static boolean testEmpty(DecodeNumericString obj)
	{
		if(0 == obj.decodeString("").size())
			return true;
		else
			return false;
	}
	
	public static boolean testNegativeNumbers(DecodeNumericString obj)
	{
		if(0 == obj.decodeString("-123").size())
			return true;
		else
			return false;
	}
	
	public static boolean testPositiveScenario(DecodeNumericString obj)
	{
		if(5 == obj.decodeString("1123").size())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		DecodeNumericString obj = new DecodeNumericString();
		System.out.println(testNonCharacter(obj)?"PASS":"FAIL");
		System.out.println(testZeroesAll(obj)?"PASS":"FAIL");
		System.out.println(testZeroes1(obj)?"PASS":"FAIL");
		System.out.println(testZeroes2(obj)?"PASS":"FAIL");
		System.out.println(testZeroes3(obj)?"PASS":"FAIL");
		System.out.println(testSpaces(obj)?"PASS":"FAIL");
		System.out.println(testNull(obj)?"PASS":"FAIL");
		System.out.println(testEmpty(obj)?"PASS":"FAIL");
		System.out.println(testNegativeNumbers(obj)?"PASS":"FAIL");
		System.out.println(testPositiveScenario(obj)?"PASS":"FAIL");
	}

}

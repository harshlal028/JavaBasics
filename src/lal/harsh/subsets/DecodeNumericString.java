package lal.harsh.subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contains functionality to find all the possible decoding of a string containing numbers.
 * @author harsh
 *
 */
public class DecodeNumericString {
	
		/**
		 * 
		 * @param prefix - The prefix that has already been decoded.
		 * @param arg - The un-decoded part of the String
		 * @param res - The list containing all the decoded strings
		 */
		private void getDecodedString(String prefix, String arg, List<String> res)
		{
			int arglen = arg.length();
			
			if(0 == arglen) // If nothing is left on the string to be decoded add the prefix to the result
			{
				res.add(prefix);
			}
			else
			{
				if(arglen >=1) // If there is atleast 1 element left to decode 
				{
					int temp = (int)arg.charAt(0);
					if(temp >= 49 && temp <= 57) //Checks if the extracted number is a valid ie. between 1-9
					{
						getDecodedString(prefix+(char)(temp-49+97), arg.substring(1), res);
					}
				}
				if(arglen >=2) //Checks if the extracted number is a valid ie. between 10-26
				{
					
					int temp = Integer.parseInt(arg.substring(0,2));
					if(temp >= 10 && temp <= 26)
					{
						getDecodedString(prefix+(char)(temp-1+ 97), arg.substring(2), res);
					}
				}
			}
		}
		
		/**
		 * 
		 * @param arg - The main string to be decoded
		 * @return - a list of decoded string from the number
		 */
		public List<String> decodeString(String arg)
		{
			List<String> res = new ArrayList<String>();
			if(null != arg)
			{	
				arg = arg.trim();
				if(arg.matches("^[0-9]+$"))
				{
					getDecodedString("", arg, res);
				}
				else
				{
					System.err.println("The string contains non-numeric characters!");
				}
			}
			return(res);
		}
}

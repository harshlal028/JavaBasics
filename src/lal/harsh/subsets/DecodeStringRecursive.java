package lal.harsh.subsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DecodeStringRecursive {
	
	public static List<String> decode(String code) {
	    //Set<String> result = new HashSet<String>();
	    List<String> result = new ArrayList<String>();
	    helper("", code, result);
	    return result;
	}

	public static void helper(String prefix, String code, List<String> result) {

	    int len = code.length();
	    if (len == 0) {
	        result.add(prefix);
	        return;
	    }
	    if (code.charAt(0) == '0')
	        return;

 	    helper(prefix + (char)(code.charAt(0) - '1' + 'a'), code.substring(1), result);

	    if (len >= 2) {
	        int value = Integer.parseInt(code.substring(0, 2));
	        if (value <= 26)
	            helper(prefix + (char)(value - 1 +'a'), code.substring(2), result);
	    }
	}
	
	public static int numDecodings(String s) {
        if(s == null || s.length()==0)
            return 0;
        
        int[] dp = new int[s.length()+1];
        
        dp[0] = 1;
        dp[1] = s.charAt(0)=='0'?0:1;
        
        for(int i = 2; i<= s.length(); i++){
            int first = Integer.valueOf(s.substring(i-1,i));
            int second = Integer.valueOf(s.substring(i-2,i));
            
            if(first>=1 && first<=9)
                dp[i] += dp[i-1];
            if(second>=10 && second<=26)
                dp[i] += dp[i-2];
        }
        
        return dp[s.length()];
    }
	
	public static void main(String[] args) {
		System.out.println(decode("101"));
		System.out.println(numDecodings("101"));
	}

}

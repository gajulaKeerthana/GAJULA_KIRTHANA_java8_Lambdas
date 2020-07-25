package com.epam.lambdas_streams;

import java.util.*;
import java.util.stream.IntStream;
interface Interface{
	void is(List<String> l);
}
public class Palindrome{
	static void isPalindrome(List<String> strings)
    {
        List<String> palindromes=new ArrayList();
        for(String str : strings)
        {String x = str.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0, str.length()/2).noneMatch(j -> str.charAt(j)!= str.charAt(str.length()-j-1)))
                palindromes.add(str);}
        
        System.out.println("Palindromes are : "+palindromes);
    }
	public static void main(String []args) {
		List<String>  strings = new ArrayList<String>();
		strings.add("abba");
		strings.add("abd");
		strings.add("abcba");


		Interface x = Palindrome::isPalindrome;
		x.is(strings);
		
		
	}
}
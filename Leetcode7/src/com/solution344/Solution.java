package com.solution344;

import java.util.Scanner;

public class Solution {
	
	//存在延时问题
    /*public String reverseString(String s) {
    	if(s.equals("")){
    		return s;
    	}
    	
    	char[] s1=s.toCharArray();
    	int len=s.length();
    	String newS="";
    	
    	for(int i=len-1;i>=0;i--){
    		newS=newS+s1[i];
    	}
    	return newS;
    }*/ 
	
	//使用StringBuilder类更快
	public String reverseString(String s) {
		if(s.equals("")){
			return s;
		}
	
		char[] s1=s.toCharArray();
		int len=s.length();
		StringBuilder sb=new StringBuilder();
	
		for(int i=len-1;i>=0;i--){
			sb.append(s1[i]);
		}
		String newS=sb.toString();
		
		return newS;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new Scanner(System.in).nextLine();
		Solution sol=new Solution();
		String newS=sol.reverseString(str);
		System.out.println(newS);
	}
}

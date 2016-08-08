package com.solution14;

import java.util.Scanner;

public class Solution {
	
	public String longestCommonPrefix(String[] strs) {//对数组元素逐个比较共同前缀
		if(strs.length==0)
			return null;
		
		String s=strs[0];//用于比较前缀的基准String
		int a=strs.length;
			for(int i=1;i<a;i++){
				int bit=1;
				if(s.length()==0){
					return null;
				}
				String s1=s.substring(0,bit);
				String s2=strs[i].substring(0, bit);
				while(s1.equals(s2) && bit<s.length()){
					bit++;
					s1=s.substring(0,bit);
					s2=strs[i].substring(0,bit);
				}
				if(bit==s.length())
					s=s1.substring(0,s1.length());
				else
					s=s1.substring(0,s1.length()-1);
			}
		return s;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s=new String[5];
		for(int i=0;i<5;i++){
			s[i]=new Scanner(System.in).nextLine();
		}
		
		Solution sol=new Solution();
		String result=sol.longestCommonPrefix(s);
		System.out.println(result);

	}

}

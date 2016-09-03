package com.solution389;

import java.util.Scanner;

public class Solution {
	//problem 389 比较问题中优先考虑数组标记法，其次数组排序，再次集合类
	public char findTheDifference(String s, String t) {
        int[] re0=new int[26];
        int[] re1=new int[26];
		char result='0';
        
		for(int i=0;i<s.length();i++){
			int k=s.charAt(i)-'a';
			re0[k]++;
        }
		
		for(int i=0;i<t.length();i++){
			int k=t.charAt(i)-'a';
			re1[k]++;
        }
        
		for(int i=0;i<re0.length;i++){
			if(re0[i]!=re1[i]){
				result=(char)(i+(int)'a');
			}
		}
		return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		char n=sol.findTheDifference(s,t);
		System.out.println(n);
		sc.close();
	}
}
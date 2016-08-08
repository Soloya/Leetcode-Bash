package com.solution171;

import java.util.Scanner;

public class Solution {
	
	//ASCIIÖÐA=65
	public int titleToNumber(String s) {
		char[] s1=s.toCharArray();
		int sum=0;
		
		for(int i=0;i<s.length();i++){
			sum=sum*26+(int)s1[i]-64;
		}
		return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		int x=sol.titleToNumber(s1);
		System.out.println(x);
		sc.close();
	}
}

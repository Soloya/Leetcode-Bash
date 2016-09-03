package com.solution09;

import java.util.Scanner;

//22ms
public class Palindrome {
	
    public boolean isPalindrome(int x) {
    	String s=Integer.toString(x);
    	int k=s.length();
    	String[] num=new String[k];
    	for(int i=0;i<k;i++){
    		num[i]=s.substring(i, i+1);
    	}
    	
    	int p=0;
    	while(num[p].equals(num[k-p-1]) && p<=k/2-1){
    		p++;
    	}
    	
    	if(p>k/2-1)
    		return true;
    	else
    		return false;
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		Palindrome exp=new Palindrome();
		Boolean result=exp.isPalindrome(k);
		System.out.println(result);
	}
}
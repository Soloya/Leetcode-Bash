package com.solution09;

import java.util.Scanner;

//10ms
public class Quickmethod {
	
	 public boolean isPalindrome(int x) {
	    	if(x<0)
	    		return false;
	    	
	    	if(x==0)
	    		return true;
	    	
	    	int result=0;
	    	int recent=x;//recent参与生成反向数
	    	while(recent!=0){
	    		int count=recent%10;
	    		result=result*10+count;
	    		recent=recent/10;
	    	}
	    	
	    	if(result==x)
	    		return true;
	    	else
	    		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		Quickmethod exp=new Quickmethod();
		Boolean result=exp.isPalindrome(k);
		System.out.println(result);
	}

}
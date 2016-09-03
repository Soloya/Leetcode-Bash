package com.solution07;

import java.util.Scanner;

//2ms
public class Solution7 {
	
    public int reverse(int x) 
	    {
    		int result=0;
    		int count=0;//中间存储
    		long review=0;//结果
    		
    		while(x!=0){
    			count=x%10;
    			review=review*10+count;
    			x=x/10;//负数除法的商，转换为int型是抹去小数点
    		}
    		
    		if(review>java.lang.Integer.MAX_VALUE || review<java.lang.Integer.MIN_VALUE)
    			result=0;
    		else
    			result=(int)review;
	    	return result;
	    }
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Solution7 rev=new Solution7();
		int y=rev.reverse(x);
		System.out.println(y);
	}
}
package com.solution202;

import java.util.Scanner;

public class Solution {
	//Problem 202	
	public boolean isHappy(int n) {
		int sum=0;
		while(n!=0){
			int a=n%10;
			sum=sum+a*a;
			n=n/10;
		}
		if(sum==1){
			return true;
		}
		if(sum==89){
			return false;
		}
		return isHappy(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();	
		Boolean res=sol.isHappy(m);
		System.out.println(res);
		sc.close();
	}
}
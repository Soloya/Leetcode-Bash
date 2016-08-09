package com.solution342;

import java.util.Scanner;

public class Solution {

	public boolean isPowerOfFour(int num) {
		if(num<=0){
			return false;
		}
		while(num!=1){
			if(num%4!=0){
				return false;
			}
			num=num/4;
		}
		return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=new Scanner(System.in).nextInt();
		Solution sol=new Solution();
		Boolean b=sol.isPowerOfFour(n);
		System.out.println(b);
	}
}

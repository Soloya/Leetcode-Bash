package com.solution326;

import java.util.Scanner;

public class Solution {

	public boolean isPowerOfThree(int n) {
		if(n<=0){
			return false;
		}
		while(n!=1){
			if(n%3!=0){
				return false;
			}
			n=n/3;
		}
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=new Scanner(System.in).nextInt();
		Solution sol=new Solution();
		Boolean b=sol.isPowerOfThree(n);
		System.out.println(b);
	}

}

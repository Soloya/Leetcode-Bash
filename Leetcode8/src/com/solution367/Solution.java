package com.solution367;

import java.util.Scanner;

public class Solution {
	//problem 367
	public boolean isPerfectSquare(int num) {
        double sqrt=Math.sqrt(num);
		if((int)sqrt==sqrt){
        	return true;
        }
		else{
			return false;
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		Boolean x=sol.isPerfectSquare(num);
		System.out.println(x);
		sc.close();
	}
}
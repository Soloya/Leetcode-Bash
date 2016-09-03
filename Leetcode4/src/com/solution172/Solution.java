package com.solution172;

import java.util.Scanner;

public class Solution {
	//problem 172  统计包含因子5的数目，对递归的运用
	public int trailingZeroes(int n) {
		int res=n/5;
		if(res==0){
			return 0;
		}
		if(res==1){
			return 1;
		}
        return res+trailingZeroes(res);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sol.trailingZeroes(m);
		System.out.println(n);
		sc.close();
	}
}
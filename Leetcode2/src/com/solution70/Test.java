package com.solution70;

import java.util.Scanner;

public class Test{
	//problem 70 组合数学递推问题
	public int climbStairs(int n) {
		int res=1;
		int sum=0;
		for(int i=0;i<n;i++){
			int tmp=res;
			res=res+sum;
			sum=tmp;
		}
        return res;
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();		
		int res=test.climbStairs(num);
		System.out.println(res);
		sc.close();
	}
}
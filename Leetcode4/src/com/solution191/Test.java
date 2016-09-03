package com.solution191;

import java.util.Scanner;

public class Test {
	
	public int hammingWeight(int n) {
		String num=Integer.toBinaryString(n);
		char[] arr=num.toCharArray();
		
        int count=0;
		for(char x:arr){
			if(x=='1'){
				count++;
			}
		}
		return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Test test=new Test();
		int res=test.hammingWeight(num);
		System.out.println(res);
		sc.close();
	}

}

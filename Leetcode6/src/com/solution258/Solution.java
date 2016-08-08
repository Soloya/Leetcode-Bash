package com.solution258;

import java.util.*;

public class Solution {
	
	public int addDigits(int num){
		if(num<10){ //不足10直接输出
			return num;
		}
		
		int sum=0;
		while(num>9){ //超过10带入算法
			while(num!=0){
				int count=num%10;
				sum=sum+count;
				num=num/10;
			}
			if(sum>9){
				num=sum;
				sum=0;
			}
		}
		return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		int num=new Scanner(System.in).nextInt();
		int add=sol.addDigits(num);
		System.out.println(add);
	}

}

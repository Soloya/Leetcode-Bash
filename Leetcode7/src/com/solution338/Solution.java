package com.solution338;

import java.util.Scanner;;

public class Solution {
	
	public int[] countBits(int num){
		int[] newarray=new int[num+1];
		
		for(int i=0;i<=num;i++){
			int bit=0;
			int tmp=i;
			while(tmp!=0){
				int count=tmp%2;
				if(count==1){
					bit++;
				}
				tmp=tmp/2;
			}
			newarray[i]=bit;
		}
		return newarray;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		System.out.println("Please input an Integer");
		int num=new Scanner(System.in).nextInt();
		int[] arr=sol.countBits(num);
		for(int x:arr){
			System.out.println(x);
		}
	}
}

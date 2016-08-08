package com.solution283;

import java.util.Scanner;

public class Solution {
	
	public void moveZeroes(int[] nums){
		int len=nums.length;
		int count=0;//新数组的下标
		
		for(int i=0;i<len;i++){
			if(nums[i]!=0){
				nums[count]=nums[i];
				count++;
			}
		}
		
		if(count<len){
			for(int k=count;k<len;k++){
				nums[k]=0;
			}
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] newstr=str.split(" ");
		
		int[] come=new int[newstr.length];
		for(int i=0;i<newstr.length;i++){
			come[i]=Integer.parseInt(newstr[i]);
		}
		
		Solution sol=new Solution();
		sol.moveZeroes(come);
		for(int x:come){
			System.out.println(x);
		}
	}
}

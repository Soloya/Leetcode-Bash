package com.solution66;

import java.util.Scanner;

public class Solution {
	//Problem 66	
	public int[] plusOne(int[] digits) {
		int k=digits.length;
		digits[k-1]++;
		for(int i=k-1;i>0;i--){
			if(digits[i]==10){
				digits[i]=0;
				digits[i-1]++;
			}
		}
		if(digits[0]==10){
			int[] newdigits=new int[k+1];
			newdigits[0]=1;
			return newdigits;
		}
		return digits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		Scanner sc=new Scanner(System.in);
		String[] arr=sc.nextLine().split(" ");
		int[] nums=new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			nums[i]=Integer.parseInt(arr[i]);
		}
		int[] res=sol.plusOne(nums);
		for(int x:res){
			System.out.println(x);
		}
		sc.close();
	}
}
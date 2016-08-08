package com.solution238;

import java.util.Scanner;

public class Solution {
	
	public int[] productExceptSelf(int[] nums){
		int mul=1;
		for(int x:nums){
			mul=mul*x;
		}
		
		int[] arr=new int[nums.length];
		for(int i=0;i<arr.length;i++){
			arr[i]=mul/nums[i];
		}
        return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String[] newstr1=str1.split(" ");
		
		int[] arr1=new int[newstr1.length];
		for(int i=0;i<newstr1.length;i++){
			arr1[i]=Integer.parseInt(newstr1[i]);
		}
		
		Solution sol=new Solution();
		int[] result=sol.productExceptSelf(arr1);
		for(int x:result){
			System.out.println(x);
		}
	}
}

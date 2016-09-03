package com.solution35;

import java.util.Scanner;

public class Test {
	
	public int searchInsert(int[] nums, int target) {
		int result=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>=target){
				result=i;
				break;
			}
			if(nums[nums.length-1]<target){
				result=nums.length;
				break;
			}
		}
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] arr=sc.nextLine().split(" ");
		int[] newarr=new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			newarr[i]=Integer.parseInt(arr[i]);
		}
		int tar=sc.nextInt();
		Test test=new Test();
		int res=test.searchInsert(newarr, tar);
		System.out.println(res);
	}
}

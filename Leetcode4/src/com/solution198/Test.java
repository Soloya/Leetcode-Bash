package com.solution198;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public int rob(int[] nums){
        int n=nums.length;
        int res=0;
        if(n==0){
        	res=0;
        }
		if(n==1){
        	res=nums[0];
        }
        if(n==2){
        	if(nums[0]>nums[1]){
        		res=nums[0];
        	}
        	else{
        		res=nums[1];
        	}
        }
        if(n>2){
        	int[] num1=Arrays.copyOfRange(nums, 0, n-1);
            int[] num2=Arrays.copyOfRange(nums, 0, n-2);
            if(rob(num1)>rob(num2)+nums[n-1]){
            	res=rob(num1);
            }
            else{
            	res=rob(num2)+nums[n-1];
            }
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] arr=sc.nextLine().split(" ");
		int[] array=new int[arr.length];
		
		for(int x=0;x<arr.length;x++){
			array[x]=Integer.parseInt(arr[x]);
		}
		Test test=new Test();
		int val=test.rob(array);
		System.out.println(val);
	}
}

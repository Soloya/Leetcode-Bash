package com.solution217;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	//problem 217
	public boolean containsDuplicate(int[] nums) {
        if(nums.length==0){
			return false;
        }
        Arrays.sort(nums);
        for(int x=1;x<nums.length;x++){
        	if(nums[x]==nums[x-1]){
        		return true;
        	}
        	else{ //加入else{continue}可以提升计算速率
        	    continue;
        	}
        }
        return false;
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
		boolean x=sol.containsDuplicate(nums);
		System.out.println(x);
		sc.close();
	}
}
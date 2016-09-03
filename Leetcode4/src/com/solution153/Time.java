package com.solution153;

import java.util.Arrays;
import java.util.Scanner;;

public class Time {
	//problem 153
	/*public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }*/
	
	public int findMin(int[] nums) {
        int res=0;
		for(int i=0;i<nums.length-1;i++){
        	if(nums[i]>nums[i+1]){
        		res=nums[i+1];
        		break;
        	}
        }
        return res;
    }
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		String[] s=sc.nextLine().split(" ");
		int[] arr=new int[s.length];
			
		for(int i=0;i<s.length;i++){
			arr[i]=Integer.parseInt(s[i]);
		}
		Time time=new Time();
		int res=time.findMin(arr);
		System.out.println(res);
		sc.close();
	}
}

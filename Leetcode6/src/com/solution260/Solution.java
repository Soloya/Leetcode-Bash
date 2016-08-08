package com.solution260;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public int[] singleNumber(int[] nums){
		int k=nums.length;
		int[] result=new int[2];
	
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<k;i++){
			if(map.containsKey(nums[i])){
				map.put(nums[i], 2);
			}
			else{
				map.put(nums[i], 1);
			}
		}
	
		Set<Integer> set=map.keySet();
			int key=0;
			int i=0;
			for(int x:set){
				int val=map.get(x);
				if(val==1 && x!=key){
					result[i]=x;
					key=x;
					i++;
				}
			}	
		return result;
	}

	public static void main(String[] args){
	// TODO Auto-generated method stub
		Solution sol=new Solution();
		String str=new Scanner(System.in).nextLine();
		String[] arr=str.split(" ");
	
		int[] input=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			input[i]=Integer.parseInt(arr[i]);
		}
	
		/*int result=sol.singleNumber(input);
		System.out.println(result);*/
		int[] res=sol.singleNumber(input);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}

}

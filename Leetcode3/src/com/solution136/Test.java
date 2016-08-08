package com.solution136;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

	public class Test {
		//该方法优化map统计方法，25ms
		public int singleNumber(int[] nums){ //利用map找出出现1次的数字
		int k=nums.length;
		int result=0;
	
		Map<Integer,Integer> map=new HashMap<>();
		for(int i:nums){
			if(map.containsKey(i)){
				int v=map.get(i)+1;
				map.put(i, v);
			}
			else{
				map.put(i, 1);
			}
		}
		
		for(int i:nums){
			if(map.get(i)==1){
				result=i;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		String str=new Scanner(System.in).nextLine();
		String[] arr=str.split(" ");
		
		int[] input=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			input[i]=Integer.parseInt(arr[i]);
		}
		
		int result=test.singleNumber(input);
		System.out.println(result);
	}
}

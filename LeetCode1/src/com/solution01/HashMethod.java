package com.solution01;

import java.util.Scanner;
import java.util.HashMap;;

//7ms
public class HashMethod {
	
	public int[] TwoSum(int[] nums,int target)
	{
		int[] index=new int[2];
		int i=nums.length;
		
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int k=0;k<i;k++){
			map.put(nums[k], k);
		}
		
		for(int j=0;j<i;j++){
			int value=target-nums[j];
			if(map.containsKey(value)&&j!=map.get(value)){//规避index[0]与index[1]相等
				index[0]=j;
				index[1]=map.get(value);
			}
		}
		
		if(index[0]>index[1]){
			int temp=index[1];
			index[1]=index[0];
			index[0]=temp;
		}
		return index;
	}
	
	public static void main(String[] args){
		System.out.println("请输入一个数组，数组各元素间以逗号分隔");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] num1=str.split(",");
		
		int[] nums=new int[num1.length];
		for(int i=0;i<num1.length;i++){
			nums[i]=Integer.parseInt(num1[i]);
		}
		
		System.out.println("请输入目标和");
		int target=sc.nextInt();
		
		HashMethod exp=new HashMethod();
		int[] index=exp.TwoSum(nums, target);
	/*	if (index[0]==index[1])
		{
			System.out.println("不存在两个数组元素的和为该数");
		}
		else
		{
			System.out.println("index1="+index[0]+",index2="+index[1]);
		}*/
		System.out.println("index1="+index[0]+",index2="+index[1]);
	}
}

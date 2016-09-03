package com.solution01;
import java.util.Scanner;

//60ms
public class Solution {

	public int[] TwoSum(int[] nums,int target){ //有返回的实例方法
		int[] index=new int[2];
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				while(nums[j]==target-nums[i])
				{
						index[0]=i;
						index[1]=j;
						break;
				}
			}
		}	
		return index;
	}
	
	public static void main(String[] args){
		System.out.println("请输入一个数组，数组元素间以逗号分隔");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] num1=str.split(",");
		
		int[] nums=new int[num1.length];
		for(int i=0;i<num1.length;i++){
			nums[i]=Integer.parseInt(num1[i]);
		}
		
		System.out.println("请输入目标和");
		int target=sc.nextInt();
		
		Solution exp=new Solution();
		int[] index=exp.TwoSum(nums, target);
		
		if (index[0]==index[1]){
			System.out.println("不存在两个数组元素的和为该数");
		}
		else{
			System.out.println("index1="+index[0]+",index2="+index[1]);
		}
	}
}
package com.solution01;
import java.util.Scanner;

//60ms
public class Solution {

	public int[] TwoSum(int[] nums,int target){ //�з��ص�ʵ������
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
		System.out.println("������һ�����飬����Ԫ�ؼ��Զ��ŷָ�");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] num1=str.split(",");
		
		int[] nums=new int[num1.length];
		for(int i=0;i<num1.length;i++){
			nums[i]=Integer.parseInt(num1[i]);
		}
		
		System.out.println("������Ŀ���");
		int target=sc.nextInt();
		
		Solution exp=new Solution();
		int[] index=exp.TwoSum(nums, target);
		
		if (index[0]==index[1]){
			System.out.println("��������������Ԫ�صĺ�Ϊ����");
		}
		else{
			System.out.println("index1="+index[0]+",index2="+index[1]);
		}
	}
}
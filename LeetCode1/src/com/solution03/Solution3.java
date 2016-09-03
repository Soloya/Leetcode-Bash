package com.solution03;

import java.util.Scanner;

public class Solution3 {
	
	public int LengthOfLongestSubstring(String s)//有返回的实例方法
	{
		int[] length=new int[255];//标记数组
		int[] longest=new int[s.length()];
		char[] ch=s.toCharArray();
		int count=0;
		int t=0;
		for(int i=0;i<s.length();i++)
		{
			length[i]=(int)ch[i];//转化为整形数组
		}
		
		for(int j=0;j<s.length();j++)
		{
			int k=j+1;
			if(length[j]==length[k] || k==s.length())//统计到出现重复字符为止的一段长度
			{
				longest[j]=k-j;
			}
			else
			{
				k++;
			}
		}
		
		int max=0;
		for(int x=0;x<s.length();x++)
		{
			if(longest[x]>max)
				max=longest[x];
		}
		return max;
	}
	
	public static void main(String[] args)
	{
		System.out.println("请输入字符串");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		Solution3 exp=new Solution3();
		int longest=exp.LengthOfLongestSubstring(s1);
		System.out.println("字符串的最大子串长度是"+longest);
	}

}
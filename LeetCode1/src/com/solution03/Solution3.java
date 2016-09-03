package com.solution03;

import java.util.Scanner;

public class Solution3 {
	
	public int LengthOfLongestSubstring(String s)//�з��ص�ʵ������
	{
		int[] length=new int[255];//�������
		int[] longest=new int[s.length()];
		char[] ch=s.toCharArray();
		int count=0;
		int t=0;
		for(int i=0;i<s.length();i++)
		{
			length[i]=(int)ch[i];//ת��Ϊ��������
		}
		
		for(int j=0;j<s.length();j++)
		{
			int k=j+1;
			if(length[j]==length[k] || k==s.length())//ͳ�Ƶ������ظ��ַ�Ϊֹ��һ�γ���
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
		System.out.println("�������ַ���");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		Solution3 exp=new Solution3();
		int longest=exp.LengthOfLongestSubstring(s1);
		System.out.println("�ַ���������Ӵ�������"+longest);
	}

}
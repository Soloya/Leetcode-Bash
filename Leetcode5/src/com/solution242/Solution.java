package com.solution242;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	//�ж������ַ����Ƿ�������ͬ��Ŀ���ַ������ݲ�ͬ�����γɵ�
	//�����������������������ǽ��������������ͬ����ʱ��һ�ּ���
	public boolean isAnagram(String s, String t) {
		char[] s1=s.toCharArray();//toCharArray��string��ָ��λ�úͳ��ȿ�����ָ����char[]
		char[] t1=t.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(t1);
		
		Boolean bool=Arrays.equals(s1, t1);
		return bool;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		Boolean bool=sol.isAnagram(s1, s2);
		System.out.println(bool);
		sc.close();
	}
}

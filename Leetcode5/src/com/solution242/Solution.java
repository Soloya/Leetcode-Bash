package com.solution242;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	//判断两个字符串是否是由相同数目的字符，根据不同排列形成的
	//本道题利用了数组排序，这是解决数组特征性相同问题时的一种技巧
	public boolean isAnagram(String s, String t) {
		char[] s1=s.toCharArray();//toCharArray将string以指定位置和长度拷贝到指定的char[]
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

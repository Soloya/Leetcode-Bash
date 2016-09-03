package com.solution13;

import java.util.Scanner;

//7ms
public class Solution {
	
	 public int romanToInt(String s) {
		 
		 int result=0;
		 char[] roman=s.toCharArray();
		 int[] val=new int[roman.length];//整形数组用来记录每一位罗马数字
		 
		 for(int i=0;i<roman.length;i++){
			 switch(roman[i]){
			 case'I':val[i]=1;
				 break;
			 case'V':val[i]=5;
			 	break;
			 case'X':val[i]=10;
			 	break;
			 case'L':val[i]=50;
			 	break;
			 case'C':val[i]=100;
			 	break;
			 case'D':val[i]=500;
			 	break;
			 case'M':val[i]=1000;
			 	break;
			 }
			 
			if(i>0 && val[i]>val[i-1])//若后一个罗马符号的值大于前一个符号的值
				result=result-2*val[i-1]+val[i];
			else
				result=result+val[i];
		 }
		 return result;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input an roman number");
		String str=new Scanner(System.in).nextLine();
		Solution sol=new Solution();
		int k=sol.romanToInt(str);
		System.out.println(k);
	}
}
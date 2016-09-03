package com.solution06;
import java.util.Scanner;

public class Solution6 {
	
	  public String ZigZag(String s,int numRows){
		  if(numRows<2){
			  return s;
		  }
		  
		  int k=s.length();
		  int sub=2*numRows-2;
		  char[] s1=s.toCharArray();//原排列下的char数组
		  String str="";
		
		  //注意到每纵行之间，横行相同的元素序号差相同
		  for(int i=0;i<numRows;i++){
			  for(int j=i;j<k;j=j+sub){
				  str=str+s1[j];
				  if(i>0 && i<numRows-1){ //非首尾行额外多一个斜向元素
					  int len=2*numRows-2-2*i;//斜向元素的表达式是2*row-2-i，len表示它与前一个元素的差
					  if(len!=0 && j+len<k){
						  str=str+s1[j+len];
					  }
				  }
			  }
		  }
		  return str;
	  }
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Solution6 exp=new Solution6();
		String str=exp.ZigZag(s,3);
		System.out.println(str);
	}	
}
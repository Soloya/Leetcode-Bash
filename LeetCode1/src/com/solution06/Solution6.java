package com.solution06;
import java.util.Scanner;

public class Solution6 {
	
	  public String ZigZag(String s,int numRows){
		  if(numRows<2){
			  return s;
		  }
		  
		  int k=s.length();
		  int sub=2*numRows-2;
		  char[] s1=s.toCharArray();//ԭ�����µ�char����
		  String str="";
		
		  //ע�⵽ÿ����֮�䣬������ͬ��Ԫ����Ų���ͬ
		  for(int i=0;i<numRows;i++){
			  for(int j=i;j<k;j=j+sub){
				  str=str+s1[j];
				  if(i>0 && i<numRows-1){ //����β�ж����һ��б��Ԫ��
					  int len=2*numRows-2-2*i;//б��Ԫ�صı��ʽ��2*row-2-i��len��ʾ����ǰһ��Ԫ�صĲ�
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
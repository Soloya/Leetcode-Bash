package com.solution299;

import java.util.Scanner;

public class Count {
	//problem 299
	public String getHint(String secret, String guess) {
		int len=secret.length();
		int[] record=new int[10];//记录数字的出现情况
		int countA=0,countB=0;
		
		for(int i=0;i<len;i++){
			if(secret.charAt(i)==guess.charAt(i)){
				countA++;
			}
			else{ //巧用对应位置自加、自减的方法，用一个数组判断两个字符串中的字符相重复情况
				record[secret.charAt(i)-'0']++;//0-9中某个数字在secret中出现过一次
				if(record[secret.charAt(i)-'0']<=0){
					countB++;
				}
				record[guess.charAt(i)-'0']--;//0-9中某个数字在guess中出现过一次
				if(record[guess.charAt(i)-'0']>=0){
					countB++;
				}
			}
		}
		
		String str=Integer.toString(countA)+"A"+Integer.toString(countB)+"B";
		return str;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count count=new Count();
		Scanner sc=new Scanner(System.in);
		String m1=sc.nextLine();
		String n1=sc.nextLine();
		String res=count.getHint(m1, n1);
		System.out.println(res);
		sc.close();
	}
}
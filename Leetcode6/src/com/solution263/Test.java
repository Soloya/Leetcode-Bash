package com.solution263;

import java.util.Scanner;

public class Test {

	public boolean isUgly(int num) {//·ÖÖ§ÅÐ¶Ï·¨
		if(num<=0){
			return false;
		}
		while(num>1){
			if(num%2==0){
				num=num/2;
				return isUgly(num);
			}
			else if(num%3==0){
				num=num/3;
				return isUgly(num);
			}
			else if(num%5==0){
				num=num/5;
				return isUgly(num);
			}
			else{
				return false;
			}
		}
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Boolean bool=test.isUgly(num);
		System.out.println(bool);
		sc.close();
	}
}

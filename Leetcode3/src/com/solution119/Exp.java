package com.solution119;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exp {
	//problem 119
	public List<Integer> getRow(int rowIndex) {
		List<Integer> e=new ArrayList<>();
		int res=1;
		
		for(int j=0;j<=rowIndex;j++){
			e.add(res);
			long tmp=(long)res*(rowIndex-j)/(j+1);
			res=(int)tmp;
			if(res==0){
				res=1;
			}
		}	
		return e;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exp exp=new Exp();
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		List<Integer> list=exp.getRow(m);
		System.out.println(list);
		sc.close();
	}
}
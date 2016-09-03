package com.solution118;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combine {
	//problem 118
	/*public List<List<Integer>> generate(int numRows) { //BigDecimal规避double的差值问题，用于商业计算，但leetcode暂不支持
		List<List<Integer>> list=new ArrayList<>();
		if(numRows==0){
			return list;
		}
			
		for(int i=0;i<numRows;i++){
			int k=1;
			List<Integer> e=new ArrayList<>();
			for(int j=0;j<=i;j++){
				double mul=(double)(i-j)/(double)(j+1);
				e.add(k);
				BigDecimal d1=new BigDecimal(Double.toString(mul));
				BigDecimal d2=new BigDecimal(Double.toString(k));
				BigDecimal res=d1.multiply(d2);
				k=res.intValue();
				if(k==0){
					k=1;
				}
			}
			list.add(e);
		}
		return list;
    }*/
	
	public List<List<Integer>> generate(int numRows) { //java有多种方案避免运算出小数，先乘后除是一种办法，1ms
		List<List<Integer>> list=new ArrayList<>();
		if(numRows==0){
			return list;
		}
			
		for(int i=0;i<numRows;i++){
			int k=1;
			List<Integer> e=new ArrayList<>();
			for(int j=0;j<=i;j++){
				e.add(k);
				int res=k*(i-j)/(j+1);
				k=res;
				if(k==0){
					k=1;
				}
			}
			list.add(e);
		}
		return list;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combine comb=new Combine();
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		List<List<Integer>> list=comb.generate(m);
		System.out.println(list);
		sc.close();
	}
}

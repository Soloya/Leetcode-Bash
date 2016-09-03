package com.solution378;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	
	public int kthSmallest(int[][] matrix, int k) {
		int row=matrix.length;
		int column=matrix[0].length;
		int[] res=new int[row*column];
		int flag=0;
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				res[flag]=matrix[i][j];
				flag++;
			}
		}
		Arrays.sort(res);
		int result=res[k-1];
		return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请确定矩阵行、列数");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int[][] num=new int[i][j];
		
		for(int a=0;a<i;a++){
			for(int b=0;b<j;b++){
				num[a][b]=(int)(Math.random()*10+1);
				System.out.print(num[a][b]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("请输入序数");
		int k=sc.nextInt();
		Test test=new Test();
		int res=test.kthSmallest(num, k);
		System.out.println(res);
		sc.close();
	}
}
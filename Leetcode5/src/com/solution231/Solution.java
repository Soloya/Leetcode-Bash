package com.solution231;

import java.util.Scanner;

public class Solution {

	//Best & simple ����������������ԭ���븺���Ĳ������λ��������ʣ�2ms
	public Boolean isPowerOfTwo(int n){
		if(n==0){
			return false;
		}
		return n==(n & -n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=new Scanner(System.in).nextInt();
		Solution sol=new Solution();
		Boolean b=sol.isPowerOfTwo(n);
		System.out.println(b);
	}
}

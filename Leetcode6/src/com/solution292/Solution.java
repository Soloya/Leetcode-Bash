package com.solution292;

import java.util.Scanner;

public class Solution {
	
	//�ݹ�������֣����һ��nimʱʯ����4��ذܣ���һ����1-3�����,��4����
	public boolean canWinNim(int n){
		if(n%4==0){
            return false;
        }
        else{
            return true;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		int n=new Scanner(System.in).nextInt();
		Boolean bool=sol.canWinNim(n);
		System.out.println(bool);
	}

}

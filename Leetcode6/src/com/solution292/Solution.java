package com.solution292;

import java.util.Scanner;

public class Solution {
	
	//递归分析发现，最后一次nim时石子数4则必败，又一次拿1-3，因此,隔4必输
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

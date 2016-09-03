package com.solution383;

import java.util.Scanner;

public class Solution {
	//problem 383 比较问题,数组标记法
	public boolean canConstruct(String ransomNote, String magazine) {
        int[] re0=new int[128];
        int[] re1=new int[128];
        int[] res=new int[128];
        
		for(int i=0;i<ransomNote.length();i++){
			int k=ransomNote.charAt(i);
			re0[k]++;
        }
		
		for(int i=0;i<magazine.length();i++){
			int k=magazine.charAt(i);
			re1[k]++;
        }
        
		for(int i=0;i<re0.length;i++){
			res[i]=re1[i]-re0[i];
		}
		
		for(int x:res){
			if(x<0){
				return false;
			}
		}
		return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		boolean n=sol.canConstruct(s, t);
		System.out.println(n);
		sc.close();
	}
}
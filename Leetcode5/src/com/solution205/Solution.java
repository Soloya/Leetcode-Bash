package com.solution205;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
	//problem 205 ���������ַ���֮���ӳ���ϵ��ע��ȷ��ӳ���Ψһ��
	public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
        	return false;
        }
        
		HashMap<Character,Character> map=new HashMap<>();//�洢s��t��mapӳ���
		HashSet<Character> set=new HashSet<>();//ά��mapӳ���һ��һ��ϵ
        for(int i=0;i<s.length();i++){
        	if(map.containsKey(s.charAt(i))){
        		if(map.get(s.charAt(i))!=t.charAt(i)){
        			return false;
        		}
        	}
        	else{
        		if(set.contains(t.charAt(i))){ //�Ѿ���һ�����ڵ�ǰֵ�Ķ�Ӧ��
        			return false;
        		}
        		map.put(s.charAt(i), t.charAt(i));//�½�һ��key value��
        		set.add(t.charAt(i));//ֵ����set
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
		Boolean n=sol.isIsomorphic(s, t);
		System.out.println(n);
		sc.close();
	}
}
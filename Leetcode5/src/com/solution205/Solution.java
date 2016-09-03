package com.solution205;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
	//problem 205 创建两个字符串之间的映射关系，注意确保映射的唯一性
	public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
        	return false;
        }
        
		HashMap<Character,Character> map=new HashMap<>();//存储s与t的map映射表
		HashSet<Character> set=new HashSet<>();//维护map映射的一对一关系
        for(int i=0;i<s.length();i++){
        	if(map.containsKey(s.charAt(i))){
        		if(map.get(s.charAt(i))!=t.charAt(i)){
        			return false;
        		}
        	}
        	else{
        		if(set.contains(t.charAt(i))){ //已经有一个对于当前值的对应键
        			return false;
        		}
        		map.put(s.charAt(i), t.charAt(i));//新建一个key value对
        		set.add(t.charAt(i));//值加入set
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
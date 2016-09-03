package com.solution290;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Index {
	//problem 290 映射问题
	public boolean wordPattern(String pattern, String str) {
        LinkedHashMap<Character,String> map=new LinkedHashMap<>();
        HashSet<String> set=new HashSet<>();
        char[] a=pattern.toCharArray();
        String[] s=str.split(" ");
        
        if(s.length!=a.length){ //如果前后的长度不匹配，存在对应值为空的键或者键为空的值
        	return false;
        }
        
        for(int i=0;i<a.length;i++){
        	if(map.containsKey(a[i])){
        		if(!map.get(a[i]).equals(s[i])){
        			return false;
        		}
        		else{
        			continue;
        		}
        	}
        	else{
        		if(set.contains(s[i])){
        			return false;
        		}
        		else{
        			map.put(a[i], s[i]);
        			set.add(s[i]);
        		}
        	}
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Index index=new Index();
		Scanner sc=new Scanner(System.in);
		String m=sc.nextLine();
		String n=sc.nextLine();
		boolean res=index.wordPattern(m, n);
		System.out.println(res);
		sc.close();
	}
}

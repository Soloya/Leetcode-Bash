package com.solution387;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Index {
	//problem 387
	/*public int firstUniqChar(String s) { //entry不支持，也比较慢
        int result=-1;
        char media='0';
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        char[] res=s.toCharArray();
        
        for(char x:res){
        	if(map.containsKey(x)){
        		int val=map.get(x)+1;
        		map.put(x, val);
        	}
        	else{
        		map.put(x,1);
        	}
        }
        //entrySet返回键值对，但是迭代器必须使用Iterator<Entry<K,V>>，set中必须使用Map.Entry
        Iterator<Entry<Character, Integer>> itr=map.entrySet().iterator();
        while(itr.hasNext()){
        	Map.Entry<Character,Integer> val=itr.next();
        	if(val.getValue()==1){
        		media=val.getKey();
        		break;
        	}
        }
        
        for(int i=0;i<res.length;i++){
        	if(res[i]==media){
        		result=i;
        	}
        }
        return result;
    }*/
	
	public int firstUniqChar(String s) { //对于查找指定元素（实质也是特征比较），优先考虑数组标记
        int result=-1;
        int[] count=new int[26];
        char[] res=s.toCharArray();
        
        for(char x:res){
        	count[x-'a']++;
        }
        
        for(int i=0;i<res.length;i++){
        	if(count[res[i]-'a']==1){
        		result=i;
        		break;
        	}
        }
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Index index=new Index();
		Scanner sc=new Scanner(System.in);
		String m=sc.nextLine();
		int res=index.firstUniqChar(m);
		System.out.println(res);
		sc.close();
	}
}
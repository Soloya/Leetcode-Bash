package com.solution217;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test{
	//验证是否有重复字符
	public boolean containsDuplicate(int[] nums) { //time limited
		if (nums.length==0){
			return false;
		}
		
		HashMap<Integer,Integer> hashmap=new HashMap<>();
		for(int x:nums){
			hashmap.put(x, 0);
		}	
		for(int x:nums){
			if(hashmap.containsKey(x)){
				int val=hashmap.get(x);
				val++;
				hashmap.put(x, val);
			}
		}
			
		Set<Integer> hashset=new HashSet<>();
		hashset=hashmap.keySet();
		Iterator<Integer> itr=hashset.iterator();
		while(itr.hasNext()){
			int count=itr.next();
			int value=hashmap.get(count);
			if(value>1){
				return true;
			}
		}
		return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test sol=new Test();
		Scanner sc=new Scanner(System.in);
		String[] arr=sc.nextLine().split(" ");
		int[] tmp=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			tmp[i]=Integer.parseInt(arr[i]);
		}
		Boolean res=sol.containsDuplicate(tmp);
		/*for(int x:res){
			System.out.println(x);
		}*/
		System.out.println(res);
		sc.close();
	}
}

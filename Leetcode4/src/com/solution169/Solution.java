package com.solution169;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

	public class Solution {
		
	/*public int MostNumber(int[] nums){ //排序法,时间O(nlgn)，空间O(1)
		Arrays.sort(nums);//快排
		int k=nums.length;
		return nums[k/2];
    }*/ 
		
	/*public int MostNumber(int[] nums){ //map法,时间空间O(n)
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
			
		int max=0;//most frequently times
		int number=0;//array element associate with max
		while(itr.hasNext()){
			int count=itr.next();
			int value=hashmap.get(count);
			if(value>max){
				max=value;
				number=count;
			}
		}
		System.out.println(max);//
		return number;
	}*/
		
	public int MostNumber(int[] nums){ //最快方法，标记加减法，时间0(n)空间O(1)
		int flag=1;
		int res=nums[0];
		for(int i=1;i<nums.length;i++){
			if(res==nums[i]){
				flag++;
			}
			else{
				flag--;
			}
			if(flag<=0){
				res=nums[i];
				flag=1;
			}
		}
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		Scanner sc=new Scanner(System.in);
		String[] arr=sc.nextLine().split(" ");
		int[] tmp=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			tmp[i]=Integer.parseInt(arr[i]);
		}
		int res=sol.MostNumber(tmp);
		/*for(int x:res){
			System.out.println(x);
		}*/
		System.out.println(res);
	}

}

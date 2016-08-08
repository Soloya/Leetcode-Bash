package com.solution349;

import java.util.HashSet;
import java.util.Scanner;

import java.util.Iterator;

public class Solution {
	
	public int[] intersection(int[] nums1, int[] nums2){
		int len1=nums1.length;
		int len2=nums2.length;
		HashSet<Integer> hset1=new HashSet<>();
		HashSet<Integer> hset2=new HashSet<>();
		HashSet<Integer> set=new HashSet<>();
		
		//计算集合1、2的元素个数
		for(int i=0;i<len1;i++){
			hset1.add(nums1[i]);
		}
		for(int i=0;i<len2;i++){
			hset2.add(nums2[i]);
		}
		
		//求交集
		Iterator<Integer> itr=hset1.iterator();
		while(itr.hasNext()){
			int x=itr.next();
			if(hset2.contains(x)){
				set.add(x);
			}
		}
		
		int[] arr=new int[set.size()];
		itr=set.iterator();
		int k=0;//array下标
		while(itr.hasNext()){
			int x=itr.next();
			arr[k]=x;
			k++;
		}
		return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String[] newstr1=str1.split(" ");
		String[] newstr2=str2.split(" ");
		
		int[] arr1=new int[newstr1.length];
		for(int i=0;i<newstr1.length;i++){
			arr1[i]=Integer.parseInt(newstr1[i]);
		}
		
		int[] arr2=new int[newstr2.length];
		for(int i=0;i<newstr2.length;i++){
			arr2[i]=Integer.parseInt(newstr2[i]);
		}
		
		Solution sol=new Solution();
		int[] result=sol.intersection(arr1, arr2);
		for(int x:result){
			System.out.println(x);
		}
	}
}

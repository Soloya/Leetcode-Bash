package com.solution136;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution{
	
	/*public int singleNumber(int[] nums){ //����map�ҳ�����1�ε����֣�28ms
		int k=nums.length;
		int result=0;
		
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<k;i++){
			if(map.containsKey(nums[i])){
				map.put(nums[i], 2);
			}
			else{
				map.put(nums[i], 1);
			}
		}
		
		Set<Integer> set=map.keySet();
		for(int x:set){
			int key=x;
			int val=map.get(x);
			if(val==1){
				result=key;
			}
		}
        return result;
    }*/
	
	/*public void singleNumber(int[] nums){ //����map������ӡÿ��Ԫ�صĳ��ִ���
		int k=nums.length;
		
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<k;i++){
			if(map.containsKey(nums[i])){
				map.put(nums[i], 2);
			}
			else{
				map.put(nums[i], 1);
			}
		}
		
		//�����map���������ֵ��key������keyset��Ԫ�ر���keySetȡkey���ٵõ�value
		Set<Integer> set=map.keySet();
		for(int x:set){
			int val=map.get(x);
			System.out.println(x+"  "+val);
		}
		
		int n=map.size();
		System.out.println(n);
    }*/
	
	//����Ѱ�ҷ������������
	public int singleNumber(int[] nums) {
		int res=0;
		for(int i=0;i<nums.length;i++){
			res=res^nums[i];
		}
        return res;
    }

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		String str=new Scanner(System.in).nextLine();
		String[] arr=str.split(" ");
		
		int[] input=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			input[i]=Integer.parseInt(arr[i]);
		}
		
		int result=sol.singleNumber(input);
		System.out.println(result);
		/*sol.singleNumber(input);*/
	}
}

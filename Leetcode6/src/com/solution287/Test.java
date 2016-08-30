package com.solution287;

import java.util.Arrays;
import java.util.Scanner;

public class Test{
	//problem 287
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int res=0;
		for(int x=1;x<nums.length;x++){
			if(nums[x]==nums[x-1]){
				res=nums[x];
				break;
			}
			else{
				continue;
			}
		}
		return res;
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
		int res=sol.missingNumber(tmp);
		/*for(int x:res){
			System.out.println(x);
		}*/
		System.out.println(res);
		sc.close();
	}
}

package com.solution88;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		System.arraycopy(nums2, 0, nums1, m, n);//nums2内容复制到nums1后
		Arrays.sort(nums1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		Scanner sc=new Scanner(System.in);
		String[] arr=sc.nextLine().split(" ");
		int[] nums1=new int[arr.length];
		int k=nums1.length;
		
		for(int i=0;i<arr.length;i++){
			nums1[i]=Integer.parseInt(arr[i]);
		}
		Arrays.sort(nums1);
		//第二个
		String[] arr2=sc.nextLine().split(" ");
		int[] nums2=new int[arr2.length];
		int k2=nums2.length;
		
		for(int i=0;i<arr2.length;i++){
			nums2[i]=Integer.parseInt(arr2[i]);
		}
		Arrays.sort(nums2);
		
		int[] newnum=new int[k+k2];
		System.arraycopy(nums1, 0, newnum, 0, k);
		
		test.merge(newnum, k, nums2, k2);
		for(int x:newnum){
			System.out.println(x);
		}
		sc.close();
	}
}
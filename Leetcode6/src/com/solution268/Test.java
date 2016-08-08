package com.solution268;

import java.util.Scanner;

public class Test{
	
	public int missingNumber(int[] nums) {
		int max=0;
		for(int x:nums){ //get n
        	if(x>max){
        		max=x;
        	}
        }
		
		int res=0;
        int[] scan=new int[max+1];//get n+1 length array
        
        for(int x:nums){
        	scan[x]=1;
        }
        for(int i=0;i<scan.length;i++){
        	if(scan[i]==0){
        		res=i;
        		break;
        	}
        	else{
        		res=scan.length;
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

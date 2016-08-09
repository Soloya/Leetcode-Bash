package com.solution231;

import java.util.Scanner;

public class Test {

	/*public boolean isPowerOfTwo(int n) { //4ms
		if(n<0){
			return false;
		}
		String m=Integer.toBinaryString(n);
        char[] arr=m.toCharArray();
        if(arr[0]=='1'){
        	for(int x=1;x<arr.length;x++){
        		if(arr[x]!='0'){
        			return false;
        		}
        	}
        	return true;
        }
        else{
        	return false;
        }
    }*/
	
	public boolean isPowerOfTwo(int n) { //2ms
		if(n<=0){
			return false;
		}
		while(n!=1){
			if(n%2!=0){
				return false;
			}
			n=n/2;
		}
		return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		Test test=new Test();
		Boolean bool=test.isPowerOfTwo(num);
		System.out.println(bool);
		sc.close();
	}

}

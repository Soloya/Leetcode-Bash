package com.solution237;

import java.util.Scanner;
import com.solution237.ListNode;

public class Solution {
	
	public void deleteNode(ListNode node) {
		node.val=node.next.val;
		node.next=null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] s=sc.nextLine().split(" ");
		
		ListNode node=null;
		for(int i=0;i<s.length;i++){
			node=new ListNode(Integer.parseInt(s[i]));
			node=node.next;
		}
		
		Solution sol=new Solution();
		/*sol.deleteNode(node);*/
		System.out.println(node);
		sc.close();
	}

}

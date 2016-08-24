package com.solution02;

import java.util.Scanner;

public class Solution {
	
	public ListNode addTwoNumbers(ListNode l1,ListNode l2){//有返回的实例方法
		ListNode l3=new ListNode(0);
		int adding=0;//进位符
		while(l1!=null && l2!=null)
		{
			int a=l1.val;
			int b=l2.val;
			l3.val=(a+b+adding)%10;
			adding=(a+b+adding)/10;
			l1=l1.next;
			l2=l2.next;
			ListNode newl3=new ListNode(0);
			l3.next=newl3;
		}
		return l3;
	}
	
	public static void main(String[] args)
	{
		System.out.println("请输入第一组数据");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String[] num1=s1.split("->");
		ListNode l1=new ListNode(0);//实例结点
		ListNode link2=new ListNode(0);//实例结点
		ListNode head1=new ListNode(0);//头结点
		ListNode tail1=null;//尾结点
		ListNode head2=new ListNode(0);//头结点
		ListNode tail2=null;//尾结点
		for(int i=0;i<num1.length;i++)//头插法建立单链表;类stack结构，先入在后
		{
			head1.next=l1;
			l1.next=tail1;
			l1.val=Integer.parseInt(num1[i]);
			tail1=l1;
		}
		
		System.out.println("请输入第二组数据");
		String s2=sc.nextLine();
		String[] num2=s2.split("->");
		
		for(int i=0;i<num2.length;i++)//头插法建立单链表;类stack结构，先入在后
		{
			head2.next=link2;
			link2.next=tail2;
			link2.val=Integer.parseInt(num2[i]);
			tail2=link2;
		}
		
		Solution so=new Solution();
		ListNode l3=so.addTwoNumbers(l1, link2);

	/*	Solution output=new Solution();
		ListNode result=output.addTwoNumbers(l1, l2);
		System.out.println(result.val);
		*/
	}
}

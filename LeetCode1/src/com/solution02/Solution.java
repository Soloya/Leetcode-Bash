package com.solution02;

import java.util.Scanner;

public class Solution {
	
	public ListNode addTwoNumbers(ListNode l1,ListNode l2){//�з��ص�ʵ������
		ListNode l3=new ListNode(0);
		int adding=0;//��λ��
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
		System.out.println("�������һ������");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String[] num1=s1.split("->");
		ListNode l1=new ListNode(0);//ʵ�����
		ListNode link2=new ListNode(0);//ʵ�����
		ListNode head1=new ListNode(0);//ͷ���
		ListNode tail1=null;//β���
		ListNode head2=new ListNode(0);//ͷ���
		ListNode tail2=null;//β���
		for(int i=0;i<num1.length;i++)//ͷ�巨����������;��stack�ṹ�������ں�
		{
			head1.next=l1;
			l1.next=tail1;
			l1.val=Integer.parseInt(num1[i]);
			tail1=l1;
		}
		
		System.out.println("������ڶ�������");
		String s2=sc.nextLine();
		String[] num2=s2.split("->");
		
		for(int i=0;i<num2.length;i++)//ͷ�巨����������;��stack�ṹ�������ں�
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

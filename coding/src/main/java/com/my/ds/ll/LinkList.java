package com.my.ds.ll;

public class LinkList {
	private LLNode head=null;
	
	private void add(int data) {
		if(head==null) {
			head=new LLNode(data);
		}else {
			LLNode temp=new LLNode(data);
			temp.next=head;
			head=temp;
	 	}
	}
	private void delete(int data) {
		
	}
	 
}

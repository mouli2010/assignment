package com.regnent.datastructer;

public class LinkedlistEx {
	Node head = null;
	Node last = null;

	public void add(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
			last = n;
		} else {
			last.setNextNode(n);
			last = n;
		}
	}
	public void deleteAt(int index)
	{
	   if(index==0)
	   {
		  
		   head=head.getNextNode();
		   
	   }
	   else
	   {
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++)
			{
				n = n.getNextNode();
			}
			n1 = n.getNextNode();
			n.setNextNode(n1.getNextNode());
			n1 = null;
		}
	}
	public void addAtStart(int data)
	{
		Node n = new Node(data);
		n.setNextNode(head);
		head = n;
	}
	public void addAt(int index,int data)
	{
		Node n = new Node(data);
		n.setNextNode(last);
		
		if(index==0)
		{
			addAtStart(data);
		}
		else{
		Node nod = head;
		for(int i=0;i<index-1;i++)
		{
			nod = nod.getNextNode();
		}
		n.setNextNode(nod.getNextNode());
		nod.setNextNode(n);
		}
	}

	public void show() {
		Node temp = head;
		
		while (temp.getNextNode() != null) {
			System.out.println(temp.getData());
			temp = temp.getNextNode();
		}
		System.out.println(temp.getData());

	    }
	

}

class Node {
	private int data;
	private Node nextNode;

	Node(int data) {
		this.data = data;
	}

	protected int getData() {
		return data;
	}

	protected void setData(int data) {
		this.data = data;
	}

	protected Node getNextNode() {
		return nextNode;
	}

	protected void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

}
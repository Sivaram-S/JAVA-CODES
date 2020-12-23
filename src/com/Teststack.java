package com;

class Stack {
	int stk[] = new int[10];
	int tos;
	
	Stack() 
	{
		tos = -1;
	}
	
	void push(int item)
	{
		if(tos == 9)
			System.out.println("Stack is Full..");
		else
			stk[++tos] = item;
	}
	
	int pop()
	{
		if(tos < 0)
		{
			System.out.println("Stack Underflow..");
			return 0;
		}
		else
			return stk[tos--];
	}
}

public class Teststack {
	public static void main(String args[])
	{
		Stack mystk = new Stack();
		for(int i=0; i<10; i++) mystk.push(i);
		//mystk.stk[2] = 100; This I don't want
		for(int j=0; j<10; j++) System.out.println(mystk.pop());
	}

}

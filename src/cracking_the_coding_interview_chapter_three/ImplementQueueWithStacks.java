package cracking_the_coding_interview_chapter_three;

import java.util.Stack;

public class ImplementQueueWithStacks {
static Stack<Integer> st1=new Stack<Integer>();
static Stack<Integer> st2=new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
push(10);
push(16);
push(13);
System.out.println(peek());
System.out.println(pop());
System.out.println(empty());
	}
	private static int peek() {
		// TODO Auto-generated method stub
if(st1.isEmpty() && st2.isEmpty())
{
	return -1;
}
if(st2.isEmpty())
{
	while(!st1.isEmpty())
	{
		st2.push(st1.pop());
	}
}return st2.peek();
	}
	private static boolean empty() {
		// TODO Auto-generated method stub
		if(st1.isEmpty() && st2.isEmpty())
		{
			return true;
		}	
		return false;
	}
	private static int pop() {
		// TODO Auto-generated method stub
if(st1.isEmpty() && st2.isEmpty())
{
	return -1;
}
if(st2.isEmpty())
{
	while(!st1.isEmpty())
	{
		st2.push(st1.pop());
	}
}
return st2.pop();
	}
	private static void push(int val) {
		// TODO Auto-generated method stub
		st1.push(val);
	}

}

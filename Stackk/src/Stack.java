
public class Stack {
   
	private int maxSize;
	private int []arr;
	private int top;
	
	public Stack(int maxSize) {
		
		  this.maxSize = maxSize;
		  arr = new int [maxSize];
		  this.top = top;
	}
	
	public void push(int data)
	{
		if(isFull())
		{
			System.out.println("stack is full");
			return;
		}
	   arr[++top]=data;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
			
		}
		return arr[top--];
	}
	
	public int peek()
	{
	   if(isEmpty())
	   {
		   System.out.println("satck is empty");
	   }
	   return arr[top];
	}
	
	public boolean isFull()
	{
		return top==maxSize-1;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	
	
}

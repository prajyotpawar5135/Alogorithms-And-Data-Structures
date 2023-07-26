
public class LinearQueue {
   private  int rear,front;
   private int maxSize;
   private int arr[];
   
public LinearQueue( int maxSize) {
	super();
	this.rear = -1;
	this.front = -1;
	this.maxSize = maxSize;
	arr = new int [maxSize];
}
	

public boolean isFull()
{
	return rear==maxSize-1; 
}

public boolean isEmpty()
{
	return (rear==-1 && front==-1 || front>rear);
}

public void insert(int data)
{
	if(isFull())
	{
		System.out.println("Queue is full");
	}
	arr[++rear]=data;
	if(front==-1)
	{
		front=0;
	}
}

public int delete()
{
	if(isEmpty())
	{
		System.out.println("Queue is empty");
		return -1;
	}
	return arr[front++];
	
}
   
   
}


public class CircularQueue {

	private int rear,front;
	private int [] arr;
	private int maxSize;
	
	public CircularQueue( int maxSize) {	
		this.rear = -1;
		this.front = -1;
		 arr = new int[maxSize];
		this.maxSize = maxSize;
	}
	
	public boolean isFull()
	{
		return front==(rear+1)%maxSize;
	}
	
	public boolean isEmpty()
	{
		return (rear==-1 && front==-1 || front>rear);
	}
	

	public boolean insert(int data)
	{
	  if(isFull())
	  {
		  System.out.println("queue is full");
	  }
	  rear=(rear+1)%maxSize;
	   arr[rear]=data;
	  return true;
	}
	
	public int delete()
	{
		if(isEmpty())
		{
			System.out.println("queue iss empty");
		}
		front=(front+1)%maxSize;
		return arr[front];
	}
	
	
}

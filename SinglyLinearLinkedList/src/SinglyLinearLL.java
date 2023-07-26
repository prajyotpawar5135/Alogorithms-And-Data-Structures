
public class SinglyLinearLL {
	private Node head;
	private Node temp;

	public SinglyLinearLL() {
		super();
		this.head = null;
	}
	
	public boolean insertAtfirstAndLastPosition(int data,int position)
	{
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
	if(position==1)
	{
		if(head==null)
		{
			head=newNode;
			newNode.setNext(null);
			return true;
		}
	}	
		else
		{
			temp=head;
		  while(temp.getNext()!=null)
		  {
			  temp=temp.getNext();
		  }
		  temp.setNext(newNode);
		  newNode.setNext(null);
		}
	  
		return false;
	}
	
	public boolean insertAtSpecificPosition(int data,int position)
	{
		Node newNode=new Node(data);
		temp=head;
		for(int i=1;i<position-1;i++)
		{
			temp=temp.getNext();
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
			return true;
		}
			
		return false;
	}
	
	public boolean deleteAtFirstPosition()
	{
	    temp=head;
	    head=temp.getNext();
	    temp=null;
	   return true;
	}
	
	public boolean deleteAtLastPosition()
	{
		temp=head ;
		while(temp.getNext().getNext()!=null)
		{
			temp=temp.getNext();
		}
		temp.setNext(null);
		return true;
	}
	
	
	public boolean deleteAtSpecificPosition(int position)
	{   temp=head;
		for(int i=1;i<position-1;i++)
		{
			temp=temp.getNext();
		}
		temp.setNext(temp.getNext().getNext());
		return true;
	}
	
	
	public void display()
	{
		temp=head;
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
	
}

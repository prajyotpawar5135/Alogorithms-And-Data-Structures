
public class DoublyLLL {

	private Node head;
	private Node temp;
	public DoublyLLL() {
		super();
		this.head = null;
		
	}
	
	public boolean insertAtFirstPosition(int data)
	{
		Node newNode=new Node(data);
	    if(newNode==null)
	    {
	    	return false;
	    }
	    if(head==null)
	    {
	    	head=newNode;
	    	return true;
	    }
		return false;
	}
	
	
	public boolean insertAtLastPosition(int data)
	{	
		Node newNode=new Node(data);
		temp=head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
			
		}
		temp.setNext(newNode);
		newNode.setNext(null);
		newNode.setPrev(temp);
		return true;
	}	
	
	
	public boolean insertAtSpecificPosition(int data,int position)
	{
		Node newNode=new Node(data);
	    temp=head;
	    for(int i=1;i<position-1;i++)
	    {
	    	temp=temp.getNext();
	    	newNode.setNext(temp.getNext());
	    	newNode.setPrev(temp);
	    	temp.setNext(newNode);
	    	
	    }
	    
	    return true;
	}
	
	public boolean deleteAtFirstPosition()
	{
		if(head==null)
		{return false;}
		
		temp=head;
		head=temp.getNext();
		head.setPrev(null);
		return true ;
	}
	
	public boolean deleteAtLastPosition()
	{
	    temp=head;
	    while(temp.getNext().getNext()!=null)
	    {
	         	temp=temp.getNext();
	    }
	     temp.setNext(null);   
		return true;
	}
	
	
	
	public boolean deleteAtSpecificPosition(int position)
	{	
		temp=head;
		for(int i=1;i<position-1;i++)
		{
//			
//			temp.setNext(temp.getNext());
//			temp.getNext().setPrev(temp);
//			return true;
			temp=temp.getNext();
		}
		Node a=temp.getNext().getNext();
		temp.setNext(a);
		a.setPrev(temp);
		
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

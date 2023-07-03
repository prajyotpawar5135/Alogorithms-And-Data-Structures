package doublyLinear;

public class DoublyLinearLL {

	private Node head;
	Node temp;

	public DoublyLinearLL() {
		super();
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	@Override
	public String toString() {
		return "DoublyLinearLL [head=" + head + "]";
	}

	// add node at last position

	public boolean addNodeAtLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return true;
		}
		temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();

		}
		temp.setNext(newNode);
		newNode.setNext(null);
		newNode.setPrev(temp);
		return true;
	}

	public boolean addNodeAtFirstPos(int data, int position) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return true;
		}

		if (position == 1) {
			Node prev = head;
			newNode.setNext(prev);
			newNode.setPrev(null);
			head = newNode;
			return true;
		}
		return false; 
	}
	
	
	public boolean insertAtSpecificPos(int data,int position)
	{
			Node newNode = new Node(data);
			Node temp = head;
			for (int i = 1; i < position - 1; i++) {
				temp = temp.getNext();
			
				newNode.setPrev(temp);
				newNode.setNext(temp.getNext());
				temp.setNext(newNode);
				return true;
			}return false;
			}
	
		public boolean deleteAtFirstPos(int position)
		{
			temp=head;
			head=temp.getNext();
			temp.setPrev(null);
			return true;
			
		}
		
	

	public void display() {
		temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		

	}

}


public class Node {

	private Node prev,next;
	private int data;
	public Node( int data) {
		
		this.prev = null;
		this.next = null;
		this.data = data;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Node [prev=" + prev + ", next=" + next + ", data=" + data + "]";
	}
	
	
	
	
}


public class Node {

	private int data;
	private Node left,right;
	private char Lflag,Rflag;
	
	
	
	
	public Node() {
		
	}
	
	


	public Node(int data) {
		this.data = data;
		left=right=null;
		Lflag =Rflag ='T';
	}




	public int getData() {
		return data;
	}
	
	
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}




	public char getLflag() {
		return Lflag;
	}




	public void setLflag(char lflag) {
		Lflag = lflag;
	}




	public char getRflag() {
		return Rflag;
	}




	public void setRflag(char rflag) {
		Rflag = rflag;
	}
	
	
	
	
	
}

import java.util.Stack;

public class BinarySearchTree {

	private Node root;
	private Node temp;

	public BinarySearchTree() {
		root = null;
	}

	public boolean insertDataIntoTree(int data) {

		Node newNode = new Node(data);

		if (newNode == null) {
			return false;
		}
		if (root == null) {
			root = newNode;
			// System.out.println(temp);

		}

		temp = root;
		while (temp != null) {

			// System.out.println(temp);

			if (data == temp.getData())// do not allow duplicates
			{
				return false;
			}

			if (data < temp.getData()) {
				// System.out.println("hi");
				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					// System.out.println("hello");
					return true;
				}
				temp = temp.getLeft();

			} else {

				if (temp.getRight() == null) {
					temp.setRight(newNode);

					return true;
				}
				temp = temp.getRight();
			} // else
		} // while
		return false;
	}

	public void preOrder() {
		Stack<Node> stack = new Stack<>();
		temp = root;
		System.out.println("preOrder:");
		while(temp!=null || !stack.isEmpty())
		{
			while(temp!=null)
			{
				System.out.print(temp.getData()+" ");
				stack.push(temp);
				temp=temp.getLeft();
			}
			temp=stack.pop().getRight();
			
			
		}
		System.out.println();
		
	}
	
	public void inOrder()
	{
		Stack<Node> stack = new Stack<>();
		temp=root;
		System.out.println("inorder:");
		while(temp!=null || !stack.isEmpty())
		{
			while(temp!=null)
			{
				 stack.push(temp);
				temp=temp.getLeft();
			}
			temp=stack.pop();
			 System.out.print(temp.getData()+" ");
			 temp=temp.getRight();
			
		}
	}


//using recursion
//	public void inOrder(Node node) {
//		if (node == null) {
//			return;
//		}
//		inOrder(node.getLeft());
//		System.out.print(node.getData() + " ");
//		;
//		inOrder(node.getRight());
//	}
//
//	public Node getRoot() {
//		// TODO Auto-generated method stub
//		return this.root;
//	}
	
	
	public void postOrder()
	{
		class Pair
		{
			 Node node;
			 char flag;
			

			public Pair(Node node, char flag)
			{
				this.node = node;
				this.flag = flag;
			}
		}
		   temp=root;
			Stack<Pair> stacks=new Stack<>();
			
			System.out.println("postOrder:");

	  while(temp!=null || !stacks.empty())
	   {
			     while(temp!=null)
			     {
			    	 stacks.push(new Pair(temp,'L'));
			    	 temp=temp.getLeft();
			     }
			     	Pair pair=stacks.pop();
			     	if(pair.flag=='L')
			     	{
			     		temp=pair.node.getRight();
			     		pair.flag='R';
			     		stacks.push(pair);
			     	}
			    else
			    {
			    	System.out.print(pair.node.getData()+" ");
			    }
			
			
	  }
           
	}
	
}
	
 

	
	
	
	
	
	



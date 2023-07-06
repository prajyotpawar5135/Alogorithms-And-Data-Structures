
public class ThreadedBST {

	 private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	 
	 public boolean insert(int data)
	 {
		 Node newNode =new Node(data);
		 
		 if(newNode==null)
		 {
			 return false;
		 }
		 if(root==null)
		 {
			 root=newNode;
		 }
		 Node temp=root;
		 if(data<temp.getData() )
		 {
			 if(temp.getLflag()=='T')
			 {
				newNode.setRight(temp);
				newNode.setLeft(temp.getLeft());
				temp.setLeft(newNode);
				temp.setLflag('L');
				return true;
				
			 }
			 temp=temp.getLeft();
		 }
			 else 
			 {
				if(temp.getRflag()=='T')
				{
					newNode.setLeft(temp);
					newNode.setRight(temp.getRight());
					temp.setRight(newNode);
					temp.setRflag('L');
					return true;
				}
                 temp=temp.getRight()  ;                       
				 
			 }
		return false;		 
	  }
	 
	 
	 public void preOrder()
	 {
		 Node temp=root;
		 char flag= 'L';
		 
		 while(temp.getLflag()=='L' && flag=='L')
		 {
			 System.out.println(temp.getData()+" ");
			 temp=temp.getLeft();
		 }
		 if(flag=='L')
		 {
			 System.out.println(temp.getData()+" ");
		 }
		 
		 flag=temp.getRflag();
		 temp=temp.getRight();
		 
		 
	 }
	 
	 
}

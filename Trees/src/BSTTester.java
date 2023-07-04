
public class BSTTester {

	public static void main(String[] args) {
	
		BinarySearchTree bst=new BinarySearchTree();
		
		bst.insertDataIntoTree(50);
		bst.insertDataIntoTree(20);
		bst.insertDataIntoTree(40);
		bst.insertDataIntoTree(15);
		bst.insertDataIntoTree(60);
		bst.insertDataIntoTree(70);

		//bst.inOrder(bst.getRoot());
		
		bst.preOrder();
		System.out.println("_______");
		bst.inOrder();
		System.out.println("_______");
		bst.postOrder();
		
		//bst.inOrder();
		

		
		
		
	}
	

	
	
}

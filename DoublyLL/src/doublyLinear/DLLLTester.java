package doublyLinear;

public class DLLLTester {

	public static void main(String[] args) {

		DoublyLinearLL l1=new DoublyLinearLL();
		l1.addNodeAtLast(10);
		l1.addNodeAtLast(20);
		l1.addNodeAtLast(30);
		l1.addNodeAtLast(40);
		l1.addNodeAtLast(50);

		l1.display();
		
		System.out.println("_______________");
		
		l1.addNodeAtFirstPos(222,1);
		l1.display();
		System.out.println("________________");
		
		l1.insertAtSpecificPos(777, 3);
		l1.display();

		System.out.println("_______________");
		l1.deleteAtFirstPos(1);
		l1.display();
		
		
		
	}

}

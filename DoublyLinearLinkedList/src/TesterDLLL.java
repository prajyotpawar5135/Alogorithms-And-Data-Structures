import java.util.Scanner;

public class TesterDLLL {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		DoublyLLL d1=new DoublyLLL();
		System.out.print("insert at first:");
		d1.insertAtFirstPosition(10);
		d1.display();
		System.out.println("\n______________");
		
		
		System.out.println("insert at last");
		d1.insertAtLastPosition(20);
		d1.insertAtLastPosition(30);
		d1.insertAtLastPosition(40);
		d1.insertAtLastPosition(50);
		d1.display();
		
		System.out.println("\n__________");
		
		d1.insertAtSpecificPosition(33, 3);
		d1.display();
		System.out.print("\n");

		
		d1.deleteAtFirstPosition();
		d1.display();
		System.out.print("\n");
		
		d1.deleteAtLastPosition();
		d1.display();
		System.out.print("\n");
		
		d1.deleteAtSpecificPosition(2);
		d1.display();
		
	}	

}

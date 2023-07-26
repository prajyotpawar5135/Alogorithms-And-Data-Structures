import java.util.Scanner;

public class TesterSLLL {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SinglyLinearLL s1=new SinglyLinearLL();
		System.out.println("__________at first _________________");

		s1.insertAtfirstAndLastPosition(10, 1);
		s1.insertAtfirstAndLastPosition(20, 2);
		s1.insertAtfirstAndLastPosition(30, 3);
		s1.insertAtfirstAndLastPosition(40, 4);
		s1.insertAtfirstAndLastPosition(50, 5);
		s1.display();
		System.out.println("\n_______at position_______________");
		s1.insertAtSpecificPosition(33, 3);
		s1.display();
		
		System.out.println("\n__________delete at first _________________");
		s1.deleteAtFirstPosition();
		s1.display();
		
		System.out.println("\n__________delete at last _________________");
		s1.deleteAtLastPosition();
		s1.display();
		
		System.out.println("\n__________delete at specific _________________");
		s1.deleteAtSpecificPosition(3);
		s1.display();

	}

}

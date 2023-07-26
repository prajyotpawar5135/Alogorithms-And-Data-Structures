
public class TesterForBoth {

	public static void main(String[] args) {
		
		LinearQueue l1=new LinearQueue(5);
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		
		System.out.println("deleted element is"+l1.delete() );
		System.out.println("deleted element is"+l1.delete() );

System.out.println("*****____________________********************");
		


	CircularQueue c1=new CircularQueue(5);
	c1.insert(50);
	c1.insert(60);
	c1.insert(60);
	c1.insert(70);
	
	System.out.println("deleted element is "+c1.delete());
	System.out.println("deleted element is "+c1.delete());


	}
	

}

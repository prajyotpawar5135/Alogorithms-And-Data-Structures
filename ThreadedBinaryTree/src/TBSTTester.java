
public class TBSTTester {

	public static void main(String[] args) {
       
	ThreadedBST t=new ThreadedBST();
	  t.insert(50);
      t.insert(20);
      t.insert(30);
      t.insert(40);
      t.insert(25);
      t.insert(10);
		
      t.preOrder();
	}

}

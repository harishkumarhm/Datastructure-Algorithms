package algo;

public class QueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    QueUsingArray qa = new QueUsingArray(10);
    try {
		qa.enque(2);
		qa.enque(4);
		qa.deque();
		qa.enque(8);
		qa.enque(10);
		qa.enque(12);
		qa.deque();
		qa.deque();
		qa.deque();
		qa.enque(12);
		qa.enque(12);
		qa.enque(12);
		qa.enque(12);
		qa.enque(12);
		qa.enque(12);
		qa.enque(12);
		qa.enque(12);
		qa.enque(12);
		qa.enque(12);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}

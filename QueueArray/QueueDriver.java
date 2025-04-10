package QueueArray;

public class QueueDriver {
	public static void main(String[] args) {
		Queue q = new Queue();
//		q.delete();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.display();
		q.delete();
		q.display();
	}
}

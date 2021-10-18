import java.util.LinkedList;

public class LinkedlistColl
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// frequent operation is updation and deletion.
		
		
		//underlying ds is doubly link list.
		
		// duplicates allowed.
		
		// insertion order
		
		//null insertion
		
		//Heterogenous
		
		//Implement seriablizable interface, but not randomaccess.
		
		// Constructors
		
		//1. LinkedList L = new LinkedList()
		
		//2. LinkedList L = new LinkedList(Collection c);
		
		
		LinkedList L = new LinkedList();
		
		L.add("Durga");
		
		L.add(null);
		
		L.add("AB");
		
		L.set(0,"SE");
		
		L.removeLast();
		
		L.addFirst("CCCC");
		
		System.out.println(L);
		
		
	}

}










































































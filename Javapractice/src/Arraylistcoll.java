import java.util.ArrayList;

public class Arraylistcoll {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// 1. Resizable array or growable array.
		// 2. Duplicate.
		// 3. Insertion order preserve.
		// 4. Heterogeneous object.
		// 5. null insertion possible.
		
		
		//ArrayList Constructor.
		
		//1.  ArrayList L = new ArrayList();
		
		// New Capacity = (current capacity *3/2) +1
		
		
		//2.  ArrayList L = new ArrayList(int initial capacity);
		
		
		// 3. ArrayList al = new ArrayList(Collection c);
		
		
		ArrayList L = new ArrayList();
		
		L.add("A");
		
		L.add(10);
		
		L.add("A");
		
		L.add(null);
		
		System.out.println(L);
		
		L.remove(2);
		
		System.out.println(L);
		
		L.add(2, "OM");
		
		System.out.println(L);
		
		// By default implement Serializable interface.
		
		
		

	}

}



























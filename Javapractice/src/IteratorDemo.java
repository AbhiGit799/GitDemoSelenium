
import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList L = new ArrayList();
		
		for(int i=0; i<=10;i++)
		{
			L.add(i);
		}
		
		System.out.println(L);
		
		Iterator itr = L.iterator();
		
		
		while(itr.hasNext())
		{
			Integer I = (Integer)itr.next();
			
			if(I%2==0)
				System.out.println(I);
			else
				itr.remove();
		}
		
		System.out.println(L);
		

	}

}

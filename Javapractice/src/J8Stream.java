import java.util.*;
import java.util.stream.*;

public class J8Stream {

	  // Java provides a new additional package in Java 8 called java.util.stream. This package consists of classes, interfaces and enum to allows functional-style operations on the elements. 
	  //You can use stream by importing java.util.stream package.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> I = new ArrayList<Integer>(); //Generic
		I.add(0);
		I.add(10);
		I.add(20);
		I.add(25);
		I.add(40);
		
		System.out.println(I);
		
		List<Integer> I1 = I.stream().filter(i->i%2==0).collect(Collectors.toList());   

        System.out.println(I1);
	
	}

}


// Stream<T> distinct()	--->  It returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream.




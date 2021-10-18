import java.util.function.*;

public class J81 {

	public static void main(String[] args) {
		
		
		
		
		
		// TODO Auto-generated method stub
		// Java 8 Durga First
        //Concise Code.
		//Features: 
		// 1. Lambda Expressions.
		// 2. Functional Interface.
		// 3.  Default methods and static methods.
		// 4. Predefined functional interfaces: - Predicate, Function,  Consumer, Supplier, etc.
		// 5. Double colon operator (::) 
		// Method reference, Constructor reference
		// 6. Streams.
		// 7. Date and Time API.
		// 8. Optional class
		// 9. Nashorn JS Engine. 
		
		//The main objective of lambda expression is to bring benefits of functional programming into java.
		
		//Lambda function is an anonymous function: [Nameless] [without return type] [without modifiers] 
		
		
		Function<Integer, Integer> f = i -> i * i; // Lambda expression. Enable functional programming in java.

		System.out.println("The square of 40 " + f.apply(40));

		Predicate<Integer> p = i -> i % 2 == 0;

		System.out.println(p.test(5));
		
		//Ex of lambda expression
		
		// Curly braces are optionals. 
		
		

		//Ex2:
		
	
		
		
		

	}

}









































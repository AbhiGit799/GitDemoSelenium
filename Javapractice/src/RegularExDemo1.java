import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern P = Pattern.compile("ab");
		
		Matcher m = P.matcher("ababbaba");  //Target string. 
		
		int count =0 ;
             
		while(m.find())
		{
			count++;
			
			System.out.println(m.start() +" "+m.end()+" "+m.group());
			
			//end() return n+1  Index.
			
			//start() return start index. 
			
		}
		
		
		System.out.println("The number of occurrences "+count);
		
	
		//Patter is a compiled version of Regular Expression. 
		
		//Equivalent java object of regular expression.
		
		// Create pattern object 	Pattern P = Pattern.compile("ab");
		
		// Here, we use compile() for creating the Pattern object. 
		
		// Syntax: public static Pattern compile(String str)
		
		// By using class name static factory method. 
		
		
		
		// What is matcher?
		
		// We can use matcher object to match the given pattern in the target string.
		
		// We can create matcher object by using matcher() of Pattern class.
		
		// public Matcher matcher(String target)
		
		
		//Important methods of Matcher class.
		
		// boolean find() 
		
		// int start()
		
		// int end() -- return n+1 index.
		
		// group()
		
		
		
	}

}























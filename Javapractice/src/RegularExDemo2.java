import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExDemo2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// PART 4 
		
		// [abc] -> Either a or b or c
		
		// [^abc] -> Except a,b and c
		
		// [a-z] --> Any lower case alphabet symbol.
		
		// [A-Z]  --> Any upper case alphabet symbol.
		
		// [a-z A-Z] -> Any alphabet symbol.
		
		// [0-9] = Any digit from 0 to 9
		
		// [a-zA-Z0-9] -> Any alphanumeric character.
		
		//[^a-zA-Z0-9] -> Except alphanumeric character. Special character.
		
	//	Pattern p = Pattern.compile("[abc]");
		
	//	Pattern p = Pattern.compile("[a-z]");
		
	//	Pattern p = Pattern.compile("[0-9]");
		
	//	Pattern p = Pattern.compile("[a-zA-Z0-9]");
		
		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		
		Matcher m = p.matcher("a7b@z#9");
		
		while(m.find())
		{
			System.out.println(m.start() + " "+m.end()+" "+m.group());
		}
		
		
		
		
		
	}

}










































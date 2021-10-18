
public class Stringcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// How to Split a String in Java with Delimiter?
		// In Java, splitting string is an important and usually used operation when coding. 
		//Java provides multiple ways to split the string. But the most common way is to use the split() method of the String class.
		
		//What is a delimiter?
		//In Java, delimiters are the characters that split (separate) the string into tokens. Java allows us to define any characters as a delimiter. There are many string split methods provides by Java that uses whitespace character as a delimiter. The whitespace delimiter is the default delimiter in Java.
		
		// Using String.split() Method
		// The split() method of the String class
		// is used to split a string into an array of String objects based on the specified delimiter that matches the regular expression. 
	
		
		int strcount = 0, intcount = 0, doublecount = 0;
		
		
		String s = "Hello 25.06 World 123";
		
		String[] result = s.split(" ");
		
		for(int i=0;i<result.length;i++)
		{
			//System.out.println(i);
			
			System.out.println(result[i]); 
			
			try
			{
				int as = Integer.parseInt(result[i]);
				intcount++;
				
			}
			catch(Exception e)
			{
				try
				{
					double asdb = Double.parseDouble(result[i]);
					doublecount++;
					
				}
				
				catch(Exception ex)
				{
					strcount++; 
				}
			}
		}
		
		System.out.println(intcount);
		
		System.out.println(doublecount);
		
		System.out.println(strcount);
		

	}

}

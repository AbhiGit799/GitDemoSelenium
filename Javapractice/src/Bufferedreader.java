import java.io.*;

public class Bufferedreader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			int a,b,sum;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter First Number\t");
			
			a = Integer.parseInt(br.readLine());
			
			System.out.println("Enter Second Number\t");
			
			b = Integer.parseInt(br.readLine());
			
			sum = a+b;
			
			System.out.println("Addition = "+sum);
			
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
	}

}

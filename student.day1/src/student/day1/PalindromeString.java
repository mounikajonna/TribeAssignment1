package student.day1;

public class PalindromeString 
{
	public static void main(String[] args)
	{
		String s1 = "mouni";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+(s1.charAt(i));
				
		}
		System.out.println(rev);
              
if(s1.equalsIgnoreCase(rev)) {
	System.out.println("palindrome");
}else
{
	System.out.println("Not palindrome");

}
}

}	
	


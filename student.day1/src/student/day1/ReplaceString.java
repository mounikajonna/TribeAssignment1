 package student.day1;

public class ReplaceString {
 public static void main(String[] args)
 {
	 String mouni="Welcome to my World";
	 System.out.println(mouni);
	 mouni=mouni.replace("my", "our");
	 System.out.println(mouni);
	 mouni=mouni.replace(" ", "_");
	 System.out.println(mouni);
	 
	 String madhu = "cool broo veryy";
	 String result = madhu.replace("oo", "@");
	 System.out.println(result);
}
}
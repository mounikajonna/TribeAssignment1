package student.day1;

import java.util.Scanner;

public class CreatingString 
{
	
		public static void main(String[] args) 
		{
			String Name1 ="Mounika";
			String Name2 ="Mounika";
			
			String Name3 = new String();
			Name3="Mounika";
			
			String Name4 = new String("Mamatha");
	
			System.out.println(Name1);
			System.out.println(Name3);
			System.out.println(Name4);
			//comparing two strings 
			System.out.println(Name1==Name3);
			System.out.println(Name1.equals(Name2));
			System.out.println(Name1.equals(Name3));
			Scanner sc = new Scanner(System.in);
			int s1 = sc.nextInt();
			System.out.println("Enter "+s1);
			//System.out.println();
		}
}

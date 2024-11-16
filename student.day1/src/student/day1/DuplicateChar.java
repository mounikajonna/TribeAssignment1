package student.day1;

import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string1 = sc.nextLine();
        String string2 = "";

        for (int i = 0; i < string1.length(); i++) {
            char ch = string1.charAt(i);

            
            if (i < string1.length() - 1 && ch == string1.charAt(i + 1)) {
                ch = '@'; 
                i++; 
            }
            
            string2 = string2 + ch;
        }

        sc.close();
        System.out.println("result" + string2);
    }
}
package student.day1;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargestSmallest {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {2,5,7,4,6,3};
		Arrays.sort(arr);
		System.out.println("Enter the value");
		int i = sc.nextInt();
		if (i>0  && i<=arr.length) {
			int largest = arr[arr.length - i];
			int smallest = arr[i-1];
			System.out.println("Array: " + Arrays.toString(arr));
            System.out.println(i + "th Smallest Element: " + smallest);
            System.out.println(i + "th Largest Element: " + largest);
        } else {
            System.out.println("Invalid input. N should be between 1 and " + arr.length);
        }
        
       
		}
		
		
	}


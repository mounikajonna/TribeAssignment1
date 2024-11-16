package student.day1;

import java.util.Arrays;

public class LargestSmallest {
 static int[] i = {3,7,8,5,9,5,1,1};
	
	public static void main(String[] args) {
		System.out.println(largestNumber(i));
		System.out.println(smallestNumber(i));
		System.out.println(Arrays.toString(sortingArray(i)));
	}
	
	
	
	public static int largestNumber(int[] array) {
		int max = array[0];
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		return max;
	}
	
	public static int smallestNumber(int[] array) {
		int min = array[0];
		for(int i=0;i>array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		return min;
	}
	
	public static int[] sortingArray(int[] array) {
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
	
	
}





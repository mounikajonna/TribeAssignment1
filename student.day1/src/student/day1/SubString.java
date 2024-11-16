package student.day1;

import java.util.Arrays;

public class SubString {
public static void main(String[] args) {
	int[] array = {3,7,4,6,5,11,2,1,8};
	subArray(array,10);
}
public static void subArray(int[] array,int val) {
	boolean isAdded = false;
	for(int i=0;i<array.length;i++) {
		for(int j=i+1;j<array.length;j++) {
			int sum = array[i]+array[j];
			if(!isAdded && array[i] == val) {
				int[] value = {array[i]};
				System.out.println(Arrays.toString(value));
				isAdded=true;
				}
		else if(!isAdded && array[j] == val) {
			int[] value = {array[j]};
			System.out.print(Arrays.toString(value));
			isAdded =true;
		}

			else if(val == sum) 
			{
				int[] value= {array[i],array[j]};
				System.out.println(Arrays.toString(value));
						}
				}
		}
	}
}


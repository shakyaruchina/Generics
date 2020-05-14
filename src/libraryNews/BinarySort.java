package libraryNews;

import java.util.Arrays;

public class BinarySort {
	public static <T extends Comparable<T>>int index( T[] elements, T element){
		return index(elements, element, 0, elements.length-1);
	}
	
	public static <T extends Comparable<T>>int index( T[] elements, T key, int low, int high){
		if(key == null)
			return -1;
		if(low>high)
			return -1;
		
		int mid = low +(high-low)/2;
		
		if(key.compareTo(elements[mid])>0)
			return index(elements,key,mid+1,high);
		else if (key.compareTo(elements[mid])<0)
		return index(elements,key,mid+1,high);
		else
			return mid;
	}


	public static void main(String[] args) {
		Integer [] elements = {21,56,98,2,33,76,43};
		
		Arrays.sort(elements);
		System.out.println("Sorted Integer Array");
		for(Integer element:elements) {
			System.out.println(element+" ");
		}
		
		int positionIndex = index(elements, Integer.valueOf(76));
		System.out.println("\nItem 76 is located at index = " + positionIndex);
		positionIndex = index(elements, Integer.valueOf(98));
		System.out.println("\nItem 98 is located at index = " + positionIndex);
		positionIndex = index(elements, Integer.valueOf(43));
		System.out.println("\nItem 43 is located at index = " + positionIndex);
		positionIndex = index(elements, Integer.valueOf(null));
		System.out.println("\nItem null is located at index = " + positionIndex);
		
		
	}
	
	
}

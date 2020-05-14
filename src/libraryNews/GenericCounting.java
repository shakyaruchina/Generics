package libraryNews;


import java.util.*;
public final class GenericCounting {
	
	
		public static <T> int countIf(Collection<T> c, Counting<T> p) {
			int count = 0;
			for(T element : c)
				if (p.test(element))
					++count;
			return count;
		}
	
	
	public interface Counting<T>{
		public boolean test(T obj);
	}
	
	
	
	//public static void main(String[] args) {
			//Collection<Integer> coll = Arrays.asList(1,2,3,4);
			//int count = GenericCounting.countIf(coll,new OddCount());
			//System.out.println("Number of odd integers = " + count);

		//}
	


}

	
	

	


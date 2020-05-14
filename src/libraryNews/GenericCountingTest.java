package libraryNews;

import java.util.Arrays;
import java.util.Collection;

import libraryNews.GenericCounting.Counting;

public class GenericCountingTest {

	public static void main(String[] args) {
		Collection<Integer> coll = Arrays.asList(1,2,3,4);
		int count = GenericCountingTest.countIf(coll,new OddCount());
		System.out.println("Number of odd integers = " + count);

	}
	private static int countIf(Collection<Integer> coll, OddCount oddCount) {
		// TODO Auto-generated method stub
		return 0;
	}
	class OddCount implements Counting<Integer>{
		public boolean test(Integer i) 
		{return i%2 !=0;}
	}

}

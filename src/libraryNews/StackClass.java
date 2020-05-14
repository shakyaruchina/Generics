package libraryNews;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack<String> stackOfCards = new Stack<>();
		
		//pushing
		stackOfCards.push("Ace");
		stackOfCards.push("Jack");
		stackOfCards.push("King");
		
		System.out.println("Stack " + stackOfCards);
		System.out.println();
		
		String cardAtTop = stackOfCards.pop();
		System.out.println("Stack pop " + cardAtTop);
		System.out.println("Current Stack " + stackOfCards);
		System.out.println();
		
		String str1 = "Hello";
		
		String str2 = "";
		
		System.out.println(str1.isEmpty());
		
		System.out.println(str2.isEmpty());
		
		
		
	}
	

}


//For Dictionary class

//V get (K key)
// void put(K key, V value)
// boolean idEmpty()
// Collection<K> keys()
 // Collection<V> values()	
 


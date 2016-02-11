import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		// Three types of SETS here are
		// HashSet, LinkedHashSet and TreeSet

		// HashSet anyorder,
		// LinkedHashSet the order entered,
		// TreeSet Alphabetical or natural order with int 1,2,3

		// ///HASHSET/////

		// Set<String> set1 = new HashSet<String>();

		// ///LINKEDHASHSET/////

		// LinkedHashSet retains the order in which you
		// add the items. It adds a link to the items so
		// order of input is retained.

		// Set<String> set1 = new LinkedHashSet<String>();

		// ///TREESET/////

		// TreeSet sorts in natural order...ex: 1, 2, 3 or Alpha
		// good for alphabetic sorting

		Set<String> set1 = new TreeSet<String>();

		Set<String> set2 = new LinkedHashSet<String>();

		set1.add("dog");
		set1.add("cat");
		set1.add("bird");
		set1.add("mouse");
		set1.add("rabbit");
		set1.add("fish");
		
		
		set2.add("family");
		set2.add("man");
		set2.add("woman");
		set2.add("child");
		set2.add("baby");
		set2.add("dog");
		set2.add("cat");

		// Adding duplication items does nothing
		// Since a SET can only contain unique items.

		set1.add("mouse");

		System.out.println(set1);

		// COMMON operations with SETS

		// ////Iteration///////

		// using a for loop set the a variable to hold the
		// element to loop
		// then(String element : the set you are iterating

		for (String element : set1) {
			System.out.println(element);

		}

		// /////Does Set contain///////
		// sets are optimized for finding particular data.

		if (set1.contains("dog")) {
			
			System.out.println("Animal is in the list");

		}
		if (set1.contains("eagle")) {
			
			System.out.println("Animal is in the list");

		}
		
		////////Check if set is empty/////////
		
		/*
		   if (set1.isEmpty()){
			System.out.println("The set is Empty");
		}else
		{
			System.out.println("Set1 contains data");
		}
		*/
		
		////////Returns the number of elements in the set
		
		int setSize = set1.size();
		
		System.out.println(setSize);
		
		
		//////empty the set/////
		
		//set1.clear();
		//display the empty set
		//setSize=set1.size();
		//System.out.println(setSize);
		
		
		////Intersection//// 
		///Compares and retains only those in both sets in the new set.
		
		//First a copy of the first set is made mine is called intersection
		Set<String> intersection = new HashSet<String>(set1);
		System.out.println("This is the intersectoin set: "+intersection);

		//This keep only the elements in intersection which appear in both sets
		intersection.retainAll(set2);
		System.out.println("This is the intersectoin set: "+intersection);
		
		
		///////Difference////////////
		Set<String> difference = new HashSet<String>(set2);
		difference.removeAll(set1);
		System.out.println(difference);
		
	}

}

/*
 * Written by Adam Hoover
 */
public class stringHelperTester {

	public static void main(String[] args) {
		System.out.println("Welcome to the String Helper Tester!");
		
		System.out.println("\nTesting Has All Unique Characters with \"facetiously\" ");
		System.out.println(StringHelper.hasAllUniqueCharactes("facetiously"));
		
		System.out.println("\nTesting Has All Unique Characters with \"banana\" ");
		System.out.println(StringHelper.hasAllUniqueCharactes("banana"));
		
		System.out.println("\n\nTesting Mesh Strings with \"harp\" and \"fiddle\" ");
		System.out.println(StringHelper.meshStrings("harp","fiddle"));
		
		System.out.println("\n\nTesting Replace Vowels with Oodle with \"burrito\" ");
		System.out.println(StringHelper.replaceVowelsWithOodle("burrito"));
		
		System.out.println("\n\nTesting Weight with \"heavy\" ");
		System.out.println(StringHelper.weight("heavy"));
		
		System.out.println("\n\nTesting Weight with \"light\" ");
		System.out.println(StringHelper.weight("light"));

	}

}

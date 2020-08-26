/*
 * Written by Adam Hoover
 */
public class StringHelper {
	//Unique characters method
	public static boolean hasAllUniqueCharactes(String str)
	{
		String s = str.toLowerCase();
		for (int i=0; i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if (s.charAt(i) == s.charAt(j))
				{
					return false;
				}
			}
		}
		return true; 
	}
	//Replace Vowels Method
	public static String replaceVowelsWithOodle(String str)
	{
		String ret = " ";
		String s = str.toLowerCase();
		for (int i=0; i<s.length();i++)
		{
			if (s.charAt(i) == 'a' || 
					s.charAt(i) == 'e' ||
					s.charAt(i) == 'i' ||
					s.charAt(i) == 'o' ||
					s.charAt(i) == 'u')
			{
				ret += "oodle";
			}
			else
			{
				ret += s.substring(i,i+1);
			}
		}	
		return ret;
	}
	//Weight method
	public static double weight(String str)
	{
		double ret = 0.0;
		String s = str.toLowerCase();
		for (int i = 0; i<s.length();i++)
		{
			if (s.charAt(i) == 'a' || 
					s.charAt(i) == 'e' ||
					s.charAt(i) == 'i' ||
					s.charAt(i) == 'o' ||
					s.charAt(i) == 'u')
			{
				ret += 2.5;
			}
			else 
			{
				ret += 3.4;
			}
		}
		return ret; 
	}
	//Mesh strings method
	public static String meshStrings(String str1, String str2)
	{
		String bigString = str1;
		String smallString = str2;
		
		if (str1.length() < str2.length())
		{
			bigString = str2;
			smallString = str1; 
		}
		String ret = " ";
		for (int i=0;i<smallString.length();i++)
		{
			ret += (str1.charAt(i)+""+str2.charAt(i));
		}
		ret += bigString.substring(smallString.length());
		return ret;	
	}
	
	
}

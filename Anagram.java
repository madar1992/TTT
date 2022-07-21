import java.util.*;

public class Anagram 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first string:");
    String str1 = sc.next();
    System.out.println("enter Second string:");
    String str2 = sc.next();
    boolean valid=isAnagram(str1,str2);
    if(valid)
      System.out.println("two strings are anagrams");
    else
      System.out.println("two strings are not anagrams");    
  }
  public static boolean isAnagram(String s1, String s2)
  {
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();

    // check if length is same
    if (s1.length() == s2.length()) 
    {

      // convert strings to char array
      char[] charArray1 = s1.toCharArray();
      char[] charArray2 = s2.toCharArray();

      // sort the char array
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      // if sorted char arrays are same
      // then the string is anagram
      boolean result = Arrays.equals(charArray1, charArray2);

      if (result) 
      {
        return true;
      } 
      else
      {
        return false;
      }
    }
     else
     {
      return false;
     }
  }
}
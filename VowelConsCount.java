//program to count the vowel and consonant count in a string

import java.util.Scanner;

public class VowelConsCount
{

    public static void main(String[] args)
  {

      Scanner sc=new Scanner(System.in);
      System.out.println("enter string containing alphabets only"); 
      String str = sc.next();
      int len=str.length();
      int vowelcount=0;
      int concount=0;
      String str1=str.toLowerCase();
      for(int i=0;i<len;i++)
      {
          char c = str1.charAt(i);
          if( (c == 'a' || c == 'e') || c == 'i' || c =='o' || c=='u')
                vowelcount++;
          else 
               concount++;
          
      }
      System.out.println("no.of vowels are:"+ vowelcount);
      System.out.println("no.of consonants are:"+concount);
              
  }           
}
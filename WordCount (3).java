//program to count the words in a string

import java.util.*;

public class WordCount
{

    public static void main(String[] args)
  {
      
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any string "); 
      String str = sc.nextLine();
      //int len=str.length();
       //StringTokenizer tokens = new StringTokenizer(str);
      String[] words= str.split(" ");
      int count=0;
       for(String word:words)
          count++;
      System.out.println("word count:"+ count);
    
  }
}
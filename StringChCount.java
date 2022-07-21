//program to count the alphabets, digits and special chars in a string

import java.util.Scanner;

public class StringChCount 
{

    public static void main(String[] args)
  {

      Scanner sc=new Scanner(System.in);
      System.out.println("enter user name"); 
      String str = sc.next();
      int len=str.length();
      int alphacount=0;
      int digitcount=0;
      int spsymbol=0;
      for(int i=0;i<len;i++)
      {
          char c = str.charAt(i);
          if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                alphacount++;
          else if(c>='0'&& c<='9') 
                    digitcount++;
          else
                    spsymbol++;
      }
      System.out.println("no.of alphabets are:"+alphacount);
      System.out.println("no.of digits are:"+digitcount);
      System.out.println("no.of special characters are:"+spsymbol);        
  }           
}
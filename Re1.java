//regular expression program

import java.util.Scanner;

public class Re1 {

    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      System.out.println("enter user name"); 
      String username = sc.next();
      boolean valid=false;
      int len=username.length();
      if((len>=8)&&(len<=30))
      {
        char ch = username.charAt(0);
        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
          for(int i=1;i<len;i++)
            {
              char c = username.charAt(i);
              if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')|| c=='_'|| (c>='0'&& c<='9')) 
                valid=true;
               
              else
              {
               valid=false;
                 break; 
              }
                
            }
           if(valid)
           {
             System.out.println("valid username");
           }
           else
           {
             System.out.println("invalid username");
           }
        }
        else
          System.out.println("invalid username");
        
      }
      else
        System.out.println("invalid username");
}
}
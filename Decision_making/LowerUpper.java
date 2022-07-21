//WWrite a java program to check whether a character is uppercase or lowercase     alphabet.
import java.util.*;
class LowerUpper
{
	public static void main(String args[])
	{
		char c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any  alphabet");
		c=s.next().charAt(0);
		
		if(c>='a'&&c<='z')
  		   System.out.println(c+" is lower case alphabet");
  		else if(c>='A'&&c<='Z')
  		   System.out.println(c+" is upper case alphabet");
	        else
   			System.out.println(c+" invalid input");
  
    		
	}
}
//Write a java program to check whether a character is alphabet or not
import java.util.*;
class Alphabet
{
	public static void main(String args[])
	{
		char c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any  character");
		c=s.next().charAt(0);
		
		if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            		System.out.println(c + " is an alphabet.");
        	else
            		System.out.println(c + " is not an alphabet.");
		
    		
	}
}
/*Write a java program to input marks of five subjects Physics, Chemistry, Biology,     Mathematics and Computer. Calculate percentage and grade according to     following:
    Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
    Percentage < 40% : Grade F*/
import java.util.*;
class Grade
{
	public static void  main(String a[])
	{
		int py,chem,bio,mat,com;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter marks of physics subjects");
		py=s.nextInt();
		System.out.println("Enter marks of chemistry subjects");
		chem=s.nextInt();
		System.out.println("Enter marks of Biology subjects");
		bio=s.nextInt();
		System.out.println("Enter marks of Mathemetics subjects");
		mat=s.nextInt();
		System.out.println("Enter marks of computers subjects");
		com=s.nextInt();
		int avg=((py+chem+bio+mat+com)/400)*100;
		if(avg>=90)
		System.out.println("Grade A");
		else if(avg>=80)
		System.out.println("Grade B");
		else if(avg>=70)
		System.out.println("Grade c");
		else if(avg>=60)
		System.out.println("Grade D");
		else if(avg>=40)
		System.out.println("Grade E");
		else
		System.out.println("Grade F");
	}
}
		
		

		
		
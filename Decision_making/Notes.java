//Write a java program to count total number of notes in given amount.
import java.util.*;
class Notes
{
	public static void main(String ar[])
	{
		int amount;
		Scanner d=new Scanner(System.in);
		System.out.println("Enter amount");
		amount=d.nextInt();
		int note2000,note500,note200,note100,note50,note20,note10,note5,note2,note1;
		note2000=note500=note200=note100=note50=note20=note10=note5=note2=note1=0;
		while(amount>0)
		{
		if(amount>=2000)
		{
			note2000=note2000+(amount/2000);
			amount=amount%2000;
		}
		 else if(amount>=500)
		{
			note500=note500+(amount/500);
			amount=amount%500;
		}
		 else if(amount>=200)
		{
			note200=note200+(amount/200);
			amount=amount%200;
		}
		 else if(amount>=100)
		{
			note100=note100+(amount/100);
			amount=amount%100;
		}
		 else if(amount>=50)
		{
			note50=note50+(amount/50);
			amount=amount%50;
		}
		 else if(amount>=20)
		{
			note20=note20+(amount/20);
			amount=amount%20;
		}
		 else if(amount>=10)
		{
			note10=note10+(amount/10);
			amount=amount%10;
		}
		 else if(amount>=5)
		{
			note5=note5+(amount/5);
			amount=amount%5;
		}
		 else if(amount>=2)
		{
			note2=note2+(amount/2);
			amount=amount%2;
		}
		else
		{
			note1=1*amount;
		}
		}
		if(note2000!=0)
			System.out.println("number of 2000 notes"+note2000);
		 if(note500!=0)
			System.out.println("number of 500 notes"+note500);
		if(note200!=0)
			System.out.println("number of 200 notes"+note200);
		 if(note100!=0)
			System.out.println("number of 100 notes"+note100);
		 if(note50!=0)
			System.out.println("number of 50 notes"+note50);
		 if(note20!=0)
			System.out.println("number of 20 notes"+note20);
		 if(note10!=0)
			System.out.println("number of 10 notes"+note10);
		 if(note5!=0)
			System.out.println("number of 5 notes"+note5);
		 if(note2!=0)
			System.out.println("number of 2 notes"+note2);
		 if(note1!=0)
			System.out.println("number of 1 notes"+note1);
	}
}
			
			

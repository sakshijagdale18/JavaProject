import java.util.Random;
import java.util.Scanner;
public class Number 
{
	public static void main(String[] args)
	{
		Random rand=new Random();
     Scanner scanner=new Scanner(System.in);
     int random=rand.nextInt(100)+1;
     int Count=0;
     while(true)
     {
     System.out.println("Guess a random number between 1 to 100");
     int Guess=scanner.nextInt();
     Count++;
		if(Guess==random)
		{
			System.out.println("Guess is Correct");
       System.out.println("Users Score are "+Count+"  ,User is Win");
       break;
		}
		else if(Guess<random)
		{
			System.out.println("Guess is higher");
       
		}
     else
     {
       System.out.println("Guess is low");
     }
    }
    scanner.close();
	}
	
}

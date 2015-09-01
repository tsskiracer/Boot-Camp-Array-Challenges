import java.util.Scanner;

public class BootCampArrayChallenge2
	{

		public static void main(String[] args)
			{
				Scanner userInput= new Scanner(System.in);
				System.out.println("Please input 8 numbers.");
				int myArray[] = new int[8];
				int num = userInput.nextInt();
				int sum1 = 0;
				int sum2 = 0;
				for (int i = 0; i<myArray.length; i++)
					{
						myArray[i]=(num%10);
						num/=10;
						if (myArray[i]%2==1)
							{
								sum1+=myArray[i];
								
								
							}
						if (myArray[i]%2==0)
							{
								sum2+=myArray[i];
								
							}
					}
				System.out.println("The sum of the odd numbers = " + sum1);
				System.out.println("The sum of the even numbers = " + sum2);
				
				
			}

	}

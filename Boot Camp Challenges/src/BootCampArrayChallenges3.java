import java.util.Scanner;
public class BootCampArrayChallenges3
	{

		public static void main(String[] args)
			{
				Scanner userInput= new Scanner(System.in);
				System.out.println("Please input a 4 digit number.");
				int num = userInput.nextInt();
				int myArray[] = new int[4];
				for (int i=0; i<myArray.length; i++)
				{
					myArray[i]=(num%10);
					num/=10;
				}
				for (int fred:myArray)
				{
					System.out.println(fred);
				}

			}

	}

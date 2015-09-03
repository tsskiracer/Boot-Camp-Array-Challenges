
public class BootCampArrayChallenges4
	{

		public static void main(String[] args)
			{
				int myArray [] = new int [5];
				for (int i=0; i<myArray.length; i++)
					{
						int x = (int)((Math.random() * 90)+10);
						myArray[4-i]=x;
					}
				for (int fred:myArray)
				{
					System.out.println(fred);
					
				}

			}

	}

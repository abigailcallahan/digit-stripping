import java.util.Scanner;

public class DigitStripping
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner (System.in);
				System.out.println("Type a number and I will say it in reverse");
				int number = userInput.nextInt();

				while(number > 0)
					{
					int digit = number % 10;
					System.out.print(digit);
					number = number / 10;
					}
			}
	}


import java.util.Scanner;
public class PLD_number {
	public static void main(String[] args) {
		
				Scanner s = new Scanner(System.in);
				System.out.println("ene=ter a number :");
				int n = s.nextInt();
				int rem ,sum = 0;
				int temp = n;
				while (n!=0)
				{
		            rem = n%10;
		            sum = sum*10+rem ;
		            n = n/10;
				}
				if(sum == temp)
		       System.out.println("palindrome number.");
				else 
					System.out.println("Not a palindrome number. ");
			}
	}


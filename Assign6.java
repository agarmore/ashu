/* sum of digits of the given integer no*/
import java.util.Scanner;

class Assign6
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Enter No:");
		int no=scan.nextInt();
		
		while(no!=0)
		{
			int digit=no%10;
			sum=sum+digit;
			no=no/10;
			//System.out.println(reverse);
			
		}
		System.out.println("Sum of given No:"+sum);

	}
} 
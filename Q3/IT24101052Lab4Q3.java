import java.util.Scanner;
public class IT24101052Lab4Q3
{
	public static void main(String[] args)
	{
		int num;
		String result;

		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=input.nextInt();
		
		result= (num>0) ? "The number is: Positive" :
		 	(num<0) ? "The number is : Negative" :
			"The number is: Zero" ;
		System.out.println(result);
	}
}
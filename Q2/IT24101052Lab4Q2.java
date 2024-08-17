import java.util.Scanner;
public class IT24101052Lab4Q2
{
	public static void main(String[] args)
	{
		
		Scanner input=new Scanner(System.in);
		int marks, labSubmission, marksPercentage, labSubmissionPercentage;

		System.out.println("Please enter exam marks( out of 100): ");
		marks=input.nextInt();
		if((marks>100)|| (marks<0))
		{
			System.out.println("Invalid input for exam marks. Terminating program.");
			return;
		}
		Scanner input1=new Scanner(System.in);
		System.out.println("Please enter lab submission marks (out of 100):");
		labSubmission=input1.nextInt();
		if((marks>100)|| (marks<0))
		{
			System.out.println("Invalid input for lab submission marks. Terminating program.");
			return;
		}

		Scanner input2=new Scanner(System.in);
		System.out.println("Please enter the percentage given for the exam:");
		marksPercentage=input2.nextInt();
		Scanner input3=new Scanner(System.in);
		System.out.println("Please enter the percentage given for the lab submission:");
		labSubmissionPercentage=input3.nextInt();
		
		if((marksPercentage + labSubmissionPercentage)!=100)
		{
			System.out.println("The percentage must add up to 100. Terminating program.");
			return;
		}
		
		double finalGrade = (marks * marksPercentage / 100.0) + (labSubmission * labSubmissionPercentage / 100.0);
		System.out.println("Final Exam mark is: " + finalGrade);
	}
}

		
		
		


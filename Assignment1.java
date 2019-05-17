//*************************************************************************************************************************************************************
// Assignment1.java      CPSC-5100       Author: Debra Ragland
// 
// This program is designed for the user to interactively input test scores and assignment scores ranking the scores from lowest weight to highest weight. 
//	likewise, the user is asked to input the actual weights from lowest to highest in decimal format. Author is aware that this may not be the most efficient program
// but I have only ever written one program using R so I do not have the whereithal to write more efficient programs in Java. 
// I did my best! Please see comments below.
//
//**************************************************************************************************************************************************************
import java.util.Scanner;
public class Assignment1 {
	public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------
		// First section asks user to input test scores ranking from lowest weight to highest weight.	
//----------------------------------------------------------------------------------------------------------
		int Exam1, Exam2, Exam3, Exam4, Exam5, Exam6, Assn1, Assn2, Assn3, Assn4, Assn5, Assn6;
		double weightedexams, weightedassns, weightedavg, ExamW1, ExamW2, ExamW3, ExamW4, ExamW5, ExamW6, AssnW1, AssnW2, AssnW3, AssnW4, AssnW5, AssnW6;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter all 6 of your Test scores ranking from lowest weight to highest weight, press return after each entry:");
		
		Exam1 = scan.nextInt();
		Exam2 = scan.nextInt();
		Exam3 = scan.nextInt();
		Exam4 = scan.nextInt();
		Exam5 = scan.nextInt();
		Exam6 = scan.nextInt();
//---------------------------------------------------------------------------------------------------------
				// Second section asks user to input test weights ranking from lowest weight to highest weight.	
//----------------------------------------------------------------------------------------------------------	
		System.out.print("Please enter all 6 of the Test weights (as 0.XX) from lowest weight to highest weight, press return after each entry:");
		
		ExamW1 = scan.nextDouble();
		ExamW2 = scan.nextDouble();
		ExamW3 = scan.nextDouble();
		ExamW4 = scan.nextDouble();
		ExamW5 = scan.nextDouble();
		ExamW6 = scan.nextDouble();
		
		weightedexams = ((Exam1 * ExamW1 ) + (Exam2 * ExamW2) + (Exam3 * ExamW3) + (Exam4 * ExamW4) + (Exam5 * ExamW5) + (Exam6 * ExamW6)); //computes weighted test score average
		
		System.out.println("Weighted Exam Average = " + weightedexams);

//---------------------------------------------------------------------------------------------------------
		// Third section asks user to input assignment scores ranking from lowest weight to highest weight.	
//----------------------------------------------------------------------------------------------------------
		
        System.out.print("Please enter all 6 of your Assignment scores ranking from lowest weight to highest weight, press return after each entry:");
		
		Assn1 = scan.nextInt();
		Assn2 = scan.nextInt();
		Assn3 = scan.nextInt();
		Assn4 = scan.nextInt();
		Assn5 = scan.nextInt();
		Assn6 = scan.nextInt();
		
//---------------------------------------------------------------------------------------------------------
				// Fourth section asks user to input assignment weights ranking from lowest weight to highest weight.	
//----------------------------------------------------------------------------------------------------------
		
        System.out.print("Please enter all 6 of the Assignment weights (as 0.XX) from lowest weight to highest weight, press return after each entry:");
		
		AssnW1 = scan.nextDouble();
		AssnW2 = scan.nextDouble();
		AssnW3 = scan.nextDouble();
		AssnW4 = scan.nextDouble();
		AssnW5 = scan.nextDouble();
		AssnW6 = scan.nextDouble();
		
		weightedassns = ((Assn1 * AssnW1) + (Assn2 * AssnW2) + (Assn3 * AssnW3) + (Assn4 * AssnW4)+ (Assn5 * AssnW5) + (Assn6 * AssnW6)); //computes the weighted assignment averages
		
		System.out.println("Weighted Assingment Average = " + weightedassns);
		
		weightedavg = ((weightedexams + weightedassns)/2);
		
		System.out.println("Overall Weighted Average = " + weightedavg);//computes the overall weighted average
		
	}

}


// this is a project for calculating the mark of students
//step-1 take the number of students from the user
// define the array 
//sum the mark and give the output


package Day_two_java_Learning;

import java.util.Scanner;

public class for_loop_example {
	
	public static void main (String [] args) {
		
		System.out.println("enter the number of students");
		Scanner scanner = new Scanner(System.in);
		int no_of_student = scanner.nextInt();
		
		// define the array;
		int[] num = new int[no_of_student];
		
		// code for entering the value from the user 
		
		for(int i = 0 ; i< no_of_student;i++ ) {
			
			System.out.println("enter the mark of " + (i+1) + " student");
			num[i] =  scanner.nextInt();
		
		}
		
		// code for printing the value entered by the user
		
		for(int j = 0; j < no_of_student;j++) {
			
			System.out.println("student : "+ (j+1) +" mark : " + num[j]);
		}
		
		// code for taking the sum of user entered value from the array
		
		System.out.println("total mark of all students");
		
		int sum = 0;
		for(int k=0;k<no_of_student;k++) {
			 sum = sum + num[k];
		}
		
		System.out.println(sum);
		
		// code for checking a mark of student
		
		scanner.nextLine();// for consuming the left overs
		
		System.out.println(" do you want to check individual mark of student [ y / n ]");
		String choice  = scanner.nextLine();
		
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.println("mark of  which student do you want to know from (  1 : " + no_of_student+ ")" );
			
			int number_of_student = scanner.nextInt();
			
			if(number_of_student >= 1 && number_of_student<=no_of_student ) {
				
				System.out.println("student : "+ number_of_student + " ,  mark : "  + num[number_of_student-1]);
				
				
			}
			else {
				System.out.println("please enter a valid number of student list");
			}
			
			scanner.nextLine();
			System.out.println("do you want to check mark of another student");
			choice = scanner.nextLine();
			
			
		}
		
		System.out.println("thank you ! Programme exited");
		
	}

}

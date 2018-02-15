//Yared (jr) Ansera
//Object-Oriented-Programming
//Programming assignment 1 (Due Jan 30)
/*Read in information about 5 exercises and scores.
Display this information in a table and find the percentage*/

import java.text.DecimalFormat;
import java.util.Scanner;


public class GradeBook {
public static void main(String[] args){
		
		Scanner cin=new Scanner(System.in);
		DecimalFormat percent= new DecimalFormat("0.00%");
		
	
		//collecting information on Exercise 1
		System.out.println("Enter name of exercise 1: ");
			String nameEx1= cin.nextLine();
			
			
		System.out.println("Enter total points possible for exercise 1: ");
			int totalEx1= cin.nextInt();
			
		System.out.println("Enter score received for exercise 1: ");
			int earnEx1= cin.nextInt();
				
				cin.nextLine(); //Clear junk \n
			
			
		//collecting information on Exercise 2
		System.out.println("Enter name of exercise 2: ");
			String nameEx2= cin.nextLine();
				
				
		System.out.println("Enter total points possible for exercise 2: ");
			int totalEx2= cin.nextInt();
				
		System.out.println("Enter score recieved for exercise 2: ");
			int earnEx2= cin.nextInt();	
				
				cin.nextLine(); //Clear junk \n
				
				
		//collecting information on Exercise 3
		System.out.println("Enter name of exercise 3: ");
			String nameEx3= cin.nextLine();
					
				
		System.out.println("Enter total points possible for exercise 3: ");
			int totalEx3= cin.nextInt();
					
		System.out.println("Enter score recieved for exercise 3: ");
			int earnEx3= cin.nextInt();		
				
				cin.nextLine(); //Clear junk \n
					
					
		//collecting information on Exercise 4
		System.out.println("Enter name of exercise 4: ");
			String nameEx4= cin.nextLine();
						
					
		System.out.println("Enter total points possible for exercise 4: ");
			int totalEx4= cin.nextInt();
						
		System.out.println("Enter score recieved for exercise 4: ");
			int earnEx4= cin.nextInt();		
				
				cin.nextLine(); //Clear junk \n
				
				
		//collecting information on Exercise 5
		System.out.println("Enter name of exercise 5: ");
			String nameEx5= cin.nextLine();
						
						
		System.out.println("Enter total points possible for exercise 5: ");
			int totalEx5= cin.nextInt();
							
		System.out.println("Enter score recieved for exercise 5: ");
			int earnEx5= cin.nextInt();		
				
				
				
				cin.close();		
			
	//outputting the table and formatting
		System.out.println("****************Score Summary*****************");
		
		System.out.println("Exercise\t\t\tScore\t\t\tTotal Possible");
		
		System.out.printf("%-24S\t%-2d\t%18d\n",nameEx1,earnEx1,totalEx1);
		System.out.printf("%-24S\t%-2d\t%18d\n",nameEx2,earnEx2,totalEx2);	
		System.out.printf("%-24S\t%-2d\t%18d\n",nameEx3,earnEx3,totalEx3);	
		System.out.printf("%-24S\t%-2d\t%18d\n",nameEx4,earnEx4,totalEx4);
		System.out.printf("%-24S\t%-2d\t%18d\n",nameEx5,earnEx5,totalEx5);
	
	
	//determine and display final percent
		
		int total=totalEx1+totalEx2+totalEx3+totalEx4+totalEx5;
		
		int score=earnEx1+earnEx2+earnEx3+earnEx4+earnEx5;
		
		double percentScore= (double)score/(double)total;
		
		System.out.println("Your total is "+(double)score+" out of "+(double)total
						  +", or "+ percent.format(percentScore));
		
		
		
	}

}



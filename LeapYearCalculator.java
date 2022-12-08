package patika;
import java.util.Scanner;

public class LeapYearCalculator {

public static void main(String[]args) {
	
int year;
    
    System.out.print("Enter the year : ");
	Scanner input = new Scanner(System.in);
    year = input.nextInt() ;
    
	if (year % 4 == 0 ) {
		System.out.print(year +" is a leap year.");
	}else
		System.out.print(year + " is not a leap year.");
	}
   
}


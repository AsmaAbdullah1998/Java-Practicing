import java.util.*;
public class Ex100 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter : ");
		int number = input.nextInt();
		for(int i = number; i>=1; i--) {
			for(int space = 1; space<=number-i; space++)
				System.out.print(" ");
			for(int stars = 1; stars<=(2*i) - 1; stars++)	
				System.out.print("*");
			
			System.out.println();
			
			if(i == 1) {
				for(i = 1; i<=number; i++) {
					for(int space = 1; space<=number-i; space++)
						System.out.print(" ");
					for(int stars = 1; stars<=2*i - 1; stars++)
						System.out.print("*");
					
				System.out.println();	
				}//end for lower part 
			}//end if cond
			
			
		}//end for loop
		
		
		
	}//end main
	
}//end class

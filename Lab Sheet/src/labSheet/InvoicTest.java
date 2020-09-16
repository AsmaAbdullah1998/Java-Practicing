package labSheet;

import java.util.Scanner;

public class InvoicTest {

	public static void main(String[] args) {

		Invoic invoic1 = new Invoic("1234", "Hammer", 2, 14.95);
		System.out.println("Original information");
		invoic1.info();
		System.out.printf("Invoic amount: %.2f%n",invoic1.getInvoiceAmount() );
		System.out.println();
		
		
		
		System.out.println("Updated invoic information");
		invoic1.setAll("001234", "Yellow Hammer", 3, 19.49);
		invoic1.info();
		System.out.printf("Invoic amount: %.2f%n",invoic1.getInvoiceAmount() );
		System.out.println();
		
		
		Invoic invoic2 = new Invoic("5678", "Paint Brush", -4, -2);
		System.out.println("Original invoice information");
		invoic2.getInvoiceAmount();
		invoic2.info();
		System.out.printf("Invoic amount: %.2f%n",invoic2.getInvoiceAmount() );
		System.out.println();
		
		System.out.println("Updated invoic information");
		invoic2.setQuantity(3);
		invoic2.setPrice(9.49);
		invoic2.info();
		System.out.printf("Invoic amount: %.2f%n",invoic2.getInvoiceAmount() );
		System.out.println();
		

	}

}

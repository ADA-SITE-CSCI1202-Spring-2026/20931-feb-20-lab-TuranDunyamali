package week03.invoice;

import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Create an array that holds exactly 2 invoices
        Invoice[] invoices = new Invoice[2];

        // 2. Loop 2 times to ask the user for information
        for (int i = 0; i < 2; i++) {
            System.out.println("\n--- Enter Details for Invoice " + (i + 1) + " ---");

            System.out.print("Enter Number (no spaces): ");
            String number = scanner.next();

            System.out.print("Enter Description (no spaces): ");
            String description = scanner.next();

            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();

            // Create the object and save it into the array slot
            invoices[i] = new Invoice(number, description, quantity, price);
        }

        // 3. Print out the results
        System.out.println("\n*** INVOICE TOTALS ***");
        
        for (int i = 0; i < 2; i++) {
            // Get the invoice from the array
            Invoice currentInvoice = invoices[i];
            
            // Print out the number and the calculated total
            System.out.println("Invoice " + currentInvoice.getInvoiceNumber() + 
                               " Amount: $" + currentInvoice.getInvoiceAmount());
        }

        scanner.close();
    }
}
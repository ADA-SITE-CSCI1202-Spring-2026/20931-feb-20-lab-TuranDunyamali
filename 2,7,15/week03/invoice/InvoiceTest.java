package week03.invoice;
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1234", "Laptop", 2, 999.99);
        System.out.println("Invoice Number: " + invoice.getInvoiceNumber());
        System.out.println("Description: " + invoice.getInvoiceDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
    
    }
}
package week03.invoice;

public class Invoice {
    private String invoiceNumber;
    private String invoiceDescription;
    private int quantity;
    private double pricePerItem;
    public Invoice (String invoiceNumber, String invoiceDescription, int quantity, double pricePerItem) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceDescription = invoiceDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setInvoiceDescription(String invoiceDescription) {
        this.invoiceDescription = invoiceDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getInvoiceDescription() {
        return invoiceDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getInvoiceAmount() {
        return pricePerItem;
    }

}
package solid_principles;

// A class should only have one reason to change
// In this example, InvoiceDao class is responsible for saving invoice to persistent storage
// InvoicePrinter class is responsible for printing invoice details
// Invoice class is responsible for managing invoice details
// Marker class represents a marker item with its details
// This class demonstrates the Single Responsibility Principle

public class SingleResponsibility {

    public static void main(String[] args) {
        // Creating a Marker object with details
        Marker marker = new Marker("Marker", "Blue", 2020, 10.99);

        // Creating an Invoice object for the marker with quantity
        Invoice invoice = new Invoice(marker, 10);

        // Creating an InvoiceDao object to handle persistence logic
        InvoiceDao invoiceDao = new InvoiceDao(invoice);

        // Saving the invoice to some persistent storage
        invoiceDao.saveInvoice();
    }
}

// Marker class represents a marker item with its details
class Marker {

    String name;   // Name of the marker
    String color;  // Color of the marker
    int year;      // Year the marker was manufactured
    double price;  // Price of the marker

    // Constructor to initialize marker attributes
    public Marker(String name, String color, int year, double price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    // Overriding toString method to represent a Marker object as a string
    @Override
    public String toString() {
        return "Marker{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}' + "\n";
    }
}

// Invoice class is responsible for managing invoice details
class Invoice {

    private Marker marker;   // Marker object being purchased
    private int quantity;    // Quantity of markers purchased

    // Constructor to initialize invoice with a marker and its quantity
    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    // Method to calculate the total cost of the invoice
    public double calculateTotal() {
        return quantity * marker.price;
    }
}

// InvoicePrinter class is responsible for printing invoice details
class InvoicePrinter {

    private Invoice invoice;  // Invoice object to be printed

    // Constructor to initialize the printer with an invoice
    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    // Method to print the invoice total
    public void printInvoice() {
        System.out.println(invoice.calculateTotal());
    }
}

// InvoiceDao class is responsible for saving invoice to persistent storage
class InvoiceDao {

    private Invoice invoice;  // Invoice object to be saved

    // Constructor to initialize DAO with an invoice
    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    // Method to save the invoice, demonstrating persistence logic
    public void saveInvoice() {
        System.out.println("Saving invoice");
        System.out.println("Total: " + invoice.calculateTotal());
        System.out.println("Invoice saved");
    }
}

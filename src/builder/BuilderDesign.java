package builder;

public class BuilderDesign {

    public static void main(String[] args) {

        // Use the Builder to construct a Product object
        Product product = new Product
                .Builder() // Initialize the Builder
                .id(1L) // Set the ID of the product
                .name("Product 1") // Set the name of the product
                .price(10.0) // Set the price of the product
                .build(); // Build the final Product object

        // Print the constructed Product object
        System.out.println(product);
    }
}

// Product class represents the object to be created using the Builder
class Product {
    private Long id; // Unique identifier for the product
    private String name; // Name of the product
    private double price; // Price of the product

    // Private constructor to ensure objects are created only through the Builder
    public Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        // Custom toString method for printing the Product's details
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}' + "\n";
    }

    // Static nested Builder class to construct Product objects
    public static class Builder {
        private Long id; // Field for the product ID
        private String name; // Field for the product name
        private double price; // Field for the product price

        // Method to set the ID and return the builder instance for chaining
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        // Method to set the name and return the builder instance for chaining
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        // Method to set the price and return the builder instance for chaining
        public Builder price(double price) {
            this.price = price;
            return this;
        }

        // Method to build and return the final Product object
        public Product build() {
            return new Product(this); // Pass the builder to the Product constructor
        }
    }
}

public class Product implements Comparable<Product> {
    private String name;
    private int priceCents;

    public Product(String name, int priceCents) {
        this.name = name;
        this.priceCents = priceCents;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.priceCents;
    }

    @Override
    public int compareTo(Product other) {
        // write your code here
        return this.priceCents - other.priceCents;
    }
}
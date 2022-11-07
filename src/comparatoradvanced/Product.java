package comparatoradvanced;

import java.util.Comparator;

public class Product {
    private String name;
    private int priceCents;
    private int stockLevel;

    public Product(String name, int priceCents, int stockLevel) {
        this.name = name;
        this.priceCents = priceCents;
        this.stockLevel = stockLevel;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.stockLevel + " @ $" + this.priceCents / 100.0;
    }

    /**
     * This comparator should sort products alphabetically (or lexicographically)
     * by their name.
     */
    static class AlphabeticalComparator implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            // write your code here
            return (int) p1.name.charAt(0) - (int) p2.name.charAt(0);
        }
    }

    /**
     * This comparator should sort products by whether or not they are in stock,
     * then in ascending order by their price.
     *
     * After sorting, products that have a positive stock level should appear
     * before products that have a stock level of 0. If two products being
     * sorted are either 1) both in stock; or 2) both out of stock, they
     * should then be sorted based on their price in ascending order.
     */
    static class PriceStockComparator implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            // write your code here
            if (p1.stockLevel == p2.stockLevel) {
                return p1.priceCents - p2.priceCents;
            } else if (p1.stockLevel < 0 && p2.stockLevel < 0) {
                return p1.priceCents - p2.priceCents;
            } else if (p1.stockLevel > 0 && p2.stockLevel >0) {
                return p1.priceCents - p2.priceCents;
            } else return p2.stockLevel - p1.stockLevel;
        }
    }
}

package warehousing;

// Part 1: Product warehouse, step 1
public class ProductWarehouse extends Warehouse {

    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    // Part 2: Product warehouse, step 2
    public void setName(String newName) {
        this.productName = newName;
    }

    // Part 2: Product warehouse, step 2
    @Override
    public String toString() {
        return productName + ": " + super.toString();
    }

}

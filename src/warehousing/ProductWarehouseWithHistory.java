package warehousing;

// Part 5: Product warehouse with history, step 1
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName,
                                       double capacity, double initialBalance) {
        super(productName, capacity);
        history = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        history.add(initialBalance);
    }

    public String history() {
        return history.toString();
    }

    // Part 6: Product warehouse with history, step 2
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(super.getBalance());
    }

    // Part 6: Product warehouse with history, step 2
    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        return amountTaken;
    }

    // Part 7: Product warehouse with history, step 3
    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + String.format("%,.1f",history.average()));
    }

}

package warehousing;

public class Main {
    public static void main(String[] args) {
        // Part 1: Product warehouse, step 1
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        System.out.println(juice);

        // Part 2: Product warehouse, step 2
        System.out.println();
        ProductWarehouse apples = new ProductWarehouse("Apples", 1000.0);
        apples.addToWarehouse(1000.0);
        apples.takeFromWarehouse(11.3);
        System.out.println(apples.getName());
        apples.addToWarehouse(1.0);
        System.out.println(apples);

        // Part 5: Product warehouse with history, step 1
        System.out.println();
        ProductWarehouseWithHistory phones = new ProductWarehouseWithHistory("Phones",
                1000.0, 1000.0);
        phones.takeFromWarehouse(11.3);
        System.out.println(phones.getName());
        phones.addToWarehouse(1.0);
        System.out.println(phones);
        System.out.println(phones.history());

        // Part 6: Product warehouse with history, step 2
        System.out.println();
        ProductWarehouseWithHistory cups = new ProductWarehouseWithHistory("Cups",
                1000.0, 1000.0);
        cups.takeFromWarehouse(11.3);
        System.out.println(cups.getName());
        cups.addToWarehouse(1.0);
        System.out.println(cups);

        System.out.println(cups.history());

        // Part 7: Product warehouse with history, step 3
        System.out.println();
        ProductWarehouseWithHistory cars = new ProductWarehouseWithHistory("Cars",
                1000.0, 1000.0);
        cars.takeFromWarehouse(11.3);
        cars.addToWarehouse(1.0);

        cars.printAnalysis();

    }
}

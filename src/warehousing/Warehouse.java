package warehousing;

public class Warehouse {

    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity <= 0) {
            this.capacity = 0;
        } else {
            this.capacity = capacity;
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchSpaceLeft() {
        return capacity - balance;
    }

    public void addToWarehouse(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double takeFromWarehouse(double amount) {
        double amountTaken;

        if (amount > 0) {
            amountTaken = Math.min(amount, balance);
            balance -= amountTaken;
        } else {
            amountTaken = 0;
        }

        return amountTaken;
    }

    @Override
    public String toString() {
        return "balance = " + String.format("%,.1f", getBalance())
                + ", space left = "
                + String.format("%,.1f", howMuchSpaceLeft());
    }

}

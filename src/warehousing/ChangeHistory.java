package warehousing;

import java.util.ArrayList;
import java.util.Collections;

// Part 3: Change History, step 1
public class ChangeHistory {

    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status) {
        changeHistory.add(status);
    }

    public void clear() {
        changeHistory.clear();
    }

    public String toString() {
        return changeHistory.toString();
    }

    // Part 4: Change History, step 2
    public double maxValue() {
        return Collections.max(changeHistory);
    }

    // Part 4: Change History, step 2
    public double minValue() {
        return Collections.min(changeHistory);
    }

    // Part 4: Change History, step 2
    public double average() {
        double total = 0;
        double average = 0;
        if (changeHistory.size() > 0) {
            for (double status : changeHistory) {
                total += status;
            }
            average = total / changeHistory.size();
        }
        return average;
    }

}

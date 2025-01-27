import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();

    }

    public double maxValue() {
        return Collections.max(history);
    }

    public double minValue() {
        return Collections.min(history);
    }

    public double average() {
        double sum = 0;
        if (history.isEmpty()) {
            return sum;
        }
        for (double value : history) {
            sum += value;
        }
        return sum / history.size();
    }

    @Override
    public String toString() {
        return history.toString();
    }
}

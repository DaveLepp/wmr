// Movie Data 1 Reducer

public class Reducer {
    public void reduce(String key, WmrIterator values) {
        double total = 0;
        int count = 0;
        for(String value : values) {
            total += Double.parseDouble(value);
            count++;
        }
        double average = total / (double) count;
        Wmr.emit(key, Double.toString(average));
    }
}
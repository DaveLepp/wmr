// Flight Data 3 Reducer

public class Reducer {
    public void reduce(String key, WmrIterator values) {
        int total = 0, count = 0;
        for(String value : values) {
            total += Double.parseDouble(value);
            count++;
        }
        double average = (double) total / (double) count;
        Wmr.emit(key, Double.toString(average));
    }
}
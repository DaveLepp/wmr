// Car Data 2 Reducer

public class Reducer {
    public void reduce(String key, WmrIterator values) {
        int count = 0;
        int totalCars = 1728;
        for(String value : values) {
            count += Integer.parseInt(value);
        }
        double percent = (double) count / (double) totalCars;
        Wmr.emit(key, Double.toString(percent));
    }
}
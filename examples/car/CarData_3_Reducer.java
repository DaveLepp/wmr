// Car Data 3 Reducer

public class Reducer {
    public void reduce(String key, WmrIterator values) {
        int count = 0;
        for(String value : values) {
            count += Integer.parseInt(value);
        }
        Wmr.emit(key, Integer.toString(count));
    }
}
// Movie Data 3 Reducer

public class Reducer {
    public void reduce(String key, WmrIterator values) {
        int count = 0;
        for(String value : values) {
            count++;
        }
        String outputFormat = "Rating " + key + " : ";
        Wmr.emit(outputFormat, Integer.toString(count));
    }
}
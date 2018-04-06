// Poker Data 1 Reducer

public class Reducer {
    public void reduce(String key, WmrIterator values) {
        int count = 0;
        int totalHands = 1000000;
        for(String value : values) {
            count += Integer.parseInt(value);
        }
        double percent = (double)count/(double)totalHands;
        Wmr.emit(key, Double.toString(percent));
    }
}
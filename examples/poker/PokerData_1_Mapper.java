// Poker Data 1 Mapper

public class Mapper {
    public void map(String key, String value) {
        String hand[] = key.split(",");
        String rank = hand[10];
        Wmr.emit(rank, Integer.toString(1));
    }
}
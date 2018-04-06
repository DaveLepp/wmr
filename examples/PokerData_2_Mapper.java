// Poker Data 2 Mapper

public class Mapper {
    public void map(String key, String value) {
        String data[] = key.split(",");
        String suit = data[0];
        String rank = data[10];
        String output = "";
        if(rank.equals("5") || rank.equals("8") || rank.equals("9")) {
            output = suit + ',' + rank;
            Wmr.emit(output, Integer.toString(1));
        }
    }
}
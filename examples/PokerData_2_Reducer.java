// Poker Data 2 Reducer

public class Reducer {
    public void reduce(String key, WmrIterator values) {
        int count = 0;
        String data[] = key.split(",");
        String suit = data[0], rank = data[1], s = "", r = "";
        if(suit.equals("1")) {
            s = "Hearts";
        }
        else if(suit.equals("2")) {
            s = "Spades";
        }
        else if(suit.equals("3")) {
            s = "Diamonds";
        }
        else if(suit.equals("4")) {
            s = "Clubs";
        }
        if(rank.equals("5")) {
            r = "Flush";
        }
        else if(rank.equals("8")) {
            r = "Straight Flush";
        }
        else if(rank.equals("9")) {
            r = "Royal Flush";
        }
        for(String value : values) {
            count += Integer.parseInt(value);
        }
        Wmr.emit(s + " " + r, Integer.toString(count));
    }
}
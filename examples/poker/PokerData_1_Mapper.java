// The poker hand dataset contains a listing of 1,000,000 random 5 card poker hands
// Instead of outputting a count, output the percent of hands in the data set of each ranking 

public class Mapper {
    public void map(String key, String value) {
        String hand[] = key.split(",");
        String rank = hand[10];
        Wmr.emit(rank, Integer.toString(1));
    }
}

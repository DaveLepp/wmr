// Movie Data 2 Mapper

public class Mapper {
    public void map(String key, String value) {
        String data[] = key.split(",");
        String userID = data[1];
        String rating = data[2];
        Wmr.emit(userID, rating);
    }
}
// Movie Data 1 Mapper

public class Mapper {
    public void map(String key, String value) {
        String data[] = key.split(",");
        String movieID = data[0];
        String rating = data[2];
        Wmr.emit(movieID, rating);
    }
}
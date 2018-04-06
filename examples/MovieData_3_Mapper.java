// Movie Data 3 Mapper

public class Mapper {
    public void map(String key, String value) {
        String data[] = key.split(",");
        String rating = data[2];
        Wmr.emit(rating, Integer.toString(1));
    }
}
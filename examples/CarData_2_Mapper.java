// Car Data 2 Mapper

public class Mapper {
    public void map(String key, String value) {
        String data[] = key.split(",");
        String acc = data[6];
        Wmr.emit(acc, Integer.toString(1));   
    }
}
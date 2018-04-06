// Flight Data 3 Mapper

public class Mapper {
    public void map(String key, String value) {
        String data[] = key.split(",");
        String info = data[1] + "/" + data[0] + " " + data[4];
        String delay = data[5];
        Wmr.emit(info, delay);
    }
}
// Car Data 3 Mapper

public class Mapper {
    public void map(String key, String value) {
        String data[] = key.split(",");
		String buyPrice = data[0];
        String acc = data[6];
		String info = acc + "-" + buyPrice;
        Wmr.emit(info, Integer.toString(1));   
    }
}
// Movie Data 4 Mapper

public class Mapper {
    public void map(String key, String value) {
        String data[] = key.split(",");
        String rating = data[2];
        int date = Integer.parseInt(data[3]);
        int secsInYear = 31556926;
        int startYear = 1970;
        int year = (int) (((double) date / (double) secsInYear) + startYear);
        Wmr.emit(Integer.toString(year), rating);
    }
}
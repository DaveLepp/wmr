// Movie Data 5 Mapper

public class Mapper {
    public void map(String key, String value) {
        String data[] = key.split(",");
        String rating = data[2];
        int date = Integer.parseInt(data[3]);
        int secsInYear = 31556926, startYear = 1970, july1 = 15638400, july31 = 18316799;
        int year = (int) (((double) date / (double) secsInYear) + startYear);
        int diff = year - startYear, numOfYears = secsInYear * diff;
        int julyStart = july1 + numOfYears, julyEnd = july31 + numOfYears;
        if((date >= july1) && (date <= july31)) {
            Wmr.emit(Integer.toString(year), rating);
        }
        else if((date >= julyStart) && (date <= julyEnd)) {
            Wmr.emit(Integer.toString(year), rating);
        }
    }
}
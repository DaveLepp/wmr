# Movie Data 5 Mapper

def mapper(key, value):
    secondsInYear = 31556926
    startYear = 1970
    july1 = 15638400
    july31 = 18316799
    data = key.split(',')
    rating = data[2]
    date = float(data[3])
    year = int((date / secondsInYear) + startYear)
    diff = year - startYear
    numOfYears = secondsInYear * diff
    julyStart = july1 + numOfYears
    julyEnd = july31 + numOfYears
    if ((date >= july1) and (date <= july31)):
        Wmr.emit(year, rating)
    elif ((date >= julyStart) and (date <= julyEnd)):
        Wmr.emit(year, rating)
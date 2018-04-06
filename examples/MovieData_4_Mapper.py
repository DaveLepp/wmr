# Movie Data 4 Mapper

def mapper(key, value):
    data = key.split(',')
    rating = data[2]
    date = float(data[3])
    year = int((date / 31556926) + 1970)
    Wmr.emit(year, rating)
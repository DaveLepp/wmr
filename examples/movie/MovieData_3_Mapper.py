# Movie Data 3 Mapper

def mapper(key, value):
    data = key.split(',')
    rating = data[2]
    Wmr.emit(rating, 1)
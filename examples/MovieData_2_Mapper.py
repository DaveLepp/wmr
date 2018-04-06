# Movie Data 2 Mapper

def mapper(key, value):
    data = key.split(',')
    userId = data[1]
    rating = data[2]
    Wmr.emit(userId, rating)
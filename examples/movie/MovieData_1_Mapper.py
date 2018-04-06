# Movie Data 1 Mapper

def mapper(key, value):
    data = key.split(',')
    movieId = data[0]
    rating = data[2]
    Wmr.emit(movieId, rating)
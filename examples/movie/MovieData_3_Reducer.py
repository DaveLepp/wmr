# Movie Data 3 Reducer

def reducer(rating, values):
    count = 0
    for value in values:
        count = count + 1
    ratingString = "Rating " + rating + " : "
    Wmr.emit(ratingString, count)
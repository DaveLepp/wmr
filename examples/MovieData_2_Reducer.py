# Movie Data 2 Reducer

def reducer(userId, ratings):
    total = 0
    count = 0
    for rating in ratings:
        total = total + float(rating)
        count = count + 1
    average = total / count
    Wmr.emit(userId, average)
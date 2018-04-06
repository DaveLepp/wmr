# Car Data 3 Reducer

def reducer(key, values) :
    count = 0
    for value in values :
        count = count + int(value)
    Wmr.emit(key, count)
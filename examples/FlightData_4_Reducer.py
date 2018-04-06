# Flight Data 4 Reducer

def reducer(key, values) :
    total = 0
    count = 0
    for value in values :
        total = total + float(value)
        count = count + 1
    average = total / count
    Wmr.emit(key, average)
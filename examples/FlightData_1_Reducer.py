# Flight Data 1 Reducer

def reducer(key, values) :
    total = 0;
    count = 0;
    data = key.split(',')
    year = data[0]
    originID = data[1]
    for value in values :
        total = total + float(value)
        count = count + 1
    average = total / count
    output = year + " " + originID
    Wmr.emit(output, average)
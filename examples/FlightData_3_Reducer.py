# Flight Data 3 Reducer

def reducer(key, values) :
    total = 0
    count = 0
    data = key.split(',')
    year = data[0]
    month = data[1]
    originID = data[2]
    for value in values :
        total = total + float(value)
        count = count + 1
    average = total / count
    output = month + '/' + year + " " + originID
    Wmr.emit(output, average)
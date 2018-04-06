# Flight Data 1 Mapper

def mapper(key, value) :
    data = key.split(',')
    yearAndID = data[0] + ',' + data[4]
    delay = data[5]
    Wmr.emit(yearAndID, delay)
# Flight Data 2 Mapper

def mapper(key, value) :
    data = key.split(',')
    info = data[0] + ',' + data[1] + ',' + data[2] + ',' + data[4]
    delay = data[5]
    Wmr.emit(info, delay)
# Flight Data 3 Mapper

def mapper(key, value) :
    data = key.split(',')
    info = data[0] + ',' + data[1] + ',' + data[4]
    delay = data[5]
    Wmr.emit(info, delay) 
# Flight Data 4 Mapper

def mapper(key, value) :
    data = key.split(',')
    info = data[1] + '/' + data[0] + ' ' + data[3] + ' ' + data[4]
    delay = data[5]
    Wmr.emit(info, delay)
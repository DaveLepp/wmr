# Car Data 1 Mapper 

def mapper(key, value):
    data = key.split(',')
    acc = data[6]
    Wmr.emit(acc, 1)
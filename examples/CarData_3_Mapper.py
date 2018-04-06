# Car Data 3 Mapper

def mapper(key, value) :
    data = key.split(',')
    buyPrice = data[0]
    acc = data[6]
    info = acc + '-' + buyPrice
    Wmr.emit(info, 1)
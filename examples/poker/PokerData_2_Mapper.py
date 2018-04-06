# Poker Data 2 Mapper

def mapper(key, value) :
    data = key.split(',')
    rank = data[10]
    if rank == "5" or rank == "8" or rank == "9" :
        suit = data[0]
        info = suit + "," + rank
        Wmr.emit(info, 1)
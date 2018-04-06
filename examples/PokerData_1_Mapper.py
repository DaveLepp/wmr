# Poker Data 1 Mapper

def mapper(key, value):
    hand = key.split(',')
    rank = hand[10]
    Wmr.emit(rank, 1)

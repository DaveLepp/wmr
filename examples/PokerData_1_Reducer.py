# Poker Data 1 Reducer

def reducer(key, values):
    count = 0
    num_of_hands = 1000000
    for value in values:
        count = count + int(value)
    percent = count/num_of_hands
    Wmr.emit(key, str(percent))
# Poker Data 2 Reducer

def reducer(key, values) :
    count = 0
    data = key.split(',')
    suit = data[0]
    rank = data[1]
    if suit == "1" :
        if rank == "5" :
            output = "Hearts Flush"
        elif rank == "8" :
            output = "Hearts Straight Flush"
        elif rank == "9" :
            output = "Hearts Royal Flush"
    if suit == "2" :
        if rank == "5" :
            output = "Spades Flush"
        elif rank == "8" :
            output = "Spades Straight Flush"
        elif rank == "9" :
            output = "Spades Royal Flush"
    if suit == "3" :
        if rank == "5" :
            output = "Diamonds Flush"
        elif rank == "8" :
            output = "Diamonds Straight Flush"
        elif rank == "9" :
            output = "Diamonds Royal Flush"
    if suit == "4" :
        if rank == "5" :
            output = "Clubs Flush"
        elif rank == "8" :
            output = "Clubs Straight Flush"
        elif rank == "9" :
            output = "Clubs Royal Flush"
    for value in values :
        count = count + 1
    Wmr.emit(output, count)
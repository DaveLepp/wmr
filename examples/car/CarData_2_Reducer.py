# Car Data 2 Reducer

def reducer(key, values):
    count = 0
    num_of_cars = 1728
    for value in values:
        count = count + int(value)
    percent = count/num_of_cars
    Wmr.emit(key, str(percent))
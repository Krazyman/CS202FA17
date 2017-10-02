side = 119

for i in range(1, side+1):
    spaces = side - i 
    stars = 2*i -1 
    print(spaces*"-", end='')
    print(stars*"*", end='')
    print(spaces*"-", end='')
    print("")

for j in range(side-1, 0, -1):
    spaces = side - j
    stars = 2*j -1 
    print(spaces*"-", end='')
    print(stars*"*", end='')
    print(spaces*"-", end='')
    print("")


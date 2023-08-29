# Day 1 of Advent of Code!!!!
# Let's do it

floor = 0
loop = 0
in_basement = False

with open("input.txt", 'r') as f:
    directions = f.read()
    for i in directions:
        if i == "(":
            floor+=1
        elif i == ")":
            floor -=1
        loop +=1
        if floor == -1 and in_basement == False:
            in_basement = True
            print(loop)

        

    # print(floor)

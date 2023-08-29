# Day1 Puzzle1 2022 Advent of Code

import sys

elves = []
food = 0

with open('input.txt', 'r') as f:
    list = f.readlines()


for i in range(len(list)):
    if list[i] != '\n':
        food = int(list[i]) + food    
    else:
        elves.append(food)
        food = 0
print(max(elves))

# for line in sys.stdin:
    # 
    # if line == '\n':
        # elves.append(food)
        # continue
    # else:
        # food = int(line) + food
    # print("elves: ",elves)

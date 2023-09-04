# Day1 Puzzle1 2022 Advent of Code
# Part2!

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

elves.sort(reverse=True) 
max3 = elves[0]+elves[1]+elves[2]
print(max3)

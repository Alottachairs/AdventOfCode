#Day 2 2015 Advent Calendar :)
h=0
w=0
l=0
total_sqft = 0

# def calculate_sqft(h,w,l):
    # h = int(h)
    # w = int(w)
    # l = int(l)
    # side1 = l*w
    # side2 = w*h
    # side3 = h*l
    # ans = 2*side1 + 2*side2 + 2*side3 
    # if side1 < side2 and side1 < side3:
        # return ans + side1 
    # elif side2 < side1 and side2 < side3:
        # return ans + side2 
    # elif side3 < side1 and side3 < side2:
        # return ans + side3 

with open("input.txt", "r") as f:
    dimensions = f.read()
    dimensions = dimensions.split("\n")
    # print(dimensions)
    for i in dimensions:
        try:
            gift = i.split("x")     
            h = gift[0]
            w = gift[1]
            l = gift[2]
        except IndexError:
            break
        print(gift)
        # total_sqft = total_sqft + calculate_sqft(h,w,l)
         
print("total squft = ",total_sqft)
        


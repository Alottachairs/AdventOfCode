import sys
total_area = 0

for line in sys.stdin:
    try:
        l, w, h = list(sorted(map(int, line.strip().split('x'))))
    except ValueError:
        break
    area = 3 * l * w + 2 * w * h + 2 * h * l
    total_area += area

print(total_area)

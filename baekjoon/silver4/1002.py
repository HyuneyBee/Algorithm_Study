import sys
import math
# sys.stdin = open("input.txt", "r")
n = int(input())
for i in range(n):
    x1, y1, r1, x2, y2, r2 = map(int, input().split())
    d = math.sqrt((x1-x2)**2 + (y1-y2)**2)
    if d == 0 and r1 == r2:
        print(-1)
    elif d > r1 + r2 or d < abs(r1 - r2) or d == 0:
        print(0)
    elif d == r1+r2 or d == abs(r1-r2):
        print(1)
    elif r1-r2< d < r1+r2:
        print(2)

import sys
from math import sqrt
# sys.stdin = open("input.txt", "r")
arr = [0] * ((123456 * 2) + 1)

def check(v):
    for i in range(2, int(sqrt(v) + 1)):
        if v % i == 0:
            return False
    return True

for i in range(2, 123457):
    if arr[i] == 0:
        if check(i):
            for j in range(2 * i, 123456 * 2 + 1, i):
                arr[j] = 1
while True:
    n = int(input())
    if n == 0:
        break
    print(arr[n+1:(n*2)+1].count(0))
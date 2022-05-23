import sys
# sys.stdin = open("input.txt", "r")
m, n = map(int, input().split())
arr = [0] * (n+1)

for i in range(2, n+1):
    if i == 1:
        continue
    if arr[i] == 0:
        if i >= m:
            print(i)
        for j in range(i, n+1, i):
            arr[j] = 1


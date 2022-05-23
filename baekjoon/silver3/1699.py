import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
arr = [0] * (n+1)
square = [i * i for i in range(1, 317)]
for i in range(1, n+1):
    s = []
    for j in square:
        if i < j:
            break
        s.append(arr[i-j])
    arr[i] = min(s) + 1

print(arr[-1])

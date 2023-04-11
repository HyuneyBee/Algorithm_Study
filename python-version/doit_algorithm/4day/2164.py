import sys
from collections import deque

# sys.stdin = open("input.txt", "r")
n = int(input())
arr = deque([i for i in range(1, n+1)])

while len(arr) > 1:
    arr.popleft()
    first = arr.popleft()
    arr.append(first)

print(arr[0])
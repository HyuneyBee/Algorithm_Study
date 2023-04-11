import sys
from collections import deque

# sys.stdin = open("input.txt", "r")
n, l = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))

q = deque()

for i in range(n):
    while q and q[-1][1] > arr[i]:
        q.pop()
    q.append((i, arr[i]))

    if q[0][0] < i - l + 1:
        q.popleft()

    print(q[0][1], end=" ")



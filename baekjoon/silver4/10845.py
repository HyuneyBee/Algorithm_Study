import sys
from collections import deque
# sys.stdin = open("input.txt", "r")

n = int(input())
Q = deque()
for _ in range(n):
    v = sys.stdin.readline()
    if "push" in v:
        m, x = v.split()
        Q.append(x)
    elif "pop" in v:
        if len(Q) == 0:
            print(-1)
        else:
            print(Q.popleft())
    elif "size" in v:
        print(len(Q))
    elif "empty" in v:
        if len(Q) == 0:
            print(1)
        else:
            print(0)
    elif "front" in v:
        if len(Q) == 0:
            print(-1)
        else:
            print(Q[0])
    elif "back" in v:
        if len(Q) == 0:
            print(-1)
        else:
            print(Q[-1])
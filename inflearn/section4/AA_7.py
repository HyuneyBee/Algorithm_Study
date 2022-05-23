from collections import deque
import sys
# sys.stdin=open("input.txt", "r")
k = list(map(str, input()))
n = int(input())

for i in range(n):
    deq = deque(k)
    a = list(map(str, input()))
    for j in a:
        if j in deq:
            if j != deq.popleft():
                print(f"#{i+1} NO")
                break
    else:
        if len(deq) != 0:
            print(f"#{i + 1} NO")
        else:
            print(f"#{i+1} YES")
from collections import deque
import sys
# sys.stdin=open("input.txt", "r")
n, k = map(int, input().split())

q = list(range(1, n+1))
deq = deque(q)

while deq:
    for _ in range(k-1):
        deq.append(deq.popleft())
    deq.popleft()
    if len(deq) == 1:
        print(deq.popleft())






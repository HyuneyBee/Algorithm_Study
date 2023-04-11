import sys
from collections import deque
# sys.stdin = open("input.txt", "r")
t = int(input())

for _ in range(t):
    n, index = map(int, sys.stdin.readline().split())
    arr = list(map(int, sys.stdin.readline().split()))
    arr_q = deque(arr)
    index_q = deque(range(n))
    cnt = 0
    while arr_q:
        max_v = max(arr_q)
        if arr_q[0] == max_v:
            arr_q.popleft()
            cnt += 1
            if index == index_q.popleft():
                break
        else:
            v = arr_q.popleft()
            arr_q.append(v)
            i = index_q.popleft()
            index_q.append(i)
    print(cnt)


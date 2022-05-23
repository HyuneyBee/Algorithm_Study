from collections import deque
import sys
# sys.stdin=open("input.txt", "r")
n, k = map(int, input().split())
a = list(map(int, sys.stdin.readline().split()))

index_a = []
for idx, i in enumerate(a):
    index_a.append((i, idx))
deq = deque(index_a)
cnt = 0
t = deq[k]
while True:
    max_list = []
    for i, k in deq:
        max_list.append(i)
    max_v = max(max_list)
    v = deq.popleft()
    if max_v != v[0]:
        deq.append(v)
    else:
        cnt +=1
        if v == t:
            break

print(cnt)







import sys
from collections import deque
# sys.stdin = open("input.txt", "r")
MAX = 100000
ch = [0] * (MAX + 1)
dis = [0] * (MAX + 1)
n, m = map(int, sys.stdin.readline().split())
ch[n] = 1
dis[n] = 0
dQ = deque()
dQ.append(n)
cnt = 0
while dQ:
    cnt += 1
    now = dQ.popleft()
    if now == m:
        break
    for i in (now -1, now +1, now+5):
        if 0 < i <= MAX:
            if ch[i] == 0:
                ch[i] = 1
                dQ.append(i)
                dis[i] = dis[now] + 1

print(dis[m])
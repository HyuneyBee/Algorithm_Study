import sys
import heapq as hq
# sys.stdin=open("input.txt", "r")
a = []
while True:
    n = int(input())
    if n == -1:
        break
    if n == 0:
        if len(a) == 0:
            print(-1)
        else:
            print(-1 * (hq.heappop(a)))
    else:
        hq.heappush(a, -1 * n)








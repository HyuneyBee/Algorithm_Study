import sys
import heapq
# sys.stdin = open("input.txt", "r")
n = int(input())
heap = []
for _ in range(n):
    v = int(sys.stdin.readline())
    if v == 0:
        if not heap:
            print(0)
        else:
            print(heapq.heappop(heap))
    else:
        heapq.heappush(heap, v)



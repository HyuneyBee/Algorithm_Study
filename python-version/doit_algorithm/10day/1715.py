import sys
import heapq

# sys.stdin = open("input.txt", "r")

n = int(input())

heap = [int(sys.stdin.readline()) for _ in range(n)]

heapq.heapify(heap)
result = 0
while len(heap) > 1:
    f = heapq.heappop(heap)
    s = heapq.heappop(heap)
    heapq.heappush(heap, f + s)
    result += f + s


print(result)




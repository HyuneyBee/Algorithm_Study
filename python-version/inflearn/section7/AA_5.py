import sys
# sys.stdin = open("input.txt", "r")

n = int(input())
class Stone:
    def __init__(self, s, h ,w):
        self.s = s
        self.h = h
        self.w = w

arr = []
for _ in range(n):
    s, h, w = map(int, sys.stdin.readline().split())
    arr.append(Stone(s, h, w))
arr.sort(key= lambda x : x.s, reverse=True)
res = 0
dy = [0] * n
dy[0] = arr[0].h
for i in range(1, n):
    max = 0
    for j in range(i-1, -1, -1):
        if arr[i].w < arr[j].w and dy[j] > max:
            max = dy[j]
    dy[i] = max + arr[i].h
    if dy[i] > res:
        res = dy[i]

print(res)



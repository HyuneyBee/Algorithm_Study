import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
arr = [list(map(int ,sys.stdin.readline().split())) for _ in range(n)]
ch = [0] * n
min_v = 2147000
start = 0

def DFS(c, s, cnt):
    global min_v
    global start
    if ch.count(1) == n:
        if arr[c][start] != 0:
           min_v = min(min_v, s + arr[c][start])
    else:
        for i in range(n):
            if ch[i] == 0 and arr[c][i] != 0 and s < min_v:
                ch[i] = 1
                DFS(i, s + arr[c][i], cnt + 1)
                ch[i] = 0

for i in range(n):
    start = i
    ch[i] = 1
    DFS(i, 0, 0)
    ch[i] = 0

print(min_v)
import sys
# sys.stdin = open("input.txt", "r")
t = int(input())
global cnt

def DFS(s):
    global cnt
    if s > n:
        return
    if s == n:
        cnt += 1
    else:
        DFS(s + 1)
        DFS(s + 2)
        DFS(s + 3)

for i in range(t):
    n = int(input())
    cnt = 0
    DFS(0)
    print(cnt)
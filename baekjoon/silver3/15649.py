import sys
# sys.stdin = open("input.txt", "r")
n, m = map(int, sys.stdin.readline().split())
res = [0] * m
ch = [0] * (n+1)

def DFS(L):
    if L == m:
        for i in res:
            print(i, end=" ")
        print()
    else:
        for i in range(1, n+1):
            if ch[i] == 0:
                ch[i] = 1
                res[L] = i
                DFS(L+1)
                ch[i] = 0
DFS(0)
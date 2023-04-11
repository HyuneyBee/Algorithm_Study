import sys
# sys.stdin = open("input.txt", "r")
n, m = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))
arr.sort()
ch = [0] * (max(arr) +1)
res = [0] * m
def DFS(L):
    if L == m:
        for i in res:
            print(i, end=" ")
        print()
    else:
        for i in arr:
            if ch[i] == 0:
                ch[i] =1
                res[L] = i
                DFS(L+1)
                ch[i] = 0

DFS(0)
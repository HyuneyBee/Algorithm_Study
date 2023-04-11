import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
arr = list(map(int, sys.stdin.readline().split()))
ch = [0] * n
res = [0] * n
max_v = 0
def DFS(L):
    global max_v
    if L == n:
        value = 0
        for i in range(n-1):
            value += abs(res[i] - res[i+1])
        if value > max_v:
            max_v = value
    else:
        for i in range(n):
            if ch[i] == 0:
                ch[i] = 1
                res[L] = arr[i]
                DFS(L+1)
                ch[i] =0
DFS(0)
print(max_v)
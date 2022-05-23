import sys
sys.stdin = open("input.txt", "r")
global cnt
def DFS(L, sum):
    global cnt
    if sum > d:
        return
    if L == k:
        if sum == d:
            cnt += 1
    else:
        for i in range(n[L] + 1):
            DFS(L+1, sum + p[L] * i)


if __name__=="__main__":
    d = int(input())
    k = int(input())
    p = []
    n = []
    for i in range(k):
        x, v = map(int, sys.stdin.readline().split())
        p.append(x)
        n.append(v)
    cnt = 0
    DFS(0, 0)
    print(cnt)


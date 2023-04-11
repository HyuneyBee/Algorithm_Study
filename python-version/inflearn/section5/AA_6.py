import sys
# sys.stdin=open("input.txt", "r")
global cnt
def DFS(L):
    global cnt
    if L == m:
        for i in res:
            print(i, end=" ")
        print()
        cnt += 1
        return
    for i in range(1, n+1):
        res[L] = i
        DFS(L+1)


if __name__=="__main__":
    n, m = map(int, sys.stdin.readline().split())
    res = [0] * m
    cnt = 0
    DFS(0)
    print(cnt)






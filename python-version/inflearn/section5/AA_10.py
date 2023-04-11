import sys
sys.stdin=open("input.txt", "r")
global cnt

def DFS(L,s):
    global cnt
    if L > m :
        return
    if L == m:
        for i in res:
            print(i, end=" ")
        print()
        cnt += 1
    else:
        for i in range(s, n+1):
            res[L] = i
            DFS(L+1, i+1)

if __name__=="__main__":
    n,m = map(int, sys.stdin.readline().split())
    res = [0] * m
    ch = [0] * (n + 1)
    cnt = 0
    DFS(0, 1)
    print(cnt)


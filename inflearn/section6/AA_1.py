import sys
# sys.stdin = open("input.txt", "r")
global total

def DFS(L, score, time):
    global total
    if time > m:
        return
    if L == n:
        if score > total:
            total = score
    else:
        for i in range(n):
            DFS(L+1, score + a[i][0], time + a[i][1])
            DFS(L+1, score, time)


if __name__=="__main__":
    n, m = map(int, sys.stdin.readline().split())
    a = []
    for _ in range(n):
        score, time = map(int, sys.stdin.readline().split())
        a.append((score, time))
    total = 0
    DFS(0,0,0)
    print(total)

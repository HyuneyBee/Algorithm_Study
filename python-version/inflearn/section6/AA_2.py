import sys
# sys.stdin = open("input.txt", "r")
global total

def DFS(L, score):
    global total
    if L == n + 1:
        if score > total:
            total = score
    else:
        if L + pt[L] <= n+1:
            DFS(L + pt[L], score + pp[L])
        DFS(L + 1, score)


if __name__=="__main__":
    n = int(input())
    pt =[0]
    pp =[0]
    for _ in range(n):
        day, score = map(int, sys.stdin.readline().split())
        pt.append(day)
        pp.append(score)
    total = 0
    DFS(1,0)
    print(total)

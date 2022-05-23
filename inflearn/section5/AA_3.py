import sys
# sys.stdin=open("input.txt", "r")

def DFS(v):
    if v == n+1:
        for idx, i in enumerate(ch):
            if i == 1:
                print(f"{idx}", end=" ")
        print("")
    else:
        ch[v] = 1
        DFS(v + 1)
        ch[v] = 0
        DFS(v + 1)

if __name__=="__main__":
    n = int(input())
    ch=[0]*(n+1)
    DFS(1)






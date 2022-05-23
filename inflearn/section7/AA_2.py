import sys
sys.stdin = open("input.txt", "r")


def DFS(v):
    if dy[v] != 0:
        return dy[v]
    elif v== 1 or v==2:
        return v
    else:
        dy[v] = DFS(v-1) + DFS(v-2)
        return dy[v]

if __name__ == "__main__":
    n = int(input())
    dy = [0] * (n+1)
    DFS(n)
    print(dy[n])

import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
arr = [list(map(int ,sys.stdin.readline().split())) for _ in range(n)]
min_v = 2147000
res = [0] * n
cnt = 0
def DFS(index, L):
    global min_v
    if L == (n // 2):
        start = []
        link = []
        start_v = 0
        link_v = 0
        for idx, x in enumerate(res):
            if x == 1:
                start.append(idx)
            else:
                link.append(idx)
        for s_1, l_1 in zip(start, link):
            for s_2, l_2 in zip(start, link):
                if s_1 != s_2:
                    start_v += arr[s_1][s_2]
                if l_1 != l_2:
                    link_v += arr[l_1][l_2]
        value = abs(start_v - link_v)
        if value < min_v:
            min_v = value
        return
    else:
        for i in range(index, n):
            if res[i] == 0:
                res[i] = 1
                DFS(i + 1, L+1)
                res[i] = 0

DFS(0,0)
print(min_v)
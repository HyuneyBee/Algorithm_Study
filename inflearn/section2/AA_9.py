import sys
# sys.stdin = open("input.txt", "rt")
n = int(input())
a = [list(map(int, input().split())) for _ in range(n)]
dx = [0, 1, 0, -1]
dy = [-1, 0, 1, 0]
a.insert(0, [0]*n)
a.append([0]*n)
for i in a:
    i.insert(0,0)
    i.append(0)

cnt = 0
for i in range(1,n+1):
    for j in range(1, n+1):
        my = a[i][j]
        if all(my>a[i + dy[k]][j + dx[k]] for k in range(4)):
            cnt += 1

print(cnt)

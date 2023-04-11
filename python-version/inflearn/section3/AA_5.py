import sys
# sys.stdin=open("input.txt", "r")
n = int(input())
a = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

a.sort(key= lambda x : x[1])

et = 0
cnt = 0

for s, e in a:
    if s>= et:
        et = e
        cnt += 1

print(cnt)
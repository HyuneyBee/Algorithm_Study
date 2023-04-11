import sys
# sys.stdin=open("input.txt", "r")
n = int(input())
a = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

a.sort(key= lambda x : x[0], reverse=True)

et = 0
cnt = 0
largest = 0

for m,e in a:
    if e > largest:
        cnt += 1
        largest = e

print(cnt)










import sys
# sys.stdin=open("input.txt", "r")
n, m = map(int, input().split())
a = list(map(int, sys.stdin.readline().split()))


a.sort(reverse=True)
cnt = 0
for i in a:
    if m >= i + a[-1]:
        a.pop()
    cnt += 1

print(cnt)





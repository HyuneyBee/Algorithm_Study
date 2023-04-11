import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
stack = []
cnt = 1
res = []
flag = True
for i in range(n):
    v = int(input())

    while cnt <= v:
        stack.append(cnt)
        res.append("+")
        cnt += 1

    if stack[-1] == v:
        stack.pop()
        res.append("-")
    else:
        print("NO")
        flag = False
        break

if flag:
    for i in res:
        print(i)

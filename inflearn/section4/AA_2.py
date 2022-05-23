import sys
# sys.stdin=open("input.txt", "r")
n = list(map(str, sys.stdin.readline()))

res = []
s = 0
for idx, i in enumerate(n):
    if i == '(':
        res.append(i)
    elif i == ')':
        if n[idx - 1] == '(':
            res.pop()
            s += len(res)
        else:
            res.pop()
            s += 1

print(s)





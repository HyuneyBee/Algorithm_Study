import sys
# sys.stdin = open("input.txt", "r")
n = list(map(str, sys.stdin.readline()))
arr = []
res = 0
for i,x in enumerate(n):
    if x == "(":
        arr.append(x)
    elif x == ")":
        if n[i-1] == ")":
            arr.pop()
            res += 1
        else:
            arr.pop()
            res += len(arr)
print(res)
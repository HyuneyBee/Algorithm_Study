import sys
# sys.stdin = open("input.txt", "r")
n = int(input())

for i in range(n):
    v = input()
    list_v = list(v)
    res = []
    if list_v[0] == ")":
        print("NO")
        continue
    for index, j in enumerate(list_v):
        if j == "(":
            res.append(j)
        else:
            if len(res) == 0:
                res.append(j)
            elif res[-1] == "(":
                res.pop()

    if len(res) != 0:
        print("NO")
    else:
        print("YES")


import sys
# sys.stdin = open("input.txt", "r")
n = input()

arr = n.split("-")
res = 0
for i in arr[0].split("+"):
    res += int(i)

if len(arr) >= 2:
    for i in arr[1:]:
        for j in i.split("+"):
            res -= int(j)

print(res)

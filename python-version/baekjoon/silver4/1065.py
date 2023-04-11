import sys
# sys.stdin = open("input.txt", "r")
n = int(input())

if n < 100:
    print(n)
else:
    res = 99
    for i in range(100, n+1):
        value = str(i)
        if int(value[0]) - int(value[1]) == int(value[1]) - int(value[2]):
            res += 1
    print(res)
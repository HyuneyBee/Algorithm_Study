import sys
# sys.stdin = open("input.txt", "r")
n = int(input())

res = []

for i in range(n):
    value = sys.stdin.readline()
    if "push" in value:
        m, v = value.split()
        res.append(v)
    elif "top" in value:
        if len(res) == 0:
            print(-1)
        else:
            print(res[-1])
    elif "pop" in value:
        if len(res) == 0:
            print(-1)
        else:
            print(res.pop())
    elif "size" in value:
        print(len(res))
    elif "empty" in value:
        if len(res) == 0:
            print(1)
        else:
            print(0)


import sys
# sys.stdin=open("input.txt", "r")
n = int(input())
a = [input() for _ in range(n*2-1)]
e = {}
for i in a:
    if i:
        if i in e.keys():
            e[i] += 1
        else:
            e.update({i: 1})
    else:
        break

for k,v in e.items():
    if v == 1:
        print(k)








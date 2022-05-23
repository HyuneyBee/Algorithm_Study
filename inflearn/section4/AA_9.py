import sys
# sys.stdin=open("input.txt", "r")
a = input()
b = input()
sH = dict()

for i,j in zip(a,b):
   sH[i] = sH.get(i, 0) + 1
   sH[j] = sH.get(j, 0) - 1

for x in a:
    if sH.get(x) > 0:
        print("NO")
        break
else:
    print("YES")






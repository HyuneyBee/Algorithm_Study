import sys
# sys.stdin=open("input.txt", "r")
n = int, input().split()
a = list(map(int, sys.stdin.readline().split()))

b = a.copy()
b.sort()

trigger = True
cnt = 0
p_v = 0
res = ""
while trigger:
    for i in b:
        index = a.index(i)
        if index == 0:
            cnt += 1
            res = res + "L"
            if p_v < i:
                trigger = False
            p_v = a.pop(0)
        elif index == len(a) -1:
            res = res + "R"
            cnt += 1
            if p_v < i:
                trigger = False
            p_v = a.pop()

print(cnt)
print(res)

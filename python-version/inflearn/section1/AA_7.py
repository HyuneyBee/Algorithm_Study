import sys
# sys.stdin = open("input.txt", "rt")
n = (int(input()))
e_list = [0 for _ in range(n+1)]
cnt = 0
for i in range(2, n+1):
    if e_list[i] == 0:
        cnt +=1
        for j in range(i, n+1, i):
            e_list[j] = 1

print(cnt)



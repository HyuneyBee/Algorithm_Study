import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
n_list = list(map(int, sys.stdin.readline().split()))
e_dict = {}
for i in n_list:
    e_dict[i] = 1
m = int(input())
m_list = list(map(int, sys.stdin.readline().split()))

for i in m_list:
    v = e_dict.get(i, None)
    if v:
        print(1)
    else:
        print(0)
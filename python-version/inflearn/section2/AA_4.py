import sys
# sys.stdin = open("input.txt", "rt")
n = int(input())
n_list = list(map(int, input().split()))
m = int(input())
m_list = list(map(int, input().split()))
cnt = []
p1=p2=0
while p1<n and p2<m:
    if n_list[p1]<=m_list[p2]:
        cnt.append(n_list[p1])
        p1 += 1
    elif m_list[p2] <= n_list[p1]:
        cnt.append(m_list[p2])
        p2 += 1

if p1<n:
    cnt.extend(n_list[p1:])
if p2<m:
    cnt.extend(m_list[p2:])

for i in cnt:
    print(i, end=' ')

# for i in n_list:
#     for idx,j in enumerate(m_list):
#         if i <= j:
#             m_list.insert(idx, i)
#             break
#
# for i in m_list:
#     print(i, end=' ')


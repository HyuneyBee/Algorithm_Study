import sys
# sys.stdin = open("input.txt", "rt")
init_list= list(range(21))

for i in range(10):
    s, e = map(int, input().split())
    for j in range((e - s + 1)  // 2):
        init_list[s + j], init_list[e - j] = init_list[e - j], init_list[s + j]

init_list.pop(0)
for i in init_list:
    print(i, end=" ")



# for i in range(10):
#     a, b = map(int, input().split())
#     start = a - 1
#     end = b - 1
#     b = reversed(init_list[start:end+1])
#     for x,k in zip(range(start,end +1), b):
#         init_list[x] = k
#
# for i in init_list:
#     print(i, end=" ")



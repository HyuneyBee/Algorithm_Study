import sys
# sys.stdin = open("input.txt", "r")
e_dict = {}
def w(a,b,c):
    if a <= 0 or b <= 0 or c <= 0:
        return 1
    if e_dict.get(str([a,b,c])):
        return e_dict[str([a,b,c])]
    if a>20 or b>20 or c>20:
        return w(20, 20, 20)
    if a < b and b < c:
        e_dict[str([a,b,c])] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c)
        return e_dict[str([a,b,c])]
    else:
        e_dict[str([a,b,c])] =  w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1)
        return e_dict[str([a, b, c])]
while True:
    a, b, c = map(int, sys.stdin.readline().split())
    if a == -1 and b == -1 and c == -1:
        break
    print(f"w({a}, {b}, {c}) = " + str(w(a,b,c)))

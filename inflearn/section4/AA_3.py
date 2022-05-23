import sys
# sys.stdin=open("input.txt", "r")
n = input()

res = []
g = []
for idx, i in enumerate(n):
    if i.isdigit():
        res.append(i)
    else:
        if i == '*' or i == '/':
            while g and (g[-1] == '*' or g[-1] == '/'):
                res.append(g.pop())
            g.append(i)
        elif i == '+' or i == '-':
            while g and g[-1] != '(':
                res.append(g.pop())
            g.append(i)
        else:
            if i == '(':
                g.append(i)
            else:
                while g[-1] != '(':
                    res.append(g.pop())
                g.pop()

if g:
    for i in range(len(g)):
        res.append(g.pop())

print(''.join(map(str, res)))








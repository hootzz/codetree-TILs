a, b = map(int, input().split())

if a % 2 == 0:
    i = a
else:
    i = a+1

while i <= b:
    print(i, end=' ')
    i += 2
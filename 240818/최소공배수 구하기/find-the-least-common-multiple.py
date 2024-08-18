n, m = map(int, input().split())

result = 1
ny = []
my = []
nz = 0
mz = 0

for i in range(1, n+1):
    x = int(n % i)
    if x == 0:
        ny.append(i)


for i in range(1, m+1):
    x = int(m % i)
    if x == 0:
        my.append(i)


for i in range(0, len(ny)):
    for z in range(0, len(my)):
        if ny[i] == my[z]:
            result *= ny[i]

print(result)
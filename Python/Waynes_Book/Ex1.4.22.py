import sys
import random
import stdarray
import stdio

m = int(sys.argv[1])
n = int(sys.argv[2])

table = stdarray.create2D(m,m,0)

for j in range(n):
    a = []
    for i in range(m):
        a += [i]
    #suffle
    for i in range(m):
        k = random.randrange(i,m)
        table[a[k]][i] += 1
        temp = a[i]
        a[i] = a[k]
        a[k] = temp

for i in table:
    stdio.writeln(i)

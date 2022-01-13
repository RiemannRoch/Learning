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
        k = random.randrange(m)
        temp = a[i]
        a[i] = a[k]
        a[k] = temp
    for i in range(m):
        table[a[i]][i] += 1

for i in table:
    stdio.writeln(i)

#With this method, for m=10 and n=1000000, 10 wound up in position 1 in 77997 of the suffles
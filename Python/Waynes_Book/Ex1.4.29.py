import sys
import random
import stdio

#Testing interface
n = int(sys.argv[1])

a = []
for i in range(n):
    a += [random.randrange(n)]

# Here a is an array of n elements

duplicate = False
for i in range(1,n):
    for j in range(i):
        if a[i] == a[j]:
            duplicate = True

stdio.writeln(duplicate)
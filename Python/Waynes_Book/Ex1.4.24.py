import random
import sys
import stdio

m = int(sys.argv[1])
n = int(sys.argv[2])

greatShuffles = n
for j in range(n):
    a = []
    for i in range(m):
        a += [i]
    for i in range(m):
        k = random.randrange(i,m)
        temp = a[k]
        a[k] = a[i]
        a[i] = temp
    isGreatShuffle = True
    for i in range(1,m):
        if a[i] == a[i-1] + 1:
            isGreatShuffle = False
            greatShuffles -= 1
            break

stdio.writeln("The rate of great shuffles is " + str(100*greatShuffles//n) + "%")
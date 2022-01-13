import sys
import random
import stdio

# PART I
#n = int(sys.argv[1])

# a = []
# for i in range(n):
#     a += [i]
# for i in range(n):
#     k = random.randrange(i,n)
#     temp = a[i]
#     a[i] = a[k]
#     a[k] = temp

# stdio.writeln(a)

# minimaNumber = 1
# minSoFar = a[0]
# for i in range(1,n):
#     if a[i] < minSoFar:
#         minSoFar = a[i]
#         minimaNumber += 1

# stdio.writeln("The number of left-to-right minima in this permutation is: " + str(minimaNumber))

# PART II
m = int(sys.argv[1])
n = int(sys.argv[2])

minimaNumberSum = 0

for j in range(m):
    a = []
    for i in range(n):
        a += [i]
    for i in range(n):
        k = random.randrange(i,n)
        temp = a[i]
        a[i] = a[k]
        a[k] = temp

    minimaNumber = 1
    minSoFar = a[0]
    for i in range(1,n):
        if a[i] < minSoFar:
            minSoFar = a[i]
            minimaNumber += 1
    minimaNumberSum += minimaNumber

stdio.writeln("The average number of left-to-right minima in these " + str(m) + " permutations of size " + str(n) + " is: " + str(minimaNumberSum/m))

# 1000000 permutations of size 10 give 2.93 average minima
# 1000000 permutations of size 100 give 5.19 average minima
# I guess its a logarithmic function 
# 1000000 of 8: 2.7172
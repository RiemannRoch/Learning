import sys
import stdarray
import random
import stdio

m = int(sys.argv[1])
n = int(sys.argv[2])
p = float(sys.argv[3])

a = stdarray.create2D(m+2,n+2,False)

for i in range(1,m+1):
    for j in range(1,n+1):
        k = random.random()
        a[i][j] = (k < p)

for i in range(1, m+1):
    for j in range(1,n+1):
        if a[i][j]: stdio.write("* ")
        else: stdio.write(". ")
    stdio.writeln()

b = stdarray.create2D(m,n, "")
for i in range(1,m+1):
    for j in range(1,n+1):
        if a[i][j]: b[i-1][j-1] = "* "
        else:
            mines = 0
            for k in range(i-1, i+2):
                for l in range(j-1, j+2):
                    if a[k][l] : mines +=1
            # if a[i-1][j]: mines += 1
            # if a[i-1][j+1]: mines += 1
            # if a[i-1][j-1]: mines += 1
            # if a[i][j-1]: mines += 1
            # if a[i][j+1]: mines += 1
            # if a[i+1][j]: mines += 1
            # if a[i+1][j-1]: mines += 1
            # if a[i+1][j+1]: mines += 1
            b[i-1][j-1] = str(mines) + " "

stdio.writeln()

for i in b:
    for j in i:
        stdio.write(j)
    stdio.writeln()
import random
import sys
import stdarray
import stdio

n = int(sys.argv[1])
trials = int(sys.argv[2])
deadEnds = 0

for t in range(trials):
    a = []
    for i in range(n):
        plate = []
        for j in range(n):
            row = []
            for k in range(n):
                row += [False]
            plate += [row]
        a += [plate]
    
    x = n//2
    y = n//2
    z = n//2

    a[x][y][z] = True

    while (x > 0) and (x < n-1) and (y > 0) and (y < n-1) and (z > 0) and (z < n-1):

        if a[x+1][y][z] and a[x-1][y][z] and a[x][y+1][z] and a[x][y-1][z] and a[x][y][z+1] and a[x][y][z-1]:
            deadEnds += 1
            break
        r = random.randrange(1,7)
        if (r==1) and (not a[x+1][y][z]): x += 1
        if (r==2) and (not a[x-1][y][z]): x -= 1
        if (r==3) and (not a[x][y-1][z]): y -= 1
        if (r==4) and (not a[x][y+1][z]): y += 1
        if (r==5) and (not a[x][y][z+1]): z += 1
        if (r==6) and (not a[x][y][z-1]): z -= 1

        #stdio.writeln(str(x) + ", " + str(y) + ", " + str(z))
        
        a[x][y][z] = True

stdio.writeln(str(100*deadEnds//trials) + "% dead ends")

#The resulting rate is 0% when the grid is small, like 20
#For a grid of order 30, the rate is between 2% and 3%
#5% for 40
import random
import sys
import stdarray
import stdio

n = int(sys.argv[1])
trials = int(sys.argv[2])
deadEnds = 0
escapePathLength = 0
deadEndPathLength = 0
for t in range(trials):
    Lenght = 0
    deadEndFlag = False
    a = stdarray.create2D(n, n, False)
    x = n // 2
    y = n // 2
    while (x > 0) and (x < n-1) and (y > 0) and (y < n-1):
        # Check for dead end and make a random move.
        a[x][y] = True
        if a[x-1][y] and a[x+1][y] and a[x][y-1] and a[x][y+1]:
            deadEnds += 1
            deadEndFlag = True
            break
        r = random.randrange(1, 5)
        if (r == 1) and (not a[x+1][y]): x += 1
        elif (r == 2) and (not a[x-1][y]): x -= 1
        elif (r == 3) and (not a[x][y+1]): y += 1
        elif (r == 4) and (not a[x][y-1]): y -= 1
        Lenght += 1
    if deadEndFlag: deadEndPathLength += Lenght
    else: escapePathLength += Lenght

stdio.writeln(str(100*deadEnds//trials) + '% dead ends')
if trials != deadEnds:
    stdio.writeln('Average length of escape paths: ' + str(escapePathLength//(trials-deadEnds)))
else: 
    stdio.writeln('No escape pahts')
if deadEnds != 0:
    stdio.writeln('Average length of dead-end paths: ' + str(deadEndPathLength//deadEnds))
else:
    stdio.writeln('No dead-ends')
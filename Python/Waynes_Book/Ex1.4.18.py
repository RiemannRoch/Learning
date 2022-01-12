import random
import sys
import stdarray
import stdio

n = int(sys.argv[1])
trials = int(sys.argv[2])
deadEnds = 0
escapeArea = 0
deadEndArea = 0
for t in range(trials):
    a = stdarray.create2D(n, n, False)
    x = n // 2
    y = n // 2
    xMax = x
    xMin = x
    yMax = y
    yMin = y
    deadEndFlag = False
    while (x > 0) and (x < n-1) and (y > 0) and (y < n-1):
        # Check for dead end and make a random move.
        a[x][y] = True
        if a[x-1][y] and a[x+1][y] and a[x][y-1] and a[x][y+1]:
            deadEnds += 1
            deadEndFlag = True
            break
        r = random.randrange(1, 5)
        if (r == 1) and (not a[x+1][y]): 
            x += 1
            xMax = max(x,xMax)
        elif (r == 2) and (not a[x-1][y]): 
            x -= 1
            xMin = min(x, xMin)
        elif (r == 3) and (not a[x][y+1]): 
            y += 1
            yMax = max(y, yMax)
        elif (r == 4) and (not a[x][y-1]): 
            y -= 1
            yMin = min(y,yMin)
    if deadEndFlag:
        deadEndArea += (xMax - xMin)*(yMax - yMin)
    else:
        escapeArea += (xMax - xMin)*(yMax - yMin)
stdio.writeln(str(100*deadEnds//trials) + '% dead ends')
if trials != deadEnds:
    stdio.writeln("Average area of escape paths: " + str(escapeArea//(trials - deadEnds)))
else:
    stdio.writeln("No escape paths")
if deadEnds != 0:
    stdio.writeln("Average area of dead-end paths: " + str(deadEndArea//deadEnds))
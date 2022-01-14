import random
import stdarray
import stdio
import sys

trials = int(sys.argv[1])

lengthSum = 0
for i in range(trials):
    a = stdarray.create2D(3,3,False)
    a [1][1] = True

    x = 1
    y = 1

    length = 0
    while True:
        if a[x-1][y] and a[x][y+1] and a[x+1][y] and a[x][y-1]:
            lengthSum += length
            break
        else:
            direction = random.randrange(4)
            if (direction == 0 and not(a[x-1][y])):
                length += 1
                a[x-1][y] = True
                if x == 1:
                    b = stdarray.create1D(len(a[0]),False)
                    a = [b] + a
                if x > 1: x -= 1
            if (direction == 1 and not(a[x][y+1])):
                length += 1
                a[x][y+1] = True
                y += 1
                if y == len(a[0]) - 1:
                    for i in range(len(a)):
                        a[i] += [False]
            if (direction == 2 and not(a[x+1][y])):
                length +=1
                a[x+1][y] = True
                x += 1
                if x == len(a) - 1:
                    b = stdarray.create1D(len(a[0]), False)
                    a += [b]
            if (direction == 3 and not(a[x][y-1])):
                length += 1
                a[x][y-1] = True
                if y == 1:
                    for i in range(len(a)):
                        a[i] = [False] + a[i]
                if y > 1: y -= 1

stdio.writeln("The average walk legth is: " + str(lengthSum//trials))

#The average walk length is 70
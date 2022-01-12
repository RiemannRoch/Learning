from math import dist
import stdarray
import sys
import random
import stdio

probabilities = stdarray.create1D(13, 0.0)
for i in range(1, 7):
    for j in range(1, 7):
        probabilities[i+j] += 1.0
for k in range(2, 13):
    probabilities[k] /= 36.0

# # Getting n from command-line
# n = int(sys.argv[1])
# frequencies = stdarray.create1D(13,0)
# for i in range(n):
#     x = int(6*random.random()) + int(6*random.random()) + 2
#     frequencies[x] += 1

# Calculating how large n have to be for empirical results to match the exact results to three decimal places

frequencies = stdarray.create1D(13,0)
n = 0
relativeFrequencies = stdarray.create1D(13,0)
distance = 1000
while distance != 0:
    n += 1
    x = int(6*random.random()) + int(6*random.random()) + 2
    frequencies[x] += 1
    distance = 0
    for i in range(13):
        relativeFrequencies[i] = frequencies[i]/n
        distance = max(distance, int(1000*probabilities[i]) - int(1000*relativeFrequencies[i]))

stdio.writeln("It took " + str(n) + " dice throws to match exact results") 

# Test results: 258685
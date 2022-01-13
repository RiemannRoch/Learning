import sys
import stdio

n = int(sys.argv[1])

m = 1
H = [[True]]
#Hadamard Matrix of order m = 1

#Calculating Hadamard Matrix of order 2m
while m < n:
    m *= 2

    for i in range(m//2, m):
        # Invert the rows (logically)
        Hinverse = []
        for j in H[i-m//2]:
            Hinverse += [not(j)]
        # add the lower rows
        H += [H[i-m//2] + Hinverse]

    # Repeat rows 1 to m//2
    for i in range(m//2):
        H[i] += H[i]
   
for i in H:
    stdio.writeln(i)
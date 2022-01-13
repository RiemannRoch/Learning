import sys
import stdarray
import stdio

a = []
for i in range(1,len(sys.argv)):
    a += [int(sys.argv[i])]

isValid = True

if len(a) != max(a) + 1:
    stdio.writeln("Invalid Permutation.")
    isValid = False
else:
    b = stdarray.create1D(len(a),-1)

    for i in range(len(a)):
        if b[a[i]] > -1:
            stdio.writeln("Invalid Permutation.")
            isValid = False
            break
        else: b[a[i]] = i

if isValid: stdio.writeln(b)
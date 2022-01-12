#This is a code fragment that creates a three-dimensional n-by-n-by-n array of booleans, with each element initialized to False.

import stdarray

a = stdarray.create1D(n,[])
for i in a:
    i = stdarray.create2D(n,n,False)
    
import sys
import stdarray
import stdio

######### primesieve.py

# n = int(sys.argv[1])
# isPrime = stdarray.create1D(n+1, True)
# for i in range(2, n):
#     if (isPrime[i]):
#         # Mark multiples of i as nonprime.
#         for j in range(2, n//i + 1):
#             isPrime[i*j] = False
# # Count the primes.
# count = 0
# for i in range(2, n+1):
#     if (isPrime[i]):
#         count += 1
# stdio.writeln(count)
# #This can calculate pi(11000000) in 5.79 seconds

######### alternative: factors.py

n = int(sys.argv[1])
Primes = 0
for i in range(2,n+1):
    isPrime = True
    factor = 2
    while factor*factor <= i:
        if i % factor == 0:
            isPrime = False
            break
        factor += 1
    if isPrime: Primes += 1
    # Any factors of n are greater than or equal to factor.
stdio.writeln(Primes)
#This can calculate pi(700000) in 5.19 seconds


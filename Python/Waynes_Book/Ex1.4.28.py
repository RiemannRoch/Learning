import random
import sys
import stdarray
import stdio

n = int(sys.argv[1])
trials = int(sys.argv[2])

howManyKnowSum = 0
partyKnowsCounter = 0

for i in range(trials):
    guests = stdarray.create1D(n, False)

    guests[0] = True
    howManyKnow = 1

    teller = 0
    hearer = random.randrange(1,n)

    while guests[hearer] == False:
        guests[hearer] = True
        howManyKnow += 1
        newhearer = hearer
        while newhearer == hearer or newhearer == teller:
            newhearer = random.randrange(n)
        teller = hearer
        hearer = newhearer

    howManyKnowSum += howManyKnow

    if howManyKnow == n:
        partyKnowsCounter += 1

stdio.writeln("Average number of people that hears it: " + str(howManyKnowSum//trials))
stdio.writeln("Number of times everyone hears it: " + str(partyKnowsCounter))


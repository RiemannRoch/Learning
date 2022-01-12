#here a is an array of integers
import random
import stdio

#genrating a random sequence of integers for testing purposes
a = []
for i in range(100):
    a += [random.randrange(10)]


# #this fragment actually finds the "longest step", thinking of the array as a stairway
# length = 1
# currentLongestValue = a[0]
# currentLongestLength = 1
# value = a[0]
# for i in range(1,len(a)):
#     if a[i] == value:
#         length +=1
#     else:
#         if length > currentLongestLength:
#             currentLongestLength = length
#             currentLongestValue = value
#             lenght = 0
#             value = a[i]


length = 1
currentLongestValue = a[0]
currentLongestPosition = 0
currentLongestLength = 1
value = a[0]
for i in range(1,len(a)):
    if a[i] == a[i-1]:
        length += 1
    if a[i] > a[i-1]:
        value = a[i]
        length = 1
    if a[i] < a[i-1] and a[i-1] == value and length > currentLongestLength:
        currentLongestLength = length
        currentLongestValue = value
        currentLongestPosition = i-1

stdio.writeln(a)
stdio.writeln("Longest plateau is composed of " + str(currentLongestValue) + "'s, have length " + str(currentLongestLength) + ", from " + str(currentLongestPosition - currentLongestLength + 1) + " to " + str(currentLongestPosition))
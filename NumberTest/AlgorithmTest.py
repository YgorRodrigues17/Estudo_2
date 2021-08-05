n1 = int(input('Write first number'))
n2 = int(input('Write second number'))
n3 = int(input('Write third number'))
n4 = int(input('Write fourth number'))
n5 = int(input('Write fifth number'))

smaller = n1
if n2 < n1 and n2 < n3 and n2 < n4 and n2 < n5:
    smaller = n2
elif n3 < n1 and n3 < n2 and n3 < n4 and n3 < n5:
    smaller = n3
elif n4 < n1 and n4 < n2 and n4 < n3 and n4 < n5:
    smaller = n4
elif n5 < n1 and n5 < n2 and n5 < n3 and n5 < n4:
    smaller = n5

greater = n1
if n2 > n1 and n2 > n3 and n2 > n4 and n2 > n5:
    greater = n2
elif n3 > n1 and n3 > n2 and n3 > n4 and n3 > n5:
    greater = n3
elif n4 > n1 and n4 > n2 and n4 > n3 and n4 > n5:
    greater = n4
elif n5 > n1 and n5 > n2 and n5 > n3 and n5 > n4:
    greater = n5


print('The greater number is {}'.format(greater))
print('The smaller number is {}'.format(smaller)) 

result = greater + smaller
print('The sum between greater and smaller is {}'.format(result))

if(result % 2) == 0:
    print('The result between greatar and smaller is PAIR')
else:
    print('The result between greater and smaller is ODD')    

if (result % 2) == 1:
    print('Prime number')
else:
    print('Number is not prime')    
    
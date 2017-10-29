from math import *

def prime(x):
    for i in range(2,x):
        if x%i == 0:
            return False
    return True

x=0
for i in range(2,int(sqrt(2000000))+1):
    if prime(i):
        x+=i 
print(x)
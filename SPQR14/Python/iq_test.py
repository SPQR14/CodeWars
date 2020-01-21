# Enlace al kata:
# https://www.codewars.com/kata/552c028c030765286c00007d

##########################################Descripción##############################################
#Bob is preparing to pass IQ test. The most frequent task in this test is to find out which one of the given numbers differs from the others. Bob observed that one number usually differs from the others in evenness. Help Bob — to check his answers, he needs a program that among the given numbers finds one that is different in evenness, and return a position of this number.
#! Keep in mind that your task is to help Bob solve a real IQ test, which means indexes of the elements start from 1 (not 0)
#

def iq_test(numbers):
    e = [int(i) % 2 == 0 for i in numbers.split()]
    return e.index(True) + 1 if e.count(True) == 1 else e.index(False) + 1

#Solución "larga"
"""
def iq_test(numbers):
    numbers = [int(i) for i in numbers.split()]
    indices = []
    impares = 0
    pares = 0
    for i in numbers:
        indices.append(pares_y_nones(i))
    
    print(indices)
    
    for i in indices:
        if i == "par":
            pares += 1
        else:
            impares += 1
    if pares > impares:
        return indices.index("impar") + 1
    else:
        return indices.index("par") + 1


def pares_y_nones(x):
    if x % 2 == 0:
        return "par"
    else:
        return "impar"
"""
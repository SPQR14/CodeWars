
# Enlace al kata:
# https://www.codewars.com/kata/523f5d21c841566fde000009

##########################################Descripción##############################################
#Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
#It should remove all values from list a, which are present in list b.


#solución c
def array_diff(a, b):
    return [item for item in a if item not in set(b)]

#Soluciónn b
"""
def array_diff(a, b):
    b = set(b)
    return [item for item in a if item not in b]
"""

#solución a
"""
def array_diff(first, second):
    second = set(second)
    return [item for item in first if item not in second]
"""
# Enlace al kata:
#https://www.codewars.com/kata/55983863da40caa2c900004e

##########################################Descripción##############################################
#Encontrar el siguiente entero más grande

# Este sí costó un buen de trabajo :p

def next_bigger(num):
    lst_de_numeros = [int(i) for i in str(num)]

    indice_para_reemplazo = -1
    i = len(lst_de_numeros) - 1
    while i > 0:
        if lst_de_numeros[i] > lst_de_numeros[i-1]:
            indice_para_reemplazo = i - 1
            break
        i -= 1

    if indice_para_reemplazo == -1:
        return -1
    else:
        derecha = lst_de_numeros[:indice_para_reemplazo]
        reemplazo = lst_de_numeros[indice_para_reemplazo]
        izquierda = lst_de_numeros[indice_para_reemplazo+1:]
        nueva_reemplazo = 9
        i = 0
        borrado = 0
        while i < len(izquierda):
            if izquierda[i] > reemplazo and izquierda[i] < nueva_reemplazo:
                nueva_reemplazo = izquierda[i]
                borrado = i
            i += 1

        izquierda.pop(borrado)
        izquierda.append(reemplazo)
        derecha.append(nueva_reemplazo)
        salida = derecha + sorted(izquierda)
        return int(''.join(str(x) for x in salida))
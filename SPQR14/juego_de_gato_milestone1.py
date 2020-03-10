"""
Milestone
"""




import os


tablero = [['1 ', '| ', '2 ', '| ', '3'],
           ['- ','- ' ,'- ', '- ' ,'- '], 
           ['4 ', '| ', '5 ', '| ', '6'],
           ['- ','- ' ,'- ', '- ' ,'- '], 
           ['7 ', '| ', '8 ', '| ', '9']]


tiradas = []
turno = 1
jugador = 'X'
numero_jugador = 1


def inputs(message, tiradas):
    while(True):
        entrada = int(input(message))
        if (entrada >= 1 and entrada <= 9):
            if entrada in tiradas:
                print("Intenta de nuevo")
                os.system("pause")
                os.system("CLS")
                imprimir_tablero()
            else:
                return entrada
        else:
            print("Debe ser un número entre 1 y 9")
            os.system("pause")
            os.system("CLS")
            imprimir_tablero()


def imprimir_tablero():
    print(f"turno del jugador: {numero_jugador}, {jugador}",end='')
    print(f"\t\tturno {turno}, restantes {10-turno}\n\n")
    for x in range(5):
        for y in range(5):
            print(tablero[x][y], end='')
        print()


def switcher(item):
    switcher = {
        1: lambda: [[0],[0]],
        2: lambda: [[0],[2]],
        3: lambda: [[0],[4]],
        4: lambda: [[2],[0]],
        5: lambda: [[2],[2]],
        6: lambda: [[2],[4]],
        7: lambda: [[4],[0]],
        8: lambda: [[4],[2]],
        9: lambda: [[4],[4]]
    }
    des = switcher.get(item, 'invalid')
    return des()


def actualiza_tablero(tiro):
    posicion = switcher(tiro)
    if turno % 2 != 0:
        tablero[posicion[0][0]][posicion[1][0]] = ('X ')
    else:
        tablero[posicion[0][0]][posicion[1][0]] = ('O ')    


def selecciona_ganador():
    horizontal1 = tablero[0][0] + tablero[0][2] + tablero[0][4]
    horizontal2 = tablero[2][0] + tablero[2][2] + tablero[2][4]
    horizontal3 = tablero[4][0] + tablero[4][2] + tablero[4][4]
    vertical1 = tablero[0][0] + tablero[2][0] + tablero[4][0]
    vertical2 = tablero[0][2] + tablero[2][2] + tablero[4][2]
    vertical3 = tablero[0][4] + tablero[2][4] + tablero[4][4]
    diagonal_derecha = tablero[0][0] + tablero[2][2] + tablero[4][4]
    diagonal_izquierda = tablero[4][0] + tablero[2][2] + tablero[0][4]
    if horizontal1 == 'X X X ' or horizontal2 == 'X X X ' or horizontal3 == 'X X X ' or horizontal1 == 'O O O ' or horizontal2 == 'O O O ' or horizontal3 == 'O O O ' :
        print(f"El ganador es el jugador {numero_jugador}!!!")
        return True
    elif vertical1 == 'X X X ' or vertical2 == 'X X X ' or vertical3 == 'X X X ' or vertical1 == 'O O O ' or vertical2 == 'O O O ' or vertical3 == 'O O O ' :
        print(f"El ganador es el jugador {numero_jugador}!!!")
        return True
    elif diagonal_derecha == 'X X X ' or diagonal_derecha == 'O O O ' or diagonal_izquierda == 'X X X ' or diagonal_derecha == 'O O O ':
        print(f"El ganador es el jugador {numero_jugador}!!!")
        return True
    elif 10 - turno == 0:
        print("GATO")
        return True
       

while(True):
    os.system("CLS")
    imprimir_tablero()
    if selecciona_ganador():
           break
    tiro = inputs("\nCasilla: ", tiradas)
    actualiza_tablero(tiro)
    if turno % 2 != 0:
        numero_jugador = 1
        jugador = 'X'
    else:
        numero_jugador = 2
        jugador = '0'
    tiradas.append(tiro)
    turno += 1

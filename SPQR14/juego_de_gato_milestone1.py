"""
Milestone
"""



import os


tablero = [['7 ', '| ', '8 ', '| ', '9'],
           ['- ','- ' ,'- ', '- ' ,'- '], 
           ['4 ', '| ', '5 ', '| ', '6'],
           ['- ','- ' ,'- ', '- ' ,'- '], 
           ['1 ', '| ', '2 ', '| ', '3']]


tiradas = []
turno = 1
jugador = 'X'
numero_jugador = 1
r = ''


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
        7: lambda: [[0],[0]],
        8: lambda: [[0],[2]],
        9: lambda: [[0],[4]],
        4: lambda: [[2],[0]],
        5: lambda: [[2],[2]],
        6: lambda: [[2],[4]],
        1: lambda: [[4],[0]],
        2: lambda: [[4],[2]],
        3: lambda: [[4],[4]]
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
    return (
    tablero[0][0] == tablero[0][2] == tablero[0][4] or 
    tablero[2][0] == tablero[2][2] == tablero[2][4] or
    tablero[4][0] == tablero[4][2] == tablero[4][4] or
    tablero[0][0] == tablero[2][0] == tablero[4][0] or
    tablero[0][2] == tablero[2][2] == tablero[4][2] or
    tablero[0][4] == tablero[2][4] == tablero[4][4] or
    tablero[0][0] == tablero[2][2] == tablero[4][4] or
    tablero[4][0] == tablero[2][2] == tablero[0][4]
    )


while(True):
    os.system("CLS")
    r = input("Presiona enter cuando estés listo para jugar...")
    while(True):
        os.system("CLS")
        imprimir_tablero()
        if selecciona_ganador():
            print(f"\n¡El ganador es el jugador {numero_jugador}!")
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
    r = input("\n¿Deseas jugar otra vez? SI/NO\n> ").lower()
    if r == 'no':
        print("¡Nos vemos!")
        break
    elif r == 'si':
        tablero = [['7 ', '| ', '8 ', '| ', '9'],
                   ['- ','- ' ,'- ', '- ' ,'- '],
                   ['4 ', '| ', '5 ', '| ', '6'],
                   ['- ','- ' ,'- ', '- ' ,'- '],
                   ['1 ', '| ', '2 ', '| ', '3']]
        tiradas = []
        turno = 1
        jugador = 'X'
        numero_jugador = 1
        r = ''
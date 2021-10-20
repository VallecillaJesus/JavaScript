
operacion_aritmetica = input("\nEscribe la primer letra del nombre o el numbre completo de la operacion que vas a realizar -->  ").lower()

if operacion_aritmetica == 's' or operacion_aritmetica =='suma':
    print(f"\nHas seleccionado una suma")
    num1 = float(input("\nDigite el numero del primer sumando    -> "))
    num2 = float(input("Digite el numero del segundo sumando    -> "))
    resultado = num1 + num2
    print(f"\nEl resultado es {resultado:.0f} ")
elif operacion_aritmetica == 'r' or operacion_aritmetica =='resta':
    print("\nHas seleccionado una resta")
    num1 = float(input("\nDigite el numero del minuendo       -> "))
    num2 = float(input("Digite el numero del sustrayendo     -> "))
    if num2 > num1:
        num2,num1 = num1,num2
        resultado = num1 - num2
        print(f"\nEl resultado es {resultado:.0f}")
    else:
        resultado = num1 - num2
        print(f"\nEl resultado es {resultado:.0f}")
elif operacion_aritmetica == 'm' or operacion_aritmetica =='multiplicacion':
    print("\nHas seleccionado una multiplicación")
    num1 = float(input("\nDigite el numero a multiplicar                                  -> "))
    num2 = float(input("Digite el numero de la cantidad de veces que quiere multiplicar  -> "))
    resultado = num1 * num2
    print(f"\nEl resultado es {resultado:.2f}")
elif operacion_aritmetica == 'd' or operacion_aritmetica =='division':
    print("\nHas seleccionado una division")
    num1 = float(input("\nDigite el numero que va a ser dividido                    -> "))
    num2 = float(input("Digite el numero de partes iguales por el que sera divido  -> "))
    resultado = num1 / num2
    residuo = num1%num2
    print(f"\nEl resultado es {resultado:.2f}\nEl residuo de la division es {residuo}")
else:
    print("\nEl valor suministrado es de un pendejo hijo de los tresmil pies de altura")
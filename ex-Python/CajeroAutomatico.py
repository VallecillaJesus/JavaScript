print("\n\t\t\t\t\t\t\t\t\t\t\t\t||MENU||")
print("\n1. Ingresar dinero a la cuenta\n2. Retirar dinero de la cuenta\n3. Mostrar dinero disponible\n4. Salir\n")
opcion = int(input("Digite el numero de la opcion que desea escoger --> "))
dinero_disponible = 1000


if opcion == 1:
    cantidad_ingresada = float(input("\nIngrese la cantidad que desea ingresar -> $ "))
    dinero_disponible += cantidad_ingresada
    print(f"\nLa cantidad ha sido ingresada con exito, vuelva pronto!!\n\tSaldo disponible: $ {dinero_disponible:.2f}")

if opcion == 2:
    cantidad_retirada = float(input("\nIngresa la cantidad que desea retirar -> $ "))
    if cantidad_retirada > dinero_disponible:
        print(f"\nNo tienes fondos para retirar esa cantidad de dinero, ingresa una cantidad inferior")
        print(f"\n\tTu saldo es $ {dinero_disponible:.2f}")
        opcion = 4
    else:
        dinero_disponible -= cantidad_retirada
        print("\nEl dinero se ha retirado con exito!!")
        print(f"\t\tSaldo restante disponible: & {dinero_disponible}")

if opcion == 3:
    print(f"Tu dinero disponible es {dinero_disponible}")
if opcion == 4:
    print("Hola")
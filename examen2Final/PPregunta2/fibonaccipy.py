# Fibonacci funciones temporales
suma = lambda a=0, b=0,c=0: a+b+c
fibonaccitres = lambda funcion, a=0, b=0,c=0: funcion(a,b,c)
print("Fibonacci Funciones Lambda")
nlim=int(input("Introduzca el numero limite de la serie Fibonacci:"))
if (nlim<=1):
    print(0)    
elif (nlim==2):
    print([0,1])
elif (nlim==3):
    print([0,1,1])
else:
    res = [0,1,1]
    a,b,c=0,1,1
    for i in range(1,nlim-2):
        s=fibonaccitres(suma,a,b,c)
        res.append(s)
        a,b,c=b,c,s
    print(res)    
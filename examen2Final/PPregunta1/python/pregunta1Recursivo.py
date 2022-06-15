# serie fibonaci recursivo
def fibonacci_tres(n):
    if n==1:
        return 0
    if n==2:
        return 1
    if n==3:
        return 1
    return fibonacci_tres(n-3)+fibonacci_tres(n-2)+fibonacci_tres(n-1)
nlim=int(input("Introduzca el numero limite de la serie Fibonacci:"))
for i in range(1,nlim+1):
    print(fibonacci_tres(i),end=",")


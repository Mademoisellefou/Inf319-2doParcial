# serie fibonaci estructurado
nlim=int(input("Introduzca el numero limite de la serie Fibonacci:"))
if (nlim<=1):
    print(0)    
elif (nlim==2):
    print(1)
elif (nlim==3):
    print(1)
else:
    res = [0,1,1]
    a,b,c=0,1,1
    for i in range(1,nlim-3):
        s= a+b+c
        print(s)
        res.append(s)
        a,b,c=b,c,s
    print(res)    


sumatresnumeros :: (Num a)=> a->a->a->a
sumatresnumeros a b c = a+b+c

restai :: (Num a)=> a->a
restai a =a-3

forloop 0 a b c = return ()
forloop n a b c =
    do 
    let s = sumatresnumeros a b c
    print(s)
    forloop (n-1)  b c s

main :: IO()
main = do 
    putStrLn "Introduzca un numero termino de la serie fibo3:"
    num <- getLine
    let nlim = read num :: Int
    let a =0
    let b =1
    let c =1
    print (a)
    print (b)
    print (c)
    forloop (restai nlim) a b c
    


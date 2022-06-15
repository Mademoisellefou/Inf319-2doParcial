fibotres :: Int -> Int 
fibotres n  | n == 0 =1
        | n == 1 =0
        | n == 2 =1
        | n == 3 =1
        | n /=0 =fibotres(n-1)+fibotres(n-2)+fibotres(n-3)

forloop i 0 f = return ()
forloop i n f =
    do 
    print(f i)
    forloop (i+1) (n-1) f

main :: IO()
main = do 
    putStrLn "Introduzca un numero termino de la serie fibo3:"
    num <- getLine
    let numa = read num :: Int
    forloop 1 numa fibotres

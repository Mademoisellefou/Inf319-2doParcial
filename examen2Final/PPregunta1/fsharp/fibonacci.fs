open System

let mainFibo n =
    for t in 0..n do
       printf "%d " (fib3 t)

let rec fib3 n =
    if n=0 then 0
    elif n=1 then 1
    elif n=2 then 1
    else fib3 (n-1) + fib3 (n-2) + fib3 (n-3)

 

[<EntryPoint>]
let main argv = 
    printfn "%A" argv
    printfn "Serie Fibonacci 3"
    Console.WriteLine(mainFibo 9)
    let tecla = Console.ReadKey()
    0//
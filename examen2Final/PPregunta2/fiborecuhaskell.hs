open System

let rec fib3 n =
    if n=0 then 0
    elif n=1 then 1
    elif n=2 then 1
    else fib3 (n-1) + fib3 (n-2) + fib3 (n-3)

let mainfibo n =
    for i in 0..n do
       let fib3lam = (fun n -> fib(n)) i
       printf "%d " (fib3lam) 

[<EntryPoint>]
let main argv = 
    printfn "%A" argv
    Console.WriteLine(mainfibo 6)


    let tecla = Console.ReadKey()
    0 // devolver un código de salida entero

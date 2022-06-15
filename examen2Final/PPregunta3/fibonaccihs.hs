fibonacci :: Integer -> Integer -> Integer -> Integer 
fibonacci x y z = x + y + z



main = do
  putStrLn "Funcion Normal"
  print(fibonacci 0 1 1)
  putStrLn "primeras funciones Orden Superior"
  let fibonacci2 = fibonacci 0
  let fibonacci3 = fibonacci2 1
  print(fibonacci3 1)
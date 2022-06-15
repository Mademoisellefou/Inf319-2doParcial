fibonacii :: Int -> Int-> Int-> Int
fibonacii  = (\x y z -> x + y + z)

main :: IO()
main = do
  putStrLn " Serie fibonacii 3:"
  print(0)
  print(1)
  print(1)
  print(fibonacii 0 1 1)
  print(fibonacii 1 1 2)
  print(fibonacii 1 2 4)
  print(fibonacii 2 4 7)

  
  
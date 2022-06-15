
object lambdafibonacci {

    def main(args:Array[String]):Unit = {
        println("Fibonacci3 lambda")
        println("Introduzca el numero de termino de la serie fibonacci 3: ")
        var n = scala.io.StdIn.readInt()
        n=n-3
        println("El resultado es :")
        
        val fibonacci=(a:Int, b:Int,c:Int)=> a+b+c
        
        var a =0
        var b =1
        var c =1
        println(a)
        println(b)
        println(c)
        for(w <- 1 to n){
            var s = fibonacci(a,b,c)
            a=b
            b=c
            c=s
            println(s)
        }

    }

}
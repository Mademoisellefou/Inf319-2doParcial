
object fosfibonacci {

    def fsuperior(funciontipo:(Int,Int,Int)=>Int,a:Int,b:Int,c:Int):Unit={
        println(funciontipo(a,b,c))
    }

    def fibonacci(a:Int, b:Int,c:Int):Int={
        a+b+c
    }

    def main(args:Array[String]):Unit = {
        println("Serie Fibonacci 3 :")
        println(0)       
        println(1)       
        println(1)       
        fsuperior(fibonacci,0,1,1)
        fsuperior(fibonacci,1,1,2)
        fsuperior(fibonacci,1,2,4)
        fsuperior(fibonacci,2,4,7)
    }

}
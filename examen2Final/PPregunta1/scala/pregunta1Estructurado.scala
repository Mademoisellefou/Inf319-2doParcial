object Ejercicio1{
    def resta(n:Int,resnum:Int):Int={
        n-resnum
    }
    def fibociitres(n:Int):Int={
        var a = 0 
        var b = 1
        var c = 1
        var s = -1
        printf("%d %d %d ", a,b,c)
        for(w <- 1 to resta(n,3)){
            s = a+b+c
            printf("%d ",s)
            a=b
            b=c
            c=s
        }
        a+b+c 
    }
    def main(args:Array[String]):Unit={
        println("Introduzca un  numero de la serie fibonacci3 :")
        val n = scala.io.StdIn.readInt()
        println("El resultado es :")
        n match {
            case 0  => println(0)
            case 1  => println(0)
            case 2  => println(1)
            case 3  => println(1)
            case whoa  => println(fibociitres(n))
        }
    }
}

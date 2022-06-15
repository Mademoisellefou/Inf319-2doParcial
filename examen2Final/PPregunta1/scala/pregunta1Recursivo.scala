object Ejercicio1{

  
    def fibociitres(x:Int):Int={
        x match {
            case 0  => 0
            case 1  => 0
            case 2  => 1
            case 3  => 1
            case whoa  => fibociitres(x-3)+fibociitres(x-2)+fibociitres(x-1)
        }
    }
    def main(args:Array[String]):Unit={
        println("Introduzca un  numero de la serie fibonacci3 :")
        val n = scala.io.StdIn.readInt()
        println("El resultado es :")
        for(w <- 1 to n){
            println(fibociitres(w))
        }
    }
}
package lectures.part1basics

object Recursion extends App {

  def factorialFunction(n: Int): Int =
    if(n <= 0) 1
    else n * factorialFunction(n-1)

  println("factorialFunction " + factorialFunction(3))
  /*La JVM utiliza una 'pila de llamados' para mantener los resultados parciales de modo que pueda obtener el resultado
  deseado. Por lo que cada llamado de una funcion recursiva usa lo que llamamos 'Marco de Pila'(Stack Frame)
  */

}

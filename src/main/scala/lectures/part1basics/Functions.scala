package lectures.part1basics

object Functions extends App{

  //Funcion que recibe parametros y le indico el tipo de dato que retorna.
  def aFunction(word: String, number: Int) : String = {
    word + " " + number
  }
  println("aFunction " + aFunction("Hola", 5))

  //Funcion que no recibe parametros y le indico el tipo de dato que retorna.
  def aFunctionWithoutParameter(): Int = 8;

  //Funcion recursiva
  def aRepeatedFunction(word: String, n:Int): String = {
    if(n == 1) word
    else word + " " + aRepeatedFunction(word, n-1)
  }
  println("aRepeatedFunction " + aRepeatedFunction("Fiumba", 3))

  //CUANDO NECESITAS LOOPS TENES QUE UTILIZAR RECURSION!!!

  //TIPOS DE RETORNOS DE FUNCIONES
  //El compilador puede identificar el tipo de retorno de una funcion si que se lo especifiquemos
  //Funcion que recibe parametros y NO le indico el tipo de dato que retorna.
  def aFunction1(word: String, number: Int) = {
    word + " " + number
  }
  println("aFunction " + aFunction("Hola", 5))

  //FUNCION RECURSIVA
  //No puedo eliminar el tipo de dato de un return en una funcion recursiva
  def aRepeatedFunction1(word: String, n:Int) = {
    if(n == 1) word
    //else word + " " + aRepeatedFunction1(word, n-1)
  }
  //Como buena practiva se debe especificar el tipo de dato que va a retornar un funcion en especial con funciones recursivas!

  //FUNCIONES CON RETURN UNIR
  //Se puede utilizar el tipo de dato UNIT para una devolucion -> Lo que significa que una funcion devuelve "efectos secundarios" Ejmplo:
  def aFuncitonWithSideEffect(message: String): Unit = println(message)

  //IMPLEMENTO BLOQUES DE CODIGO COMO FUNCIONES
  //Bloques de codigo permiten definir funciones auxiliares dentro de ellas
  def aBigFunction(n: Int): Int ={

    def aSmallFunction(a: Int, b: Int): Int = a + b
    aSmallFunction(n, n-1)

  }
  println("aBigFunction " + aBigFunction(5))

//EJERCICIOS
def getNameAndAge(name: String, age:Int): String = "Hi mi name is " + name + " and i am " + age
println("getNameAndAge " + getNameAndAge("Cindy", 24))

def factorialFunction(n: Int): Int =
  if(n <= 0) 1
  else n * factorialFunction(n-1)
println("factorialFunction " + factorialFunction(3))

def fibonacciFuntion(n: Int): Int =
  if(n <= 2)
    println("if")
    1
  else
    println("else")
    fibonacciFuntion(n-1) + fibonacciFuntion(n-2)

println(fibonacciFuntion(4))
//1 1 2 3 5 8 13 21






}

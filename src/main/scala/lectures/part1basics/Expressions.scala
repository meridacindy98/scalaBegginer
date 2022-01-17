package lectures.part1basics

import java.util.concurrent.Future

object Expressions extends App {
  /*
    Instructions vs Expressions
    Instructions -> Es algo que le decis a la computadora que haga. Ej: Cambiar el valos de un variable para imprimir en consola
    Lenguajes como Java o Python trabajan con Instructions.

    Expressions ->  Es algo que tiene un valor y/o tipo.
  */

  val aCOndition = true
  val aConditionValue = if(aCOndition) 6 else 7 //IF EXPRESSION
  println("aConditionValue: " + aConditionValue)
  println("EXPRESSION " + (if(aCOndition) "fiumbaaaaaaaa" else "saracatumbaaaa"))


  //Todo en scala es una Expressions
  var aVariable = 9
  val aValue = (aVariable = 8) //Unit === void
  println("aValue: " + aValue)

  //Side Effects: println, whiles, reasignar valores

  //CODE BLOCKS -> son un tipo especial de expressions por que tienen algunas propiedad especiales
  val aCodeBlock = {
    val y = 2
    val x = y + 1

    if(x > 2) "Soy mayor que 2" else "soy menos a 2"
  }
}

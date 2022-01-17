package lectures.part1basics

object VariablesValuesTypes extends App {
  //VALUES
    val num: Int = 42
    println(num)
    //Vals son inmutables

    val num1  = 60
    println(num1)
    //El compilador puede interpretar los tipos de datos por su cuenta

    val saludo: String = "Hi"
    val despedida = "Bye"

    val aBoolean: Boolean = false
    val aChar: Char = 'a'
    val num2: Int = num // guardo la val num en num2
    val aShort: Short = 4613 //Short acepta hasta 4 digitos
    val aLong: Long = 231320L
    val aFloat: Float = 2.0f
    val aDouble: Double = 3.14

  //VARIABLES
    //las Variables son mutables
    var aVariable: Int = 5
    aVariable = 8



}

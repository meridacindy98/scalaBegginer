package lectures.part1basics

object DafauldAndNamedArgs extends App {

  //Podemos declararles varoles predeterminados a los parametros
  def factorial(n: Int, acc: Int = 1): Int = {
    if(n <= 1) acc
    else factorial(n - 1, n * acc)
  }
  val fact11 = factorial(11) //Podemos no pasarñe el parametro acc ya que esta definido
  val fact10 = factorial(10, 2) //Si queremos pasarle un valor a acc este es sobreescrito por el que le pasamos

  def savePicture(format: String = "jpg", widht: Int = 800, height: Int = 800):Unit = println("Saving the picture")
  savePicture(widht = 1800)
  //Podemos nombrar los argumentos, al hacerlo no es necesario respetar el orden
  savePicture(widht = 1800, height = 1800, format = "png")
}

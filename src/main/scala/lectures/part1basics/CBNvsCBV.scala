package lectures.part1basics

object CBNvsCBV extends App {

  def callByValue(x: => Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def callByName(x: Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  /*
  This is because call-by-value functions compute the passed-in expression's value before calling the function, thus the
  same value is accessed every time. Instead, call-by-name functions recompute the passed-in expression's value every
  time it is accessed.

  El callByValue es llamado:
   def callByValue(x: => Long): Unit = {
    println("by value: " + 31868046639448)
    println("by value: " + 31868046639448)
  }
  callByValue(31868046639448)

  Mientras que el callByName:
  def callByName(x: Long): Unit = {
    println("by name: " + System.nanoTime())
    println("by name: " + System.nanoTime())
  }
  callByName(System.nanoTime())
  */

}

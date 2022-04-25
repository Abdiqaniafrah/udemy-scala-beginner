package lectures.part1Basics

object CBNvsCBV  extends App {

  // call by value
  // value is computed before call
  // same value used everywhere

  def calledByValue(x: Long): Unit = { // Paramater is a LONG because time function in scala return Long
    println("by value: " + x)
    println("by value: " + x)
  }

  // call by name
  // expression is passed literally
  // expression is evacuated at every use within
  // => arrow function delays the evaluation of the expression passed as a parameter
  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }
  // {calledByValue}the exact value is computed before the function evaluates eg. both values become 23597357125416L
  calledByValue(System.nanoTime())
// {calledByName} the expression is passed literally as is. It is evaluated everytime.
  calledByName(System.nanoTime())


  def infinite (): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)
  // The by name paramater (=>) delays the evaluation of the expression passed here until its used. Since the parameters Y is never used. infinite is never evaluated
  printFirst(34, infinite())
}

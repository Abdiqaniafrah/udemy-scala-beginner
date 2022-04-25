package lectures.part1Basics

import java.util.function.LongToDoubleFunction

object ValuesVariablesTypes extends App {


  // VALS are immutable and cannot be changed
  // Val followed by the name then colon and then the type
  val x: Int = 42
  println(x)
  // Compiler can infer types, so its not necessary to provide Value (Int, String, Float, Double)

  // Basic Types
  val aString: String = "I love scala"
  val aBoolean: Boolean = false
  val aChar: Char = 'A'
  val anInt: Int = 25
  val aShort: Short = 4376
  val aLong: Long = 24232521545345343L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14


  // Varibales

  // VAR can be reassigned/mutable
  // Changing/Reassigning a variable is known as a SIDE EFFECT

  var aVariable: Int = 4

  aVariable = 5 // side effects
}

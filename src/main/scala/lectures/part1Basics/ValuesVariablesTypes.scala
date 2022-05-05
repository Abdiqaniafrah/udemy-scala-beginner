package lectures.part1Basics

import java.util.function.LongToDoubleFunction

object ValuesVariablesTypes extends App {


  // Variable declaration = <variable keyword> <variable name> : <variable type> = <value>
  //                     eg = var/val number_1 = 100
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
  // Changing/Reassigning a variable is known as a SIDE EFFECT in FUNCTIONAL PROGRAMMING
  // SIDE EFFECTS allow you too see what your program is doing
  // EXAMPLES of SIDE EFFECTS = changing a variable, printing something to the console, displaying something on screen

  var aVariable: Int = 4

  aVariable = 5 // side effects
}

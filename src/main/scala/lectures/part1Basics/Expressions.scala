package lectures.part1Basics

object Expressions extends App {
  val x = 1 + 2 //  the right hand side is an Expression(1 + 2)expressions are evaluated to a value. They are also have a type but the compiler can figure this out
  println(x)

  println(1 == x)

  // Changing a variable is known as a SIDE EFFECT
  //
  var aVariable = 2
  aVariable += 3
  print(aVariable)


  // Instructions are executed (DO something) Vs Expressions are evaluated (produce a VALUE)
  // IF expression

  val aCondition = true
  // IF expression
  val aConditionedValue = if (aCondition) 5 else 3 // aConditionedValue is either 5 if its true or 3 if false
  print(aConditionedValue)
  println(if (aCondition) 5 else 3)

  // Loops
  var i = 0
  while (i < 10) {
  println(i)
  i += 1
  }

  // EVERYTHING IN SCALA IS AN EXPRESSION
  // Changing/Reassigning a variable is known as a SIDE EFFECT


  val aWeirdValue = (aVariable = 3) // Unit === Void
  println(aWeirdValue) // The only value Unit can hold is ()

  // Side effect = println, while Loop, reassigning

  // Code block - Special type of expression
  // IF something is on the right hand side of a VAL, IT IS  an expression
  val aCodeBlock = { // curly braces denotes a code block
    val y = 2
    val z = y + 1
    // The value of the whole block is the value of the last expression as it occurs last
    if (z > 2 ) "hello" else "goodbye"
  }

// EXERCISE 
  // 1. difference between "hello world" vs println("hello world")?
  // A1. "Hello World" is a value of type string // println("hello world") is an expression type returning a unit
  // 2.

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)
}

package lectures.part1Basics

object Functions extends App {

  // defining a function in scala
  // in the parenthesis specify name and type (a: String, b: Int)
  // Add a return type at the end : String
  // After the equal sign specify the implementation of the function

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("Abdiqani", 25))




  def aRepeatedFunction(aString: String, n: Int) : String = {
    // if n is equal to 1 return  aString
  if (n == 1) aString
    // otherwise return aString plus a repeated function
    // recursive function because it calls it self
  else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("Abdiqani", 3))

  // WHEN YOU NEED LOOPS USE RECURSION

  // You can use Unit as a return type
  // That means you define a function as only executing side effects (println, while Loop, reassigning)
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)


  // auxiliary functions inside a code block
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a+ b
    aSmallerFunction(n, n-1)
  }

  // EXERCISE
  /*
  1. A greeting function ( name . age) "Hi, my name is name and i am age years old"
  2. Factorial function 1 * 2 * 3 .... 10 recursive function
  3. A fioncacci function
  f (1) = 1
  f (2) = 1
  f (n) = f(n - 1) + f(n - 2)
  4. Tests if a number is prime.
  */

  // 1.
  def aGreeting(name: String, age: Int): String = {
    "Hi my name is " + name +  " and i am " + age + "years old!"
  }
  println(aGreeting("Abdiqani", 25))

 // 2.
  def factorialFunction(n:Int): Int = {
    // remember to return an actual Int figure eg. number 1 and not INT itself
    if (n <= 0) 1
    else n * factorialFunction(n - 1)
  }
 println(factorialFunction(5)) // 1 * 2 * 3 * 4 * 5 = 120

  // 3.

  def factorial(n: Int): Int = {
    if (n <= 2) 1
    else factorial(n - 1) + factorial(n - 2)
  }
    println(factorial(8))


    // 4.

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)

  // 1 1 2 3 5 8 13 21
  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    // auxiliary functions inside a code block
    // does N have any prime numbers until T
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))
}
package lectures.part1Basics

object StringOps extends App {

  val str: String = "Hello, i am learning scala!"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "_"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  // numbered String
  val aNumberString = "45"
  // convert String to an Int
  val aNumber = aNumberString.toInt
  // prepend - add to the front (+:)
  // Append - add to the end (:+)
  println('A' +: aNumberString :+ 'Z')
  println(str.reverse)
  println(str.take(2))


  // Scala-specific: String interpolator

  // S-interpolator  - s"$name, $age, ${age + 1}
  val name = "Abdiqani"
  val age = 25
  val greeting = s"Hello, my name is $name and i am $age yeats old!"
  val secondgreeting = s"Hello, my name is $name and i will be turning ${age + 1} yeats old!"
  println(greeting)
  println(secondgreeting)

  // F- interpolator
  // Can receive printF format
  // For formatted strings, similar to printf

  val speed = 1.2f
  val myth= f"$name%s can eat $speed%2.2f burgers per minute"
  println(myth)

  // raw- interpolator
  println(raw"This is a \n newline")
  val escaped= "This is a \n newline"
  print(raw"$escaped")

}

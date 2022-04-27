package lectures.part2oop

object Objects extends App {

// Scala does not have Class-Level functionality ("static")
// Object = Static
// Objects can be defined in a similar way to classes
// Object DO NOT receive parameters
// To use class level definitions in scala WE USE OBJECTS
  object Person { // The object is its own TYPE AND ITS ONLY INSTANCE
  // "static"/"class" - level functionality
  // There is a single instance that can be referred to with thr name person
  val N_EYES = 2
  def canFly: Boolean = false
}
  // factory method

  // Writing class and objects in the same scope is called COMPANIONS
  // COMPANIONS - because they are in the same scope and have the same name
  class Person (val name: Person) {
    // instance-level functionality
  }

  println(Person.N_EYES)
  println(Person.canFly)

  // Scala objects = Singleton instance
  val abdiqani = Person
  val abdul = Person
  val ikram = Person
  println(abdiqani == abdul)


  // scala Applications =  Scala object with
  // def main (args: Array[String]): Unit
}

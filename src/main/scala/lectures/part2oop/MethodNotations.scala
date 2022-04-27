package lectures.part2oop
import scala.language.postfixOps

object MethodNotations extends App {

  // class
  class Person (val name: String, favoriteMovie: String, val age: Int = 0) {
    // Method
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, What the hell man !"
    def isAlive: Boolean = true
    def apply(): String = s"Hi my name is $name, my favorite movie is $favoriteMovie"
    def + (nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def learns (thing: String) = s"$name is learining $thing"
    def learnsScala = this learns "Scala"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times !!!! "
  }

  // define value - instantiate
  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  // different way of calling the likes method
  // infix notation = operator notation (Syntactic Sugar)
  // only works with method that have only on parameter
  println(mary likes "Inception") // equivalent
  // infix notation makes scala very similar to normal writing (object = mary) (method = likes) (parameter = inception)
  // "Operators" in Scala
  val Abdiqani = new Person("Abdiqani", "Limitless")
  println(mary hangOutWith Abdiqani)

  // ALL OPERATORS ARE METHODS



  // Prefix notation (Syntactic Sugar) - Unary Operators are methods

  val x = -1 // equivalent with 1, 1.unary_-
  val y = 1.unary_-
  // Unary_ prefix only works with - + ~ !
  println(!mary) // prefix operator
  println(mary.unary_!)


  // Postfix notation -
  println(mary.isAlive)
  println(mary isAlive) // Postfix notation


  // apply
  // apply methods are special because they allow you to call you objects like they where methods 
  println(mary.apply())
  println(mary()) // equivalent


  /*
  1.  Overload the + operator
      mary + "the rockstar" => new person "Mary (the rockstar)"

  2.  Add an age to the Person class
      Add a unary + operator => new person with the age + 1
      +mary => mary with the age incrementer

  3.  Add a "learns" method in the Person class => "Mary learns Scala"
      Add a learnsScala method, calls learns method with "Scala".
      Use it in postfix notation.

  4.  Overload the apply method
      mary.apply(2) => "Mary watched Inception 2 times"
 */

  // 1.
  println((mary + "The Rockstart").apply())

  // 2.
  println((+mary).age) // defining a unary operator

  // 3.
  println(mary learnsScala)

  // 4.
  println(mary(10))

}

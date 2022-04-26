package lectures.part2oop



object OOBasics extends App {

  // Class organizes data and behaviors that is code
  // Instantiation - means concrete realizations and memory - that conform to the code and the data structures that the call describes
  // instantiate - create an instances
  val person = new Person ("Abdul", 25)
  println(person.x)
  person.greet("Abdiqani")

  // Exercise 1 & 2
  val author = new Writer ("Charles", "Dickens", 1812)
  val novel = new Novel ("Great Expectations", 1861, author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  // Exercise 3

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print

  // Exercise 1
  class Writer(firstName: String, surname: String, val year: Int) {
    def fullName: String = firstName + " " + surname
  }
  // Exercise 2
  class Novel (name: String, year: Int, author: Writer) {
    def authorAge = year - author.year
    def isWrittenBy(author: Writer) = author == this.author
    def copy(newYear: Int): Novel = new Novel(name, newYear, author)
  }
  // Exercise 3

  class Counter(val count: Int = 0) {
    def inc = {
      println("incrementing")
      new Counter(count + 1)  // immutability
    }

    def dec = {
      println("decrementing")
      new Counter(count - 1)
    }

    def inc(n: Int): Counter = {
      if (n <= 0) this
      else inc.inc(n-1)
    }

    def dec(n: Int): Counter =
      if (n <= 0) this
      else dec.dec(n-1)

    def print = println(count)
  }



}

// Class outside of the object implementations because class definitions can sit on the top level code
// pass in parameters inside thr parenthesis of the class
// Constructor - Person(name: String, age: Int)
// Constructor - says that every single instance of person must be constructed by passing in these values (name: String, age: Int)
class Person(val name: String, val age: Int) {// Constructor
  // body - defines the implementations of this class
  val x = 2
  println(1 + 3)
  // Method- because its defined inside a class definition
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // Overloading - means defining methods with the same name but different signatures
  def greetings(): Unit = println(s"Hi i am ${this.name}")

  // Class parameters are not FIELDS eg you cannot do (person.age) to just get the individuals age
  // To convert parameters to FIELDS add VAL/VAR to class parameters

  // multiple constructors
  def this (name: String) = this(name, 0)
  def this() = this ("john doe")

  /*
  Novel and a Writer

  Writer: first name, surname, year
    - method fullname

  Novel: name, year of release, author
  - authorAge (year of release)
  - isWrittenBy(author name)
  - copy (new year of release) = new instance of Novel

  -Counter class
  -receives and Int
  -Method current count
  -method to increment/decrement => new counter
  - overload increment/decrement to receive an amount
 */



}


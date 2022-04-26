package lectures.part1Basics

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n-1, n*acc)

  val fact10 = trFact(10, 2)


  def savePicture (format: String, width: Int, height: Int): Unit = println("saving picture...")
  savePicture("jpg", 800, 600)

  // specify a default value for an argument an the just omitted when calling

  /*
  1.either pass in every leading argument EG. savePicture("jpg", 800, 600)
  2. Or name the arguments EG. (width = 800)
  */

}



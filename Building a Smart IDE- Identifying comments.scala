object Solution {
  def main(args: Array[String]) {
    val text = Iterator.continually(Console.readLine).takeWhile(_ != null).mkString("\n")
    val r = """\/\*[\s\S]*?\*\/|\/\/.*""".r
    (r findAllIn text).foreach(c => println(c.split("\n").map(_.trim).mkString("\n")))
  }
}
object Solution {
  def main(args: Array[String]) {
    val text = Iterator.continually(Console.readLine).takeWhile(_ != null).mkString("\n")
    val cRegex = """.*(?:#include|malloc\(|scanf\()+.*""".r
    val javaRegex = """.*(?:import\s|System\.out|catch\()+.*""".r
    val pythonRegex = """.*(?:__init__|def\s|print\s)+.*""".r
    val cResult = (cRegex findFirstMatchIn text).map(_ => "C")
    val javaResult = (javaRegex findFirstMatchIn text).map(_ => "Java")
    val pythonResult = (pythonRegex findFirstMatchIn text).map(_ => "Python")
    println(List(cResult, javaResult, pythonResult).flatten.headOption.getOrElse("Unknown"))
  }
}
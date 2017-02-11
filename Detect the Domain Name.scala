object Solution {
  def main(args: Array[String]) {
    val regex = """https?(?::\/\/|%3A%2F%2F)(?:www|ww2)?\.?([\.\-a-zA-Z0-9]+\.[a-zA-Z0-9]+)""".r
    val sc = readLine().toInt
    val s = ((0 until sc.toInt toList) map (_ => readLine())).mkString("\n")
    println((for (regex(domain) <- (regex findAllIn s)) yield domain).toSet.toList.sorted.mkString(";"))
  }
}

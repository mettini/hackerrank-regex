object Solution {
  def main(args: Array[String]) {
    val r = """(?i)<\s*([a-z][a-z0-9]*)[^>]*>""".r
    val c = readLine().toInt
    println(((0 until c toList) flatMap { i => 
      (for (r(tag) <- r findAllIn readLine()) yield tag).toList
    }).sorted.toSet.mkString(";"))
  }
}

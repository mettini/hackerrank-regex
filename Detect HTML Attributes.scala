object Solution {
  def main(args: Array[String]) {
    val text = Iterator.continually(Console.readLine).takeWhile(_ != null).mkString("\n")
    val tag = """(?i)<([a-z0-3\-]+)(?:\s[a-z\-]+?="[^\"]*")*[^\>]*>""".r
    val attr = """(?i)\s([a-z\-]+?)=[\"\'][^\"\']*[\"\']""".r
    
    (tag findAllMatchIn text).map { m => m.group(1) -> (attr findAllMatchIn m.matched).toList.map(_.group(1)) }
      .toList
      .groupBy(_._1)
      .mapValues(l => l.flatMap(_._2).toSet.toList.sorted)
      .toList
      .map(t => s"${t._1}:${t._2.mkString(",")}")
      .sorted
      .foreach(println)
  }
}

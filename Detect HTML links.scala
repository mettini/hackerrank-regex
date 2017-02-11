object Solution {
  def main(args: Array[String]) {
    val removeTagsRegex = """(?i)<.*?>""".r
    val linkRegex = """(?i)<a.*?href=\"(.*?)\".*?>(.*?)<\/a>""".r

    def isAllDigits(x: String) = x forall Character.isDigit
    
    val counter = readLine()
    if (isAllDigits(counter) && counter.toInt >= 1 && counter.toInt <= 100) {
      for (i <- 1 to counter.toInt) {
        val l = readLine()
        (for (linkRegex(link, text) <- linkRegex findAllIn l) yield link -> text).foreach { d =>
          println(s"${d._1.trim},${removeTagsRegex.replaceAllIn(d._2, "").trim}")  
        }
      }
    } else {
      println("Invalid lines counter")
      System.exit(1);
    }
  }
}

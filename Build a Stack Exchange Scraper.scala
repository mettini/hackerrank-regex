object Solution {
  def main(args: Array[String]) {
    val text = Iterator.continually(Console.readLine).takeWhile(_ != null).mkString("\n")
    // val r = """(?i)id\=\"question-summary-(\d+?)\"(?:.|\s)*?\<h3\>\[(.+?)\].*?\<\/h3\>(?:.|\s)*?class\=\"relativetime\"\>(.+?)\<""".r
    val r = """(?i)id\=\"question-summary-(\d+?)\"(?:\S|\s)*?\<h3\>(?:\[|\<[^>]+\>)([^\[\]\>]+)(?:\]|\<\/[^>]+\>)[^\<]*\<\/h3\>(?:\S|\s)*?class\=\"relativetime\"\>([^<]+)\<""".r
    (r findAllMatchIn text) foreach { m => s"${m.group(1)};${m.group(2)}}" }
  }
}
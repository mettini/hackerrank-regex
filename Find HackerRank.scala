object Solution {
  def main(args: Array[String]) {
    val starts = """^hackerrank.*(?!hackerrank)$""".r
    val ends = """^(?<!hackerrank).*hackerrank$""".r
    val startsAndEnds = """^(?:hackerrank|hackerrank.*hackerrank)$""".r
    
    def get(r: scala.util.matching.Regex, v: String, ok: String, no: => String) = (r findFirstMatchIn v).map(_ => ok).getOrElse(no)
    
    ((0 until readLine().toInt toList) map (_ => readLine())) foreach { l =>
      println(get(startsAndEnds, l, "0", get(ends, l, "2", get(starts, l, "1", "-1"))))
    }  
  }
}

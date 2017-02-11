object Solution {
  def main(args: Array[String]) {
    val r = """^[A-Z]{5}[0-9]{4}[A-Z]$""".r
    ((0 until readLine().toInt toList) map (_ => readLine())) foreach { l =>
      println((r findFirstIn l).map(_ => "YES").getOrElse("NO"))
    }  
  }
}

object Solution {
  def main(args: Array[String]) {
    val r = """^[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}$""".r
    ((0 until readLine().toInt toList) map (_ => readLine())) foreach { l =>
      println((r findFirstIn l).map(_ => "VALID").getOrElse("INVALID"))
    }  
  }
}

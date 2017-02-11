object Solution {
  def main(args: Array[String]) {
    val r = """^[\_\.][0-9]+[a-zA-Z]*\_?$""".r
    ((0 until readLine().toInt toList) map (_ => readLine())) foreach { l =>
      println((r findFirstIn l).map(_ => "VALID").getOrElse("INVALID"))
    }  
  }
}

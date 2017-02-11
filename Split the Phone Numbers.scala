object Solution {
  def main(args: Array[String]) {
    val r = """^(\d{1,3})[\s\-](\d{1,3})[\s\-](\d{4,10})$""".r
    ((0 until readLine().toInt toList) map (_ => readLine())) foreach { l =>
      (r findAllMatchIn l) foreach { m => println(s"CountryCode=${m.group(1)},LocalAreaCode=${m.group(2)},Number=${m.group(3)}") }
    }  
  }
}

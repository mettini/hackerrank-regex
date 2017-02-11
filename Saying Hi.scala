object Solution {
  def main(args: Array[String]) {
    val r = """^[hH][iI]\s[^dD].*""".r
    ((0 until readLine().toInt toList) map (_ => readLine())) foreach { l => (r findFirstIn l).map(println) }  
  }
}

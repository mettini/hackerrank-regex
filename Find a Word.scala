object Solution {
  def main(args: Array[String]) {
    val sc = readLine().toInt
    val s = ((0 until sc.toInt toList) map (_ => readLine())).mkString("\n")
    val qc = readLine.toInt
    ((0 until qc.toInt toList) map (_ => readLine())) foreach { q =>
      val r = ("^" + q  + "\\W+|\\W+" + q + "\\W+|\\W+" + q + "$").r
      println((r findAllIn s).length)
    }
  }
}

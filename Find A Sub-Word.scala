object Solution {
  def main(args: Array[String]) {
    val r = """\b\w(\w+?)\w\b""".r
    val sc = readLine().toInt
    val s = ((0 until sc.toInt toList) map (_ => readLine())).mkString("\n")
    val qc = readLine.toInt
    ((0 until qc.toInt toList) map (_ => readLine())) foreach { q =>
      println((for (r(tag) <- r findAllIn s) yield tag).toList.filter(_.contains(q)).map(_ => 1).sum)
    }
  }
}

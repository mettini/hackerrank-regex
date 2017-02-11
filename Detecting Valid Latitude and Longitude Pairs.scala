object Solution {

  def main(args: Array[String]) {
    def validateLatLong(la: Double, lo: Double) = la <= 90 && la >= -90 && lo <= 180 && lo >= -180
    def isAllDigits(x: String) = x forall Character.isDigit
    
    val regex = """^\(([\-|\+]?[1-9]*\d(?:\.\d+)?)\,\s([\-|\+]?[1-9]*\d{1,2}(?:\.\d+)?)\)$""".r
    val counter = readLine()
    if (isAllDigits(counter) && counter.toInt >= 1 && counter.toInt <= 100) {
      for (i <- 1 to counter.toInt) {
        val test = readLine()
        regex findFirstIn test match {
          case Some(regex(la, lo)) if validateLatLong(la.toDouble, lo.toDouble) => println("Valid")
          case _ => println("Invalid")
        }  
      }
    } else {
      println("Invalid test counter")
      System.exit(1);
    }
  }
}
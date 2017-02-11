object Solution {
  def main(args: Array[String]) {
    val r = """^\d+\s(?:C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)$""".r
    ((0 until readLine().toInt toList) map (_ => readLine())) foreach { l =>
      println((r findFirstIn l).map(_ => "VALID").getOrElse("INVALID"))
    }  
  }
}

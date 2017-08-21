
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/juan/workspace/CAOS/hiperion/conf/routes
// @DATE:Thu Aug 17 00:52:11 COT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

package sc.com

object Simple extends App{
  print("there works")
  def result(foo: String, bar: String, Function:(String, String) => String): String={
    val result = Function(foo, bar)
    s"""<h1>$foo</h1><br>h1>$bar</h1><br>$result"""
  }

  def marinafunc(foo: String, bar: String): String="Σ="+String.valueOf(Integer.valueOf(foo)+Integer.valueOf(bar))
  def guest(a: String, b: String): String=""

  val foo="4"
  val bar ="8"
  println(result(foo,bar, marinafunc))
  println(result(foo,bar, guest))

}

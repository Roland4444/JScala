package sc.com

import com.avs.ParseDSL

class requests extends DSLProcessor {
  var parser = new ParseDSL()
  override def render(DSL: String): String = ???

  override def parseRoles(DSL: String): List[Role] = ???
  def mock(): String = "hi"



  def applyrules(DSL: String, Function:() =>Unit, Function1:()=>Unit)={
    (_:Int)=>{
      print(_)
    }
  }

  def read(){}

  def write(){}

  def call(): Unit ={
    val f = applyrules("", read, write)
  }



}

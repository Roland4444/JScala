package sc.com

abstract class DSLProcessor {
  def render(DSL: String): String
  def parseRoles(DSL: String): List[Role]
}

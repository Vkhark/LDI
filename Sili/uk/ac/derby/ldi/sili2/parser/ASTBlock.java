/* Generated By:JJTree: Do not edit this line. ASTBlock.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=uk.ac.derby.ldi.sili2.interpreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package uk.ac.derby.ldi.sili2.parser;

public
class ASTBlock extends SimpleNode {
  public ASTBlock(int id) {
    super(id);
  }

  public ASTBlock(Sili p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SiliVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=bbe8b468c9e2ef0d6445360992bec4ea (do not edit this line) */

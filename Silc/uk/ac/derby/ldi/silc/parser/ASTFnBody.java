/* Generated By:JJTree: Do not edit this line. ASTFnBody.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=uk.ac.derby.ldi.silc.compiler.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package uk.ac.derby.ldi.silc.parser;

public
class ASTFnBody extends SimpleNode {
  public ASTFnBody(int id) {
    super(id);
  }

  public ASTFnBody(Silc p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SilcVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=7f11ff4313f000d3067068044c60aecf (do not edit this line) */

/* Generated By:JJTree: Do not edit this line. ASTDivide.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=uk.ac.derby.ldi.calcast.calculator.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package uk.ac.derby.ldi.calcast.parser;

public
class ASTDivide extends SimpleNode {
  public ASTDivide(int id) {
    super(id);
  }

  public ASTDivide(Calc p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CalcVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=722f388a54644434f36f6f6f6440f29b (do not edit this line) */

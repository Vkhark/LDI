/* Generated By:JJTree: Do not edit this line. ASTDereference.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=uk.ac.derby.ldi.sili2.interpreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package uk.ac.derby.ldi.sili2.parser;

public
class ASTDereference extends SimpleNode {
  public ASTDereference(int id) {
    super(id);
  }

  public ASTDereference(Sili p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SiliVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8e4a3a3d3280c65f657934289adf3150 (do not edit this line) */

/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.jsp.ast;

import net.sourceforge.pmd.annotation.InternalApi;

/**
 * @deprecated This AST node will be removed. It is not used in the grammar and thus won't be in the AST.
 */
@Deprecated
public class ASTJspDeclarations extends AbstractJspNode {
    @InternalApi
    @Deprecated
    public ASTJspDeclarations(int id) {
        super(id);
    }

    @InternalApi
    @Deprecated
    public ASTJspDeclarations(JspParser p, int id) {
        super(p, id);
    }

    @Override
    public Object jjtAccept(JspParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}

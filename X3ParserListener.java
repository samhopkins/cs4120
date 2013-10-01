// Generated from X3Parser.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link X3Parser}.
 */
public interface X3ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link X3Parser#expr_lst}.
	 * @param ctx the parse tree
	 */
	void enterExpr_lst(@NotNull X3Parser.Expr_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#expr_lst}.
	 * @param ctx the parse tree
	 */
	void exitExpr_lst(@NotNull X3Parser.Expr_lstContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull X3Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull X3Parser.StmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#tau_lst}.
	 * @param ctx the parse tree
	 */
	void enterTau_lst(@NotNull X3Parser.Tau_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#tau_lst}.
	 * @param ctx the parse tree
	 */
	void exitTau_lst(@NotNull X3Parser.Tau_lstContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#tvar_lst}.
	 * @param ctx the parse tree
	 */
	void enterTvar_lst(@NotNull X3Parser.Tvar_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#tvar_lst}.
	 * @param ctx the parse tree
	 */
	void exitTvar_lst(@NotNull X3Parser.Tvar_lstContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull X3Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull X3Parser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#interface_impl}.
	 * @param ctx the parse tree
	 */
	void enterInterface_impl(@NotNull X3Parser.Interface_implContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#interface_impl}.
	 * @param ctx the parse tree
	 */
	void exitInterface_impl(@NotNull X3Parser.Interface_implContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#class_impl}.
	 * @param ctx the parse tree
	 */
	void enterClass_impl(@NotNull X3Parser.Class_implContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#class_impl}.
	 * @param ctx the parse tree
	 */
	void exitClass_impl(@NotNull X3Parser.Class_implContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#fun_decl}.
	 * @param ctx the parse tree
	 */
	void enterFun_decl(@NotNull X3Parser.Fun_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#fun_decl}.
	 * @param ctx the parse tree
	 */
	void exitFun_decl(@NotNull X3Parser.Fun_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(@NotNull X3Parser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(@NotNull X3Parser.InputContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#list_literal}.
	 * @param ctx the parse tree
	 */
	void enterList_literal(@NotNull X3Parser.List_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#list_literal}.
	 * @param ctx the parse tree
	 */
	void exitList_literal(@NotNull X3Parser.List_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#gamma}.
	 * @param ctx the parse tree
	 */
	void enterGamma(@NotNull X3Parser.GammaContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#gamma}.
	 * @param ctx the parse tree
	 */
	void exitGamma(@NotNull X3Parser.GammaContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(@NotNull X3Parser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(@NotNull X3Parser.Func_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#sigma}.
	 * @param ctx the parse tree
	 */
	void enterSigma(@NotNull X3Parser.SigmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#sigma}.
	 * @param ctx the parse tree
	 */
	void exitSigma(@NotNull X3Parser.SigmaContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull X3Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull X3Parser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#tname_lst}.
	 * @param ctx the parse tree
	 */
	void enterTname_lst(@NotNull X3Parser.Tname_lstContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#tname_lst}.
	 * @param ctx the parse tree
	 */
	void exitTname_lst(@NotNull X3Parser.Tname_lstContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#tau}.
	 * @param ctx the parse tree
	 */
	void enterTau(@NotNull X3Parser.TauContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#tau}.
	 * @param ctx the parse tree
	 */
	void exitTau(@NotNull X3Parser.TauContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(@NotNull X3Parser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(@NotNull X3Parser.If_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#fun_impl_or_semi}.
	 * @param ctx the parse tree
	 */
	void enterFun_impl_or_semi(@NotNull X3Parser.Fun_impl_or_semiContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#fun_impl_or_semi}.
	 * @param ctx the parse tree
	 */
	void exitFun_impl_or_semi(@NotNull X3Parser.Fun_impl_or_semiContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#toplevel_fun}.
	 * @param ctx the parse tree
	 */
	void enterToplevel_fun(@NotNull X3Parser.Toplevel_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#toplevel_fun}.
	 * @param ctx the parse tree
	 */
	void exitToplevel_fun(@NotNull X3Parser.Toplevel_funContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#clazz}.
	 * @param ctx the parse tree
	 */
	void enterClazz(@NotNull X3Parser.ClazzContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#clazz}.
	 * @param ctx the parse tree
	 */
	void exitClazz(@NotNull X3Parser.ClazzContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#interfaze}.
	 * @param ctx the parse tree
	 */
	void enterInterfaze(@NotNull X3Parser.InterfazeContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#interfaze}.
	 * @param ctx the parse tree
	 */
	void exitInterfaze(@NotNull X3Parser.InterfazeContext ctx);

	/**
	 * Enter a parse tree produced by {@link X3Parser#constructor_call}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_call(@NotNull X3Parser.Constructor_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link X3Parser#constructor_call}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_call(@NotNull X3Parser.Constructor_callContext ctx);
}

// Generated from LangX.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangXParser}.
 */
public interface LangXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangXParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LangXParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LangXParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareArray}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclareArray(LangXParser.DeclareArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareArray}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclareArray(LangXParser.DeclareArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignArrayElem}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignArrayElem(LangXParser.AssignArrayElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignArrayElem}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignArrayElem(LangXParser.AssignArrayElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readArrayElem}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReadArrayElem(LangXParser.ReadArrayElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readArrayElem}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReadArrayElem(LangXParser.ReadArrayElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeId}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWriteId(LangXParser.WriteIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeId}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWriteId(LangXParser.WriteIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeArrayRange}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWriteArrayRange(LangXParser.WriteArrayRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeArrayRange}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWriteArrayRange(LangXParser.WriteArrayRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeArrayFrom}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWriteArrayFrom(LangXParser.WriteArrayFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeArrayFrom}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWriteArrayFrom(LangXParser.WriteArrayFromContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeArrayTo}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWriteArrayTo(LangXParser.WriteArrayToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeArrayTo}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWriteArrayTo(LangXParser.WriteArrayToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareAndAssign}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclareAndAssign(LangXParser.DeclareAndAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareAndAssign}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclareAndAssign(LangXParser.DeclareAndAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declare}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(LangXParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declare}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(LangXParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LangXParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LangXParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWrite(LangXParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWrite(LangXParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRead(LangXParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRead(LangXParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LangXParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LangXParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayElem}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayElem(LangXParser.ArrayElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayElem}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayElem(LangXParser.ArrayElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(LangXParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(LangXParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(LangXParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(LangXParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicOr}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicOr(LangXParser.LogicOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicOr}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicOr(LangXParser.LogicOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueConst}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueConst(LangXParser.TrueConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueConst}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueConst(LangXParser.TrueConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(LangXParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(LangXParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intConst}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntConst(LangXParser.IntConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intConst}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntConst(LangXParser.IntConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(LangXParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(LangXParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicAnd}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicAnd(LangXParser.LogicAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicAnd}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicAnd(LangXParser.LogicAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicXor}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicXor(LangXParser.LogicXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicXor}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicXor(LangXParser.LogicXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicNeg}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicNeg(LangXParser.LogicNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicNeg}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicNeg(LangXParser.LogicNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realConst}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRealConst(LangXParser.RealConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realConst}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRealConst(LangXParser.RealConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseConst}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseConst(LangXParser.FalseConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseConst}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseConst(LangXParser.FalseConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConst}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringConst(LangXParser.StringConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConst}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringConst(LangXParser.StringConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#andOp}.
	 * @param ctx the parse tree
	 */
	void enterAndOp(LangXParser.AndOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#andOp}.
	 * @param ctx the parse tree
	 */
	void exitAndOp(LangXParser.AndOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#orOp}.
	 * @param ctx the parse tree
	 */
	void enterOrOp(LangXParser.OrOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#orOp}.
	 * @param ctx the parse tree
	 */
	void exitOrOp(LangXParser.OrOpContext ctx);
}
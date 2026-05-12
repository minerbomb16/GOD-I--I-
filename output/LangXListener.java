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
	 * Enter a parse tree produced by {@link LangXParser#structDecl}.
	 * @param ctx the parse tree
	 */
	void enterStructDecl(LangXParser.StructDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#structDecl}.
	 * @param ctx the parse tree
	 */
	void exitStructDecl(LangXParser.StructDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#structField}.
	 * @param ctx the parse tree
	 */
	void enterStructField(LangXParser.StructFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#structField}.
	 * @param ctx the parse tree
	 */
	void exitStructField(LangXParser.StructFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(LangXParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(LangXParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#classField}.
	 * @param ctx the parse tree
	 */
	void enterClassField(LangXParser.ClassFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#classField}.
	 * @param ctx the parse tree
	 */
	void exitClassField(LangXParser.ClassFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(LangXParser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(LangXParser.VisibilityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareMatrix}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterDeclareMatrix(LangXParser.DeclareMatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareMatrix}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitDeclareMatrix(LangXParser.DeclareMatrixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignMatrixElem}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterAssignMatrixElem(LangXParser.AssignMatrixElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignMatrixElem}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitAssignMatrixElem(LangXParser.AssignMatrixElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readMatrixElem}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterReadMatrixElem(LangXParser.ReadMatrixElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readMatrixElem}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitReadMatrixElem(LangXParser.ReadMatrixElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeMatrixRow}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterWriteMatrixRow(LangXParser.WriteMatrixRowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeMatrixRow}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitWriteMatrixRow(LangXParser.WriteMatrixRowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeMatrixColumn}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterWriteMatrixColumn(LangXParser.WriteMatrixColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeMatrixColumn}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitWriteMatrixColumn(LangXParser.WriteMatrixColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareArray}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterDeclareArray(LangXParser.DeclareArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareArray}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitDeclareArray(LangXParser.DeclareArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignArrayElem}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterAssignArrayElem(LangXParser.AssignArrayElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignArrayElem}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitAssignArrayElem(LangXParser.AssignArrayElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readArrayElem}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterReadArrayElem(LangXParser.ReadArrayElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readArrayElem}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitReadArrayElem(LangXParser.ReadArrayElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeId}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterWriteId(LangXParser.WriteIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeId}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitWriteId(LangXParser.WriteIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeArrayRange}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterWriteArrayRange(LangXParser.WriteArrayRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeArrayRange}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitWriteArrayRange(LangXParser.WriteArrayRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeArrayFrom}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterWriteArrayFrom(LangXParser.WriteArrayFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeArrayFrom}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitWriteArrayFrom(LangXParser.WriteArrayFromContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeArrayTo}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterWriteArrayTo(LangXParser.WriteArrayToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeArrayTo}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitWriteArrayTo(LangXParser.WriteArrayToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareAndAssign}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterDeclareAndAssign(LangXParser.DeclareAndAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareAndAssign}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitDeclareAndAssign(LangXParser.DeclareAndAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declare}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(LangXParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declare}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(LangXParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LangXParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LangXParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterWrite(LangXParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitWrite(LangXParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterRead(LangXParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitRead(LangXParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmtNode}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterIfStmtNode(LangXParser.IfStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmtNode}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitIfStmtNode(LangXParser.IfStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmtNode}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmtNode(LangXParser.WhileStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmtNode}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmtNode(LangXParser.WhileStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStmtNode}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterForStmtNode(LangXParser.ForStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStmtNode}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitForStmtNode(LangXParser.ForStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallStat}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStat(LangXParser.FunctionCallStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallStat}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStat(LangXParser.FunctionCallStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStat}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(LangXParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStat}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(LangXParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareStruct}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStruct(LangXParser.DeclareStructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareStruct}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStruct(LangXParser.DeclareStructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareClass}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterDeclareClass(LangXParser.DeclareClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareClass}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitDeclareClass(LangXParser.DeclareClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStructField}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterAssignStructField(LangXParser.AssignStructFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStructField}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitAssignStructField(LangXParser.AssignStructFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readStructField}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterReadStructField(LangXParser.ReadStructFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readStructField}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitReadStructField(LangXParser.ReadStructFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeStructField}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterWriteStructField(LangXParser.WriteStructFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeStructField}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitWriteStructField(LangXParser.WriteStructFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallStat}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStat(LangXParser.MethodCallStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallStat}
	 * labeled alternative in {@link LangXParser#start}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStat(LangXParser.MethodCallStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(LangXParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(LangXParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#ifCond}.
	 * @param ctx the parse tree
	 */
	void enterIfCond(LangXParser.IfCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#ifCond}.
	 * @param ctx the parse tree
	 */
	void exitIfCond(LangXParser.IfCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(LangXParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(LangXParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(LangXParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(LangXParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#whileCond}.
	 * @param ctx the parse tree
	 */
	void enterWhileCond(LangXParser.WhileCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#whileCond}.
	 * @param ctx the parse tree
	 */
	void exitWhileCond(LangXParser.WhileCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#whileKeyword}.
	 * @param ctx the parse tree
	 */
	void enterWhileKeyword(LangXParser.WhileKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#whileKeyword}.
	 * @param ctx the parse tree
	 */
	void exitWhileKeyword(LangXParser.WhileKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(LangXParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(LangXParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forTo}
	 * labeled alternative in {@link LangXParser#forInitCond}.
	 * @param ctx the parse tree
	 */
	void enterForTo(LangXParser.ForToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forTo}
	 * labeled alternative in {@link LangXParser#forInitCond}.
	 * @param ctx the parse tree
	 */
	void exitForTo(LangXParser.ForToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forToStep}
	 * labeled alternative in {@link LangXParser#forInitCond}.
	 * @param ctx the parse tree
	 */
	void enterForToStep(LangXParser.ForToStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forToStep}
	 * labeled alternative in {@link LangXParser#forInitCond}.
	 * @param ctx the parse tree
	 */
	void exitForToStep(LangXParser.ForToStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#forStartExpr}.
	 * @param ctx the parse tree
	 */
	void enterForStartExpr(LangXParser.ForStartExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#forStartExpr}.
	 * @param ctx the parse tree
	 */
	void exitForStartExpr(LangXParser.ForStartExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(LangXParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(LangXParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(LangXParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(LangXParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(LangXParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(LangXParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(LangXParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(LangXParser.ArgListContext ctx);
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
	 * Enter a parse tree produced by the {@code relOp}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(LangXParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relOp}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(LangXParser.RelOpContext ctx);
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
	 * Enter a parse tree produced by the {@code structFieldAccess}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStructFieldAccess(LangXParser.StructFieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structFieldAccess}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStructFieldAccess(LangXParser.StructFieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpr}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpr(LangXParser.MethodCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpr}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpr(LangXParser.MethodCallExprContext ctx);
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
	 * Enter a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(LangXParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(LangXParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(LangXParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(LangXParser.FunctionCallExprContext ctx);
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
	 * Enter a parse tree produced by the {@code matrixElem}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMatrixElem(LangXParser.MatrixElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matrixElem}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMatrixElem(LangXParser.MatrixElemContext ctx);
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
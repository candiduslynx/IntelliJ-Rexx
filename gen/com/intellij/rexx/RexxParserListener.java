// Generated from C:/Users/shchea/Documents/Projects/IntelliJ-Rexx/src/grammar\RexxParser.g4 by ANTLR 4.6
package com.intellij.rexx;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RexxParser}.
 */
public interface RexxParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RexxParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(RexxParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(RexxParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#program_}.
	 * @param ctx the parse tree
	 */
	void enterProgram_(RexxParser.Program_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#program_}.
	 * @param ctx the parse tree
	 */
	void exitProgram_(RexxParser.Program_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#ncl}.
	 * @param ctx the parse tree
	 */
	void enterNcl(RexxParser.NclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#ncl}.
	 * @param ctx the parse tree
	 */
	void exitNcl(RexxParser.NclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#null_clause}.
	 * @param ctx the parse tree
	 */
	void enterNull_clause(RexxParser.Null_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#null_clause}.
	 * @param ctx the parse tree
	 */
	void exitNull_clause(RexxParser.Null_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#delim}.
	 * @param ctx the parse tree
	 */
	void enterDelim(RexxParser.DelimContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#delim}.
	 * @param ctx the parse tree
	 */
	void exitDelim(RexxParser.DelimContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#label_list}.
	 * @param ctx the parse tree
	 */
	void enterLabel_list(RexxParser.Label_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#label_list}.
	 * @param ctx the parse tree
	 */
	void exitLabel_list(RexxParser.Label_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(RexxParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(RexxParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#include_statement}.
	 * @param ctx the parse tree
	 */
	void enterInclude_statement(RexxParser.Include_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#include_statement}.
	 * @param ctx the parse tree
	 */
	void exitInclude_statement(RexxParser.Include_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#instruction_list}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_list(RexxParser.Instruction_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#instruction_list}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_list(RexxParser.Instruction_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(RexxParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(RexxParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#single_instruction}.
	 * @param ctx the parse tree
	 */
	void enterSingle_instruction(RexxParser.Single_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#single_instruction}.
	 * @param ctx the parse tree
	 */
	void exitSingle_instruction(RexxParser.Single_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(RexxParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(RexxParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#var_symbol}.
	 * @param ctx the parse tree
	 */
	void enterVar_symbol(RexxParser.Var_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#var_symbol}.
	 * @param ctx the parse tree
	 */
	void exitVar_symbol(RexxParser.Var_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#keyword_instruction}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_instruction(RexxParser.Keyword_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#keyword_instruction}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_instruction(RexxParser.Keyword_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#command_}.
	 * @param ctx the parse tree
	 */
	void enterCommand_(RexxParser.Command_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#command_}.
	 * @param ctx the parse tree
	 */
	void exitCommand_(RexxParser.Command_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#group_}.
	 * @param ctx the parse tree
	 */
	void enterGroup_(RexxParser.Group_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#group_}.
	 * @param ctx the parse tree
	 */
	void exitGroup_(RexxParser.Group_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#do_}.
	 * @param ctx the parse tree
	 */
	void enterDo_(RexxParser.Do_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#do_}.
	 * @param ctx the parse tree
	 */
	void exitDo_(RexxParser.Do_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#do_ending}.
	 * @param ctx the parse tree
	 */
	void enterDo_ending(RexxParser.Do_endingContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#do_ending}.
	 * @param ctx the parse tree
	 */
	void exitDo_ending(RexxParser.Do_endingContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(RexxParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(RexxParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#then_}.
	 * @param ctx the parse tree
	 */
	void enterThen_(RexxParser.Then_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#then_}.
	 * @param ctx the parse tree
	 */
	void exitThen_(RexxParser.Then_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#else_}.
	 * @param ctx the parse tree
	 */
	void enterElse_(RexxParser.Else_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#else_}.
	 * @param ctx the parse tree
	 */
	void exitElse_(RexxParser.Else_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#select_}.
	 * @param ctx the parse tree
	 */
	void enterSelect_(RexxParser.Select_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#select_}.
	 * @param ctx the parse tree
	 */
	void exitSelect_(RexxParser.Select_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#select_body}.
	 * @param ctx the parse tree
	 */
	void enterSelect_body(RexxParser.Select_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#select_body}.
	 * @param ctx the parse tree
	 */
	void exitSelect_body(RexxParser.Select_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#when_}.
	 * @param ctx the parse tree
	 */
	void enterWhen_(RexxParser.When_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#when_}.
	 * @param ctx the parse tree
	 */
	void exitWhen_(RexxParser.When_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#otherwise_}.
	 * @param ctx the parse tree
	 */
	void enterOtherwise_(RexxParser.Otherwise_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#otherwise_}.
	 * @param ctx the parse tree
	 */
	void exitOtherwise_(RexxParser.Otherwise_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#address_}.
	 * @param ctx the parse tree
	 */
	void enterAddress_(RexxParser.Address_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#address_}.
	 * @param ctx the parse tree
	 */
	void exitAddress_(RexxParser.Address_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#taken_constant}.
	 * @param ctx the parse tree
	 */
	void enterTaken_constant(RexxParser.Taken_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#taken_constant}.
	 * @param ctx the parse tree
	 */
	void exitTaken_constant(RexxParser.Taken_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#valueexp}.
	 * @param ctx the parse tree
	 */
	void enterValueexp(RexxParser.ValueexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#valueexp}.
	 * @param ctx the parse tree
	 */
	void exitValueexp(RexxParser.ValueexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#connection_}.
	 * @param ctx the parse tree
	 */
	void enterConnection_(RexxParser.Connection_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#connection_}.
	 * @param ctx the parse tree
	 */
	void exitConnection_(RexxParser.Connection_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#adio}.
	 * @param ctx the parse tree
	 */
	void enterAdio(RexxParser.AdioContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#adio}.
	 * @param ctx the parse tree
	 */
	void exitAdio(RexxParser.AdioContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(RexxParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(RexxParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#resourcei}.
	 * @param ctx the parse tree
	 */
	void enterResourcei(RexxParser.ResourceiContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#resourcei}.
	 * @param ctx the parse tree
	 */
	void exitResourcei(RexxParser.ResourceiContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(RexxParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(RexxParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#resourceo}.
	 * @param ctx the parse tree
	 */
	void enterResourceo(RexxParser.ResourceoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#resourceo}.
	 * @param ctx the parse tree
	 */
	void exitResourceo(RexxParser.ResourceoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#adeo}.
	 * @param ctx the parse tree
	 */
	void enterAdeo(RexxParser.AdeoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#adeo}.
	 * @param ctx the parse tree
	 */
	void exitAdeo(RexxParser.AdeoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(RexxParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(RexxParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#adei}.
	 * @param ctx the parse tree
	 */
	void enterAdei(RexxParser.AdeiContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#adei}.
	 * @param ctx the parse tree
	 */
	void exitAdei(RexxParser.AdeiContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(RexxParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(RexxParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#arg_}.
	 * @param ctx the parse tree
	 */
	void enterArg_(RexxParser.Arg_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#arg_}.
	 * @param ctx the parse tree
	 */
	void exitArg_(RexxParser.Arg_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#call_}.
	 * @param ctx the parse tree
	 */
	void enterCall_(RexxParser.Call_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#call_}.
	 * @param ctx the parse tree
	 */
	void exitCall_(RexxParser.Call_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#callon_spec}.
	 * @param ctx the parse tree
	 */
	void enterCallon_spec(RexxParser.Callon_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#callon_spec}.
	 * @param ctx the parse tree
	 */
	void exitCallon_spec(RexxParser.Callon_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#callable_condition}.
	 * @param ctx the parse tree
	 */
	void enterCallable_condition(RexxParser.Callable_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#callable_condition}.
	 * @param ctx the parse tree
	 */
	void exitCallable_condition(RexxParser.Callable_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#call_parms}.
	 * @param ctx the parse tree
	 */
	void enterCall_parms(RexxParser.Call_parmsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#call_parms}.
	 * @param ctx the parse tree
	 */
	void exitCall_parms(RexxParser.Call_parmsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(RexxParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(RexxParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#do_specification}.
	 * @param ctx the parse tree
	 */
	void enterDo_specification(RexxParser.Do_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#do_specification}.
	 * @param ctx the parse tree
	 */
	void exitDo_specification(RexxParser.Do_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#do_simple}.
	 * @param ctx the parse tree
	 */
	void enterDo_simple(RexxParser.Do_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#do_simple}.
	 * @param ctx the parse tree
	 */
	void exitDo_simple(RexxParser.Do_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#do_repetitive}.
	 * @param ctx the parse tree
	 */
	void enterDo_repetitive(RexxParser.Do_repetitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#do_repetitive}.
	 * @param ctx the parse tree
	 */
	void exitDo_repetitive(RexxParser.Do_repetitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#docond}.
	 * @param ctx the parse tree
	 */
	void enterDocond(RexxParser.DocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#docond}.
	 * @param ctx the parse tree
	 */
	void exitDocond(RexxParser.DocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#untilexpr}.
	 * @param ctx the parse tree
	 */
	void enterUntilexpr(RexxParser.UntilexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#untilexpr}.
	 * @param ctx the parse tree
	 */
	void exitUntilexpr(RexxParser.UntilexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#whileexpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileexpr(RexxParser.WhileexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#whileexpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileexpr(RexxParser.WhileexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#dorep}.
	 * @param ctx the parse tree
	 */
	void enterDorep(RexxParser.DorepContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#dorep}.
	 * @param ctx the parse tree
	 */
	void exitDorep(RexxParser.DorepContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#repexpr}.
	 * @param ctx the parse tree
	 */
	void enterRepexpr(RexxParser.RepexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#repexpr}.
	 * @param ctx the parse tree
	 */
	void exitRepexpr(RexxParser.RepexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#docount}.
	 * @param ctx the parse tree
	 */
	void enterDocount(RexxParser.DocountContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#docount}.
	 * @param ctx the parse tree
	 */
	void exitDocount(RexxParser.DocountContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#dobf}.
	 * @param ctx the parse tree
	 */
	void enterDobf(RexxParser.DobfContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#dobf}.
	 * @param ctx the parse tree
	 */
	void exitDobf(RexxParser.DobfContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#dotf}.
	 * @param ctx the parse tree
	 */
	void enterDotf(RexxParser.DotfContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#dotf}.
	 * @param ctx the parse tree
	 */
	void exitDotf(RexxParser.DotfContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#dotb}.
	 * @param ctx the parse tree
	 */
	void enterDotb(RexxParser.DotbContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#dotb}.
	 * @param ctx the parse tree
	 */
	void exitDotb(RexxParser.DotbContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(RexxParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(RexxParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#toexpr}.
	 * @param ctx the parse tree
	 */
	void enterToexpr(RexxParser.ToexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#toexpr}.
	 * @param ctx the parse tree
	 */
	void exitToexpr(RexxParser.ToexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#dob}.
	 * @param ctx the parse tree
	 */
	void enterDob(RexxParser.DobContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#dob}.
	 * @param ctx the parse tree
	 */
	void exitDob(RexxParser.DobContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#byexpr}.
	 * @param ctx the parse tree
	 */
	void enterByexpr(RexxParser.ByexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#byexpr}.
	 * @param ctx the parse tree
	 */
	void exitByexpr(RexxParser.ByexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#dof}.
	 * @param ctx the parse tree
	 */
	void enterDof(RexxParser.DofContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#dof}.
	 * @param ctx the parse tree
	 */
	void exitDof(RexxParser.DofContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#forexpr}.
	 * @param ctx the parse tree
	 */
	void enterForexpr(RexxParser.ForexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#forexpr}.
	 * @param ctx the parse tree
	 */
	void exitForexpr(RexxParser.ForexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#drop_}.
	 * @param ctx the parse tree
	 */
	void enterDrop_(RexxParser.Drop_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#drop_}.
	 * @param ctx the parse tree
	 */
	void exitDrop_(RexxParser.Drop_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#variable_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_list(RexxParser.Variable_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#variable_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_list(RexxParser.Variable_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#vref}.
	 * @param ctx the parse tree
	 */
	void enterVref(RexxParser.VrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#vref}.
	 * @param ctx the parse tree
	 */
	void exitVref(RexxParser.VrefContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#exit_}.
	 * @param ctx the parse tree
	 */
	void enterExit_(RexxParser.Exit_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#exit_}.
	 * @param ctx the parse tree
	 */
	void exitExit_(RexxParser.Exit_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#interpret_}.
	 * @param ctx the parse tree
	 */
	void enterInterpret_(RexxParser.Interpret_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#interpret_}.
	 * @param ctx the parse tree
	 */
	void exitInterpret_(RexxParser.Interpret_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#iterate_}.
	 * @param ctx the parse tree
	 */
	void enterIterate_(RexxParser.Iterate_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#iterate_}.
	 * @param ctx the parse tree
	 */
	void exitIterate_(RexxParser.Iterate_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#leave_}.
	 * @param ctx the parse tree
	 */
	void enterLeave_(RexxParser.Leave_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#leave_}.
	 * @param ctx the parse tree
	 */
	void exitLeave_(RexxParser.Leave_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#nop_}.
	 * @param ctx the parse tree
	 */
	void enterNop_(RexxParser.Nop_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#nop_}.
	 * @param ctx the parse tree
	 */
	void exitNop_(RexxParser.Nop_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#numeric_}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_(RexxParser.Numeric_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#numeric_}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_(RexxParser.Numeric_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#numeric_digits}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_digits(RexxParser.Numeric_digitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#numeric_digits}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_digits(RexxParser.Numeric_digitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#numeric_form}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_form(RexxParser.Numeric_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#numeric_form}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_form(RexxParser.Numeric_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#numeric_fuzz}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_fuzz(RexxParser.Numeric_fuzzContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#numeric_fuzz}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_fuzz(RexxParser.Numeric_fuzzContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#options_}.
	 * @param ctx the parse tree
	 */
	void enterOptions_(RexxParser.Options_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#options_}.
	 * @param ctx the parse tree
	 */
	void exitOptions_(RexxParser.Options_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#parse_}.
	 * @param ctx the parse tree
	 */
	void enterParse_(RexxParser.Parse_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#parse_}.
	 * @param ctx the parse tree
	 */
	void exitParse_(RexxParser.Parse_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#parse_type}.
	 * @param ctx the parse tree
	 */
	void enterParse_type(RexxParser.Parse_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#parse_type}.
	 * @param ctx the parse tree
	 */
	void exitParse_type(RexxParser.Parse_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#parse_key}.
	 * @param ctx the parse tree
	 */
	void enterParse_key(RexxParser.Parse_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#parse_key}.
	 * @param ctx the parse tree
	 */
	void exitParse_key(RexxParser.Parse_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#parse_value}.
	 * @param ctx the parse tree
	 */
	void enterParse_value(RexxParser.Parse_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#parse_value}.
	 * @param ctx the parse tree
	 */
	void exitParse_value(RexxParser.Parse_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#parse_var}.
	 * @param ctx the parse tree
	 */
	void enterParse_var(RexxParser.Parse_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#parse_var}.
	 * @param ctx the parse tree
	 */
	void exitParse_var(RexxParser.Parse_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#procedure_}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_(RexxParser.Procedure_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#procedure_}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_(RexxParser.Procedure_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#pull_}.
	 * @param ctx the parse tree
	 */
	void enterPull_(RexxParser.Pull_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#pull_}.
	 * @param ctx the parse tree
	 */
	void exitPull_(RexxParser.Pull_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#push_}.
	 * @param ctx the parse tree
	 */
	void enterPush_(RexxParser.Push_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#push_}.
	 * @param ctx the parse tree
	 */
	void exitPush_(RexxParser.Push_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#queue_}.
	 * @param ctx the parse tree
	 */
	void enterQueue_(RexxParser.Queue_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#queue_}.
	 * @param ctx the parse tree
	 */
	void exitQueue_(RexxParser.Queue_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#return_}.
	 * @param ctx the parse tree
	 */
	void enterReturn_(RexxParser.Return_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#return_}.
	 * @param ctx the parse tree
	 */
	void exitReturn_(RexxParser.Return_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#say_}.
	 * @param ctx the parse tree
	 */
	void enterSay_(RexxParser.Say_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#say_}.
	 * @param ctx the parse tree
	 */
	void exitSay_(RexxParser.Say_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#signal_}.
	 * @param ctx the parse tree
	 */
	void enterSignal_(RexxParser.Signal_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#signal_}.
	 * @param ctx the parse tree
	 */
	void exitSignal_(RexxParser.Signal_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#signal_spec}.
	 * @param ctx the parse tree
	 */
	void enterSignal_spec(RexxParser.Signal_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#signal_spec}.
	 * @param ctx the parse tree
	 */
	void exitSignal_spec(RexxParser.Signal_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(RexxParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(RexxParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#trace_}.
	 * @param ctx the parse tree
	 */
	void enterTrace_(RexxParser.Trace_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#trace_}.
	 * @param ctx the parse tree
	 */
	void exitTrace_(RexxParser.Trace_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#trace_options}.
	 * @param ctx the parse tree
	 */
	void enterTrace_options(RexxParser.Trace_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#trace_options}.
	 * @param ctx the parse tree
	 */
	void exitTrace_options(RexxParser.Trace_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#prefix_option}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_option(RexxParser.Prefix_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#prefix_option}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_option(RexxParser.Prefix_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#trace_option}.
	 * @param ctx the parse tree
	 */
	void enterTrace_option(RexxParser.Trace_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#trace_option}.
	 * @param ctx the parse tree
	 */
	void exitTrace_option(RexxParser.Trace_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#upper_}.
	 * @param ctx the parse tree
	 */
	void enterUpper_(RexxParser.Upper_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#upper_}.
	 * @param ctx the parse tree
	 */
	void exitUpper_(RexxParser.Upper_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#template_list}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_list(RexxParser.Template_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#template_list}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_list(RexxParser.Template_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#template_}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_(RexxParser.Template_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#template_}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_(RexxParser.Template_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#target_}.
	 * @param ctx the parse tree
	 */
	void enterTarget_(RexxParser.Target_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#target_}.
	 * @param ctx the parse tree
	 */
	void exitTarget_(RexxParser.Target_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#trigger_}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_(RexxParser.Trigger_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#trigger_}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_(RexxParser.Trigger_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#pattern_}.
	 * @param ctx the parse tree
	 */
	void enterPattern_(RexxParser.Pattern_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#pattern_}.
	 * @param ctx the parse tree
	 */
	void exitPattern_(RexxParser.Pattern_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#positional_}.
	 * @param ctx the parse tree
	 */
	void enterPositional_(RexxParser.Positional_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#positional_}.
	 * @param ctx the parse tree
	 */
	void exitPositional_(RexxParser.Positional_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#absolute_positional}.
	 * @param ctx the parse tree
	 */
	void enterAbsolute_positional(RexxParser.Absolute_positionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#absolute_positional}.
	 * @param ctx the parse tree
	 */
	void exitAbsolute_positional(RexxParser.Absolute_positionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#position_}.
	 * @param ctx the parse tree
	 */
	void enterPosition_(RexxParser.Position_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#position_}.
	 * @param ctx the parse tree
	 */
	void exitPosition_(RexxParser.Position_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#relative_positional}.
	 * @param ctx the parse tree
	 */
	void enterRelative_positional(RexxParser.Relative_positionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#relative_positional}.
	 * @param ctx the parse tree
	 */
	void exitRelative_positional(RexxParser.Relative_positionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(RexxParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(RexxParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RexxParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RexxParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(RexxParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(RexxParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#or_operator}.
	 * @param ctx the parse tree
	 */
	void enterOr_operator(RexxParser.Or_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#or_operator}.
	 * @param ctx the parse tree
	 */
	void exitOr_operator(RexxParser.Or_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(RexxParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(RexxParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(RexxParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(RexxParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(RexxParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(RexxParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#normal_compare}.
	 * @param ctx the parse tree
	 */
	void enterNormal_compare(RexxParser.Normal_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#normal_compare}.
	 * @param ctx the parse tree
	 */
	void exitNormal_compare(RexxParser.Normal_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#strict_compare}.
	 * @param ctx the parse tree
	 */
	void enterStrict_compare(RexxParser.Strict_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#strict_compare}.
	 * @param ctx the parse tree
	 */
	void exitStrict_compare(RexxParser.Strict_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(RexxParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(RexxParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(RexxParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(RexxParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#additive_operator}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_operator(RexxParser.Additive_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#additive_operator}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_operator(RexxParser.Additive_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(RexxParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(RexxParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#multiplicative_operator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_operator(RexxParser.Multiplicative_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#multiplicative_operator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_operator(RexxParser.Multiplicative_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#power_expression}.
	 * @param ctx the parse tree
	 */
	void enterPower_expression(RexxParser.Power_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#power_expression}.
	 * @param ctx the parse tree
	 */
	void exitPower_expression(RexxParser.Power_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#prefix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_expression(RexxParser.Prefix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#prefix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_expression(RexxParser.Prefix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(RexxParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(RexxParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#function_}.
	 * @param ctx the parse tree
	 */
	void enterFunction_(RexxParser.Function_Context ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#function_}.
	 * @param ctx the parse tree
	 */
	void exitFunction_(RexxParser.Function_Context ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(RexxParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(RexxParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RexxParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(RexxParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RexxParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(RexxParser.Function_parametersContext ctx);
}
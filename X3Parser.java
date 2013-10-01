// Generated from X3Parser.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class X3Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		APPEND=21, VNAME=54, LSQBRACKET=5, CLASS=47, WHILE=37, MOD=28, NTHROUGHN=20, 
		LANGLE=3, FOR=38, THING=45, AND=26, LPAREN=1, IF=35, RSQBRACKET=6, RPAREN=2, 
		IN=40, COMMA=9, RETURN=39, NOTHING=46, TVAR=52, PLUS=30, GEQ=23, SUPER=44, 
		EQ=24, RANGLE=4, DOT=10, DIVIDE=32, S_COMMENT=50, NONWARDS=16, ELSE=36, 
		LCURLY=7, BANG=14, SEMICOLON=12, INT=48, TNAME=53, MINUS=31, TRUE=33, 
		THROUGHN=19, ONWARDS=15, COLON=13, WS=55, NEQ=25, NTHROUGH=18, RCURLY=8, 
		OR=27, ASSIGN=11, THROUGH=17, INTERFACE=41, TIMES=29, FUN=43, FALSE=34, 
		EXTENDS=42, M_COMMENT=51, STRING=49, LEQ=22;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'<'", "'>'", "'['", "']'", "'{'", "'}'", "','", 
		"'.'", "':='", "';'", "':'", "'!'", "'...'", "'<..'", "'..'", "'<.'", 
		"'.<'", "'<<'", "'++'", "'<='", "'>='", "'=='", "'!='", "'&'", "'|'", 
		"'%'", "'*'", "'+'", "'-'", "'/'", "'true'", "'false'", "'if'", "'else'", 
		"'while'", "'for'", "'return'", "'in'", "'interface'", "'extends'", "'fun'", 
		"'super'", "'Thing'", "'Nothing'", "'class'", "INT", "STRING", "S_COMMENT", 
		"M_COMMENT", "TVAR", "TNAME", "VNAME", "WS"
	};
	public static final int
		RULE_expr_lst = 0, RULE_tname_lst = 1, RULE_tvar_lst = 2, RULE_tau = 3, 
		RULE_tau_lst = 4, RULE_gamma = 5, RULE_sigma = 6, RULE_func_call = 7, 
		RULE_constructor_call = 8, RULE_list_literal = 9, RULE_expr = 10, RULE_if_stmt = 11, 
		RULE_stmt = 12, RULE_interfaze = 13, RULE_clazz = 14, RULE_interface_impl = 15, 
		RULE_class_impl = 16, RULE_toplevel_fun = 17, RULE_fun_decl = 18, RULE_fun_impl_or_semi = 19, 
		RULE_program = 20, RULE_input = 21;
	public static final String[] ruleNames = {
		"expr_lst", "tname_lst", "tvar_lst", "tau", "tau_lst", "gamma", "sigma", 
		"func_call", "constructor_call", "list_literal", "expr", "if_stmt", "stmt", 
		"interfaze", "clazz", "interface_impl", "class_impl", "toplevel_fun", 
		"fun_decl", "fun_impl_or_semi", "program", "input"
	};

	@Override
	public String getGrammarFileName() { return "X3Parser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public X3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Expr_lstContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(X3Parser.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(X3Parser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(X3Parser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(X3Parser.COMMA, i);
		}
		public Expr_lstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_lst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterExpr_lst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitExpr_lst(this);
		}
	}

	public final Expr_lstContext expr_lst() throws RecognitionException {
		Expr_lstContext _localctx = new Expr_lstContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr_lst);
		int _la;
		try {
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); match(LPAREN);
				setState(45); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46); match(LPAREN);
				setState(47); expr(0);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(48); match(COMMA);
					setState(49); expr(0);
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55); match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tname_lstContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(X3Parser.COMMA); }
		public List<TerminalNode> TNAME() { return getTokens(X3Parser.TNAME); }
		public TerminalNode TNAME(int i) {
			return getToken(X3Parser.TNAME, i);
		}
		public TerminalNode LANGLE() { return getToken(X3Parser.LANGLE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(X3Parser.COMMA, i);
		}
		public TerminalNode RANGLE() { return getToken(X3Parser.RANGLE, 0); }
		public Tname_lstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tname_lst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterTname_lst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitTname_lst(this);
		}
	}

	public final Tname_lstContext tname_lst() throws RecognitionException {
		Tname_lstContext _localctx = new Tname_lstContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tname_lst);
		int _la;
		try {
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); match(LANGLE);
				setState(60); match(RANGLE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); match(LANGLE);
				setState(62); match(TNAME);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(63); match(COMMA);
					setState(64); match(TNAME);
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70); match(RANGLE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tvar_lstContext extends ParserRuleContext {
		public TerminalNode TVAR(int i) {
			return getToken(X3Parser.TVAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(X3Parser.COMMA); }
		public List<TerminalNode> TVAR() { return getTokens(X3Parser.TVAR); }
		public TerminalNode LANGLE() { return getToken(X3Parser.LANGLE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(X3Parser.COMMA, i);
		}
		public TerminalNode RANGLE() { return getToken(X3Parser.RANGLE, 0); }
		public Tvar_lstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tvar_lst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterTvar_lst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitTvar_lst(this);
		}
	}

	public final Tvar_lstContext tvar_lst() throws RecognitionException {
		Tvar_lstContext _localctx = new Tvar_lstContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tvar_lst);
		int _la;
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); match(LANGLE);
				setState(74); match(RANGLE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); match(LANGLE);
				setState(76); match(TVAR);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(77); match(COMMA);
					setState(78); match(TVAR);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84); match(RANGLE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TauContext extends ParserRuleContext {
		public int _p;
		public List<TauContext> tau() {
			return getRuleContexts(TauContext.class);
		}
		public Tau_lstContext tau_lst() {
			return getRuleContext(Tau_lstContext.class,0);
		}
		public TerminalNode AND() { return getToken(X3Parser.AND, 0); }
		public TerminalNode TNAME() { return getToken(X3Parser.TNAME, 0); }
		public TerminalNode THING() { return getToken(X3Parser.THING, 0); }
		public TerminalNode TVAR() { return getToken(X3Parser.TVAR, 0); }
		public TerminalNode NOTHING() { return getToken(X3Parser.NOTHING, 0); }
		public TauContext tau(int i) {
			return getRuleContext(TauContext.class,i);
		}
		public TauContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TauContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_tau; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterTau(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitTau(this);
		}
	}

	public final TauContext tau(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TauContext _localctx = new TauContext(_ctx, _parentState, _p);
		TauContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, RULE_tau);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			switch (_input.LA(1)) {
			case TVAR:
				{
				setState(88); match(TVAR);
				}
				break;
			case TNAME:
				{
				setState(89); match(TNAME);
				setState(91);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(90); tau_lst();
					}
					break;
				}
				}
				break;
			case THING:
				{
				setState(93); match(THING);
				}
				break;
			case NOTHING:
				{
				setState(94); match(NOTHING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TauContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_tau);
					setState(97);
					if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
					setState(98); match(AND);
					setState(99); tau(4);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Tau_lstContext extends ParserRuleContext {
		public List<TauContext> tau() {
			return getRuleContexts(TauContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(X3Parser.COMMA); }
		public TerminalNode LANGLE() { return getToken(X3Parser.LANGLE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(X3Parser.COMMA, i);
		}
		public TauContext tau(int i) {
			return getRuleContext(TauContext.class,i);
		}
		public TerminalNode RANGLE() { return getToken(X3Parser.RANGLE, 0); }
		public Tau_lstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tau_lst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterTau_lst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitTau_lst(this);
		}
	}

	public final Tau_lstContext tau_lst() throws RecognitionException {
		Tau_lstContext _localctx = new Tau_lstContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tau_lst);
		int _la;
		try {
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); match(LANGLE);
				setState(106); match(RANGLE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); match(LANGLE);
				setState(108); tau(0);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(109); match(COMMA);
					setState(110); tau(0);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116); match(RANGLE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GammaContext extends ParserRuleContext {
		public List<TauContext> tau() {
			return getRuleContexts(TauContext.class);
		}
		public TerminalNode VNAME(int i) {
			return getToken(X3Parser.VNAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(X3Parser.COMMA); }
		public TerminalNode RPAREN() { return getToken(X3Parser.RPAREN, 0); }
		public TerminalNode COLON(int i) {
			return getToken(X3Parser.COLON, i);
		}
		public List<TerminalNode> VNAME() { return getTokens(X3Parser.VNAME); }
		public TerminalNode LPAREN() { return getToken(X3Parser.LPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(X3Parser.COLON); }
		public TerminalNode COMMA(int i) {
			return getToken(X3Parser.COMMA, i);
		}
		public TauContext tau(int i) {
			return getRuleContext(TauContext.class,i);
		}
		public GammaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gamma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterGamma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitGamma(this);
		}
	}

	public final GammaContext gamma() throws RecognitionException {
		GammaContext _localctx = new GammaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_gamma);
		int _la;
		try {
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); match(LPAREN);
				setState(121); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); match(LPAREN);
				setState(123); match(VNAME);
				setState(124); match(COLON);
				setState(125); tau(0);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(126); match(COMMA);
					setState(127); match(VNAME);
					setState(128); match(COLON);
					setState(129); tau(0);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135); match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SigmaContext extends ParserRuleContext {
		public TauContext tau() {
			return getRuleContext(TauContext.class,0);
		}
		public Tname_lstContext tname_lst() {
			return getRuleContext(Tname_lstContext.class,0);
		}
		public GammaContext gamma() {
			return getRuleContext(GammaContext.class,0);
		}
		public TerminalNode COLON() { return getToken(X3Parser.COLON, 0); }
		public SigmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sigma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterSigma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitSigma(this);
		}
	}

	public final SigmaContext sigma() throws RecognitionException {
		SigmaContext _localctx = new SigmaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sigma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(139); tname_lst();
				}
			}

			setState(142); gamma();
			setState(143); match(COLON);
			setState(144); tau(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_callContext extends ParserRuleContext {
		public Tau_lstContext tau_lst() {
			return getRuleContext(Tau_lstContext.class,0);
		}
		public Expr_lstContext expr_lst() {
			return getRuleContext(Expr_lstContext.class,0);
		}
		public TerminalNode VNAME() { return getToken(X3Parser.VNAME, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitFunc_call(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(VNAME);
			setState(148);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(147); tau_lst();
				}
			}

			setState(150); expr_lst();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_callContext extends ParserRuleContext {
		public Tau_lstContext tau_lst() {
			return getRuleContext(Tau_lstContext.class,0);
		}
		public Expr_lstContext expr_lst() {
			return getRuleContext(Expr_lstContext.class,0);
		}
		public TerminalNode TNAME() { return getToken(X3Parser.TNAME, 0); }
		public Constructor_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterConstructor_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitConstructor_call(this);
		}
	}

	public final Constructor_callContext constructor_call() throws RecognitionException {
		Constructor_callContext _localctx = new Constructor_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constructor_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(TNAME);
			setState(154);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(153); tau_lst();
				}
			}

			setState(156); expr_lst();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_literalContext extends ParserRuleContext {
		public TerminalNode RSQBRACKET() { return getToken(X3Parser.RSQBRACKET, 0); }
		public TerminalNode LSQBRACKET() { return getToken(X3Parser.LSQBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(X3Parser.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(X3Parser.COMMA, i);
		}
		public List_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterList_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitList_literal(this);
		}
	}

	public final List_literalContext list_literal() throws RecognitionException {
		List_literalContext _localctx = new List_literalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list_literal);
		int _la;
		try {
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158); match(LSQBRACKET);
				setState(159); match(RSQBRACKET);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160); match(LSQBRACKET);
				setState(161); expr(0);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(162); match(COMMA);
					setState(163); expr(0);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169); match(RSQBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public TerminalNode NONWARDS() { return getToken(X3Parser.NONWARDS, 0); }
		public TerminalNode APPEND() { return getToken(X3Parser.APPEND, 0); }
		public TerminalNode INT() { return getToken(X3Parser.INT, 0); }
		public TerminalNode TRUE() { return getToken(X3Parser.TRUE, 0); }
		public TerminalNode AND() { return getToken(X3Parser.AND, 0); }
		public TerminalNode LANGLE() { return getToken(X3Parser.LANGLE, 0); }
		public TerminalNode DIVIDE() { return getToken(X3Parser.DIVIDE, 0); }
		public TerminalNode EQ() { return getToken(X3Parser.EQ, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List_literalContext list_literal() {
			return getRuleContext(List_literalContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Constructor_callContext constructor_call() {
			return getRuleContext(Constructor_callContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(X3Parser.PLUS, 0); }
		public TerminalNode ONWARDS() { return getToken(X3Parser.ONWARDS, 0); }
		public TerminalNode GEQ() { return getToken(X3Parser.GEQ, 0); }
		public TerminalNode TIMES() { return getToken(X3Parser.TIMES, 0); }
		public TerminalNode OR() { return getToken(X3Parser.OR, 0); }
		public TerminalNode MINUS() { return getToken(X3Parser.MINUS, 0); }
		public TerminalNode BANG() { return getToken(X3Parser.BANG, 0); }
		public TerminalNode LPAREN() { return getToken(X3Parser.LPAREN, 0); }
		public TerminalNode RANGLE() { return getToken(X3Parser.RANGLE, 0); }
		public TerminalNode NEQ() { return getToken(X3Parser.NEQ, 0); }
		public TerminalNode THROUGHN() { return getToken(X3Parser.THROUGHN, 0); }
		public TerminalNode DOT() { return getToken(X3Parser.DOT, 0); }
		public TerminalNode NTHROUGH() { return getToken(X3Parser.NTHROUGH, 0); }
		public TerminalNode THROUGH() { return getToken(X3Parser.THROUGH, 0); }
		public TerminalNode RPAREN() { return getToken(X3Parser.RPAREN, 0); }
		public TerminalNode LEQ() { return getToken(X3Parser.LEQ, 0); }
		public TerminalNode VNAME() { return getToken(X3Parser.VNAME, 0); }
		public TerminalNode STRING() { return getToken(X3Parser.STRING, 0); }
		public TerminalNode MOD() { return getToken(X3Parser.MOD, 0); }
		public TerminalNode FALSE() { return getToken(X3Parser.FALSE, 0); }
		public TerminalNode NTHROUGHN() { return getToken(X3Parser.NTHROUGHN, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(174); match(BANG);
				setState(175); expr(22);
				}
				break;

			case 2:
				{
				setState(176); match(MINUS);
				setState(177); expr(21);
				}
				break;

			case 3:
				{
				setState(178); match(VNAME);
				}
				break;

			case 4:
				{
				setState(179); func_call();
				}
				break;

			case 5:
				{
				setState(180); constructor_call();
				}
				break;

			case 6:
				{
				setState(181); list_literal();
				}
				break;

			case 7:
				{
				setState(182); match(TRUE);
				}
				break;

			case 8:
				{
				setState(183); match(FALSE);
				}
				break;

			case 9:
				{
				setState(184); match(INT);
				}
				break;

			case 10:
				{
				setState(185); match(STRING);
				}
				break;

			case 11:
				{
				setState(186); match(LPAREN);
				setState(187); expr(0);
				setState(188); match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(253);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(27 >= _localctx._p)) throw new FailedPredicateException(this, "27 >= $_p");
						setState(193); match(APPEND);
						setState(194); expr(28);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(196); match(TIMES);
						setState(197); expr(21);
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(199); match(DIVIDE);
						setState(200); expr(20);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(202); match(MINUS);
						setState(203); expr(19);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(205); match(PLUS);
						setState(206); expr(18);
						}
						break;

					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(208); match(MOD);
						setState(209); expr(17);
						}
						break;

					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(211); match(THROUGH);
						setState(212); expr(14);
						}
						break;

					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(214); match(NTHROUGH);
						setState(215); expr(13);
						}
						break;

					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(217); match(THROUGHN);
						setState(218); expr(12);
						}
						break;

					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(220); match(NTHROUGHN);
						setState(221); expr(11);
						}
						break;

					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(223); match(LANGLE);
						setState(224); expr(10);
						}
						break;

					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(226); match(RANGLE);
						setState(227); expr(9);
						}
						break;

					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(229); match(LEQ);
						setState(230); expr(8);
						}
						break;

					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(232); match(GEQ);
						setState(233); expr(7);
						}
						break;

					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(235); match(EQ);
						setState(236); expr(6);
						}
						break;

					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(238); match(NEQ);
						setState(239); expr(5);
						}
						break;

					case 17:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(241); match(AND);
						setState(242); expr(4);
						}
						break;

					case 18:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(243);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(244); match(OR);
						setState(245); expr(3);
						}
						break;

					case 19:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(30 >= _localctx._p)) throw new FailedPredicateException(this, "30 >= $_p");
						setState(247); match(DOT);
						setState(248); func_call();
						}
						break;

					case 20:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(250); match(ONWARDS);
						}
						break;

					case 21:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(252); match(NONWARDS);
						}
						break;
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(X3Parser.IF, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(X3Parser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(X3Parser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(X3Parser.LPAREN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_stmt);
		try {
			setState(272);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258); match(IF);
				setState(259); match(LPAREN);
				setState(260); expr(0);
				setState(261); match(RPAREN);
				setState(262); stmt();
				setState(263); match(ELSE);
				setState(264); stmt();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266); match(IF);
				setState(267); match(LPAREN);
				setState(268); expr(0);
				setState(269); match(RPAREN);
				setState(270); stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(X3Parser.LCURLY, 0); }
		public TerminalNode SEMICOLON() { return getToken(X3Parser.SEMICOLON, 0); }
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(X3Parser.LPAREN, 0); }
		public TerminalNode RCURLY() { return getToken(X3Parser.RCURLY, 0); }
		public TerminalNode IN() { return getToken(X3Parser.IN, 0); }
		public TerminalNode WHILE() { return getToken(X3Parser.WHILE, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode FOR() { return getToken(X3Parser.FOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(X3Parser.ASSIGN, 0); }
		public TerminalNode RPAREN() { return getToken(X3Parser.RPAREN, 0); }
		public TerminalNode RETURN() { return getToken(X3Parser.RETURN, 0); }
		public TerminalNode VNAME() { return getToken(X3Parser.VNAME, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmt);
		int _la;
		try {
			setState(306);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(274); match(LCURLY);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << VNAME))) != 0)) {
					{
					{
					setState(275); stmt();
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(281); match(RCURLY);
				}
				break;
			case VNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(282); match(VNAME);
				setState(283); match(ASSIGN);
				setState(284); expr(0);
				setState(285); match(SEMICOLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(287); if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(288); match(WHILE);
				setState(289); match(LPAREN);
				setState(290); expr(0);
				setState(291); match(RPAREN);
				setState(292); stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(294); match(FOR);
				setState(295); match(LPAREN);
				setState(296); match(VNAME);
				setState(297); match(IN);
				setState(298); expr(0);
				setState(299); match(RPAREN);
				setState(300); stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(302); match(RETURN);
				setState(303); expr(0);
				setState(304); match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfazeContext extends ParserRuleContext {
		public TauContext tau() {
			return getRuleContext(TauContext.class,0);
		}
		public TerminalNode TNAME() { return getToken(X3Parser.TNAME, 0); }
		public Tvar_lstContext tvar_lst() {
			return getRuleContext(Tvar_lstContext.class,0);
		}
		public TerminalNode INTERFACE() { return getToken(X3Parser.INTERFACE, 0); }
		public Interface_implContext interface_impl() {
			return getRuleContext(Interface_implContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(X3Parser.EXTENDS, 0); }
		public InterfazeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaze; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterInterfaze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitInterfaze(this);
		}
	}

	public final InterfazeContext interfaze() throws RecognitionException {
		InterfazeContext _localctx = new InterfazeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaze);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308); match(INTERFACE);
			setState(309); match(TNAME);
			setState(311);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(310); tvar_lst();
				}
			}

			setState(315);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(313); match(EXTENDS);
				setState(314); tau(0);
				}
			}

			setState(317); interface_impl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClazzContext extends ParserRuleContext {
		public Class_implContext class_impl() {
			return getRuleContext(Class_implContext.class,0);
		}
		public TauContext tau() {
			return getRuleContext(TauContext.class,0);
		}
		public GammaContext gamma() {
			return getRuleContext(GammaContext.class,0);
		}
		public TerminalNode TNAME() { return getToken(X3Parser.TNAME, 0); }
		public Tvar_lstContext tvar_lst() {
			return getRuleContext(Tvar_lstContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(X3Parser.EXTENDS, 0); }
		public TerminalNode CLASS() { return getToken(X3Parser.CLASS, 0); }
		public ClazzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clazz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterClazz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitClazz(this);
		}
	}

	public final ClazzContext clazz() throws RecognitionException {
		ClazzContext _localctx = new ClazzContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_clazz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(CLASS);
			setState(320); match(TNAME);
			setState(322);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(321); tvar_lst();
				}
			}

			setState(324); gamma();
			setState(327);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(325); match(EXTENDS);
				setState(326); tau(0);
				}
			}

			setState(329); class_impl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_implContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(X3Parser.LCURLY, 0); }
		public List<Fun_declContext> fun_decl() {
			return getRuleContexts(Fun_declContext.class);
		}
		public Fun_declContext fun_decl(int i) {
			return getRuleContext(Fun_declContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(X3Parser.RCURLY, 0); }
		public Interface_implContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_impl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterInterface_impl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitInterface_impl(this);
		}
	}

	public final Interface_implContext interface_impl() throws RecognitionException {
		Interface_implContext _localctx = new Interface_implContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interface_impl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); match(LCURLY);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUN) {
				{
				{
				setState(332); fun_decl();
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338); match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_implContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(X3Parser.LCURLY, 0); }
		public TerminalNode SEMICOLON() { return getToken(X3Parser.SEMICOLON, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode SUPER() { return getToken(X3Parser.SUPER, 0); }
		public List<Fun_declContext> fun_decl() {
			return getRuleContexts(Fun_declContext.class);
		}
		public Fun_declContext fun_decl(int i) {
			return getRuleContext(Fun_declContext.class,i);
		}
		public Expr_lstContext expr_lst() {
			return getRuleContext(Expr_lstContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(X3Parser.RCURLY, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public Class_implContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_impl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterClass_impl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitClass_impl(this);
		}
	}

	public final Class_implContext class_impl() throws RecognitionException {
		Class_implContext _localctx = new Class_implContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_class_impl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); match(LCURLY);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << VNAME))) != 0)) {
				{
				{
				setState(341); stmt();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			_la = _input.LA(1);
			if (_la==SUPER) {
				{
				setState(347); match(SUPER);
				setState(348); expr_lst();
				setState(349); match(SEMICOLON);
				}
			}

			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUN) {
				{
				{
				setState(353); fun_decl();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359); match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Toplevel_funContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(X3Parser.SEMICOLON, 0); }
		public SigmaContext sigma() {
			return getRuleContext(SigmaContext.class,0);
		}
		public TerminalNode FUN() { return getToken(X3Parser.FUN, 0); }
		public TerminalNode VNAME() { return getToken(X3Parser.VNAME, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Toplevel_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toplevel_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterToplevel_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitToplevel_fun(this);
		}
	}

	public final Toplevel_funContext toplevel_fun() throws RecognitionException {
		Toplevel_funContext _localctx = new Toplevel_funContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_toplevel_fun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); match(FUN);
			setState(362); match(VNAME);
			setState(363); sigma();
			setState(364); stmt();
			setState(365); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fun_declContext extends ParserRuleContext {
		public SigmaContext sigma() {
			return getRuleContext(SigmaContext.class,0);
		}
		public TerminalNode FUN() { return getToken(X3Parser.FUN, 0); }
		public TerminalNode VNAME() { return getToken(X3Parser.VNAME, 0); }
		public Fun_impl_or_semiContext fun_impl_or_semi() {
			return getRuleContext(Fun_impl_or_semiContext.class,0);
		}
		public Fun_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterFun_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitFun_decl(this);
		}
	}

	public final Fun_declContext fun_decl() throws RecognitionException {
		Fun_declContext _localctx = new Fun_declContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fun_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); match(FUN);
			setState(368); match(VNAME);
			setState(369); sigma();
			setState(370); fun_impl_or_semi();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fun_impl_or_semiContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(X3Parser.SEMICOLON, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Fun_impl_or_semiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_impl_or_semi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterFun_impl_or_semi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitFun_impl_or_semi(this);
		}
	}

	public final Fun_impl_or_semiContext fun_impl_or_semi() throws RecognitionException {
		Fun_impl_or_semiContext _localctx = new Fun_impl_or_semiContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fun_impl_or_semi);
		try {
			setState(374);
			switch (_input.LA(1)) {
			case LCURLY:
			case IF:
			case WHILE:
			case FOR:
			case RETURN:
			case VNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(372); stmt();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(373); match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Toplevel_funContext toplevel_fun() {
			return getRuleContext(Toplevel_funContext.class,0);
		}
		public ClazzContext clazz() {
			return getRuleContext(ClazzContext.class,0);
		}
		public InterfazeContext interfaze() {
			return getRuleContext(InterfazeContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_program);
		try {
			setState(389);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376); stmt();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377); stmt();
				setState(378); program();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380); toplevel_fun();
				setState(381); program();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(383); interfaze();
				setState(384); program();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(386); clazz();
				setState(387); program();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(X3Parser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof X3ParserListener ) ((X3ParserListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); program();
			setState(392); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return tau_sempred((TauContext)_localctx, predIndex);

		case 10: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean tau_sempred(TauContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 3 >= _localctx._p;
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 27 >= _localctx._p;

		case 2: return 20 >= _localctx._p;

		case 3: return 19 >= _localctx._p;

		case 4: return 18 >= _localctx._p;

		case 5: return 17 >= _localctx._p;

		case 6: return 16 >= _localctx._p;

		case 7: return 13 >= _localctx._p;

		case 8: return 12 >= _localctx._p;

		case 9: return 11 >= _localctx._p;

		case 10: return 10 >= _localctx._p;

		case 11: return 9 >= _localctx._p;

		case 12: return 8 >= _localctx._p;

		case 13: return 7 >= _localctx._p;

		case 14: return 6 >= _localctx._p;

		case 15: return 5 >= _localctx._p;

		case 17: return 3 >= _localctx._p;

		case 16: return 4 >= _localctx._p;

		case 19: return 30 >= _localctx._p;

		case 18: return 2 >= _localctx._p;

		case 21: return 14 >= _localctx._p;

		case 20: return 15 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\39\u018d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\5\2<\n\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3D\n\3\f\3\16\3G\13\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4R\n"+
		"\4\f\4\16\4U\13\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\5\5^\n\5\3\5\3\5\5\5b\n"+
		"\5\3\5\3\5\3\5\7\5g\n\5\f\5\16\5j\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6r\n"+
		"\6\f\6\16\6u\13\6\3\6\3\6\5\6y\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u0085\n\7\f\7\16\7\u0088\13\7\3\7\3\7\5\7\u008c\n\7\3\b\5\b\u008f"+
		"\n\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u0097\n\t\3\t\3\t\3\n\3\n\5\n\u009d\n"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a7\n\13\f\13\16\13\u00aa"+
		"\13\13\3\13\3\13\5\13\u00ae\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c1\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u0100\n\f\f\f\16\f\u0103\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0113\n\r\3\16\3\16\7\16\u0117\n\16\f"+
		"\16\16\16\u011a\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0135\n\16\3\17\3\17\3\17\5\17\u013a\n\17\3\17\3\17\5\17\u013e"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\5\20\u0145\n\20\3\20\3\20\3\20\5\20\u014a"+
		"\n\20\3\20\3\20\3\21\3\21\7\21\u0150\n\21\f\21\16\21\u0153\13\21\3\21"+
		"\3\21\3\22\3\22\7\22\u0159\n\22\f\22\16\22\u015c\13\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0162\n\22\3\22\7\22\u0165\n\22\f\22\16\22\u0168\13\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\5\25\u0179\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0188\n\26\3\27\3\27\3\27\3\27\2\30\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,\2\2\u01bd\2;\3\2\2\2\4I\3\2\2\2\6W\3\2\2"+
		"\2\ba\3\2\2\2\nx\3\2\2\2\f\u008b\3\2\2\2\16\u008e\3\2\2\2\20\u0094\3\2"+
		"\2\2\22\u009a\3\2\2\2\24\u00ad\3\2\2\2\26\u00c0\3\2\2\2\30\u0112\3\2\2"+
		"\2\32\u0134\3\2\2\2\34\u0136\3\2\2\2\36\u0141\3\2\2\2 \u014d\3\2\2\2\""+
		"\u0156\3\2\2\2$\u016b\3\2\2\2&\u0171\3\2\2\2(\u0178\3\2\2\2*\u0187\3\2"+
		"\2\2,\u0189\3\2\2\2./\7\3\2\2/<\7\4\2\2\60\61\7\3\2\2\61\66\5\26\f\2\62"+
		"\63\7\13\2\2\63\65\5\26\f\2\64\62\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66"+
		"\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\4\2\2:<\3\2\2\2;.\3\2\2\2;\60"+
		"\3\2\2\2<\3\3\2\2\2=>\7\5\2\2>J\7\6\2\2?@\7\5\2\2@E\7\67\2\2AB\7\13\2"+
		"\2BD\7\67\2\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2"+
		"\2\2HJ\7\6\2\2I=\3\2\2\2I?\3\2\2\2J\5\3\2\2\2KL\7\5\2\2LX\7\6\2\2MN\7"+
		"\5\2\2NS\7\66\2\2OP\7\13\2\2PR\7\66\2\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2"+
		"ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VX\7\6\2\2WK\3\2\2\2WM\3\2\2\2X\7\3\2\2"+
		"\2YZ\b\5\1\2Zb\7\66\2\2[]\7\67\2\2\\^\5\n\6\2]\\\3\2\2\2]^\3\2\2\2^b\3"+
		"\2\2\2_b\7/\2\2`b\7\60\2\2aY\3\2\2\2a[\3\2\2\2a_\3\2\2\2a`\3\2\2\2bh\3"+
		"\2\2\2cd\6\5\2\3de\7\34\2\2eg\5\b\5\2fc\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi"+
		"\3\2\2\2i\t\3\2\2\2jh\3\2\2\2kl\7\5\2\2ly\7\6\2\2mn\7\5\2\2ns\5\b\5\2"+
		"op\7\13\2\2pr\5\b\5\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2"+
		"\2us\3\2\2\2vw\7\6\2\2wy\3\2\2\2xk\3\2\2\2xm\3\2\2\2y\13\3\2\2\2z{\7\3"+
		"\2\2{\u008c\7\4\2\2|}\7\3\2\2}~\78\2\2~\177\7\17\2\2\177\u0086\5\b\5\2"+
		"\u0080\u0081\7\13\2\2\u0081\u0082\78\2\2\u0082\u0083\7\17\2\2\u0083\u0085"+
		"\5\b\5\2\u0084\u0080\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\4"+
		"\2\2\u008a\u008c\3\2\2\2\u008bz\3\2\2\2\u008b|\3\2\2\2\u008c\r\3\2\2\2"+
		"\u008d\u008f\5\4\3\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\5\f\7\2\u0091\u0092\7\17\2\2\u0092\u0093\5\b\5\2"+
		"\u0093\17\3\2\2\2\u0094\u0096\78\2\2\u0095\u0097\5\n\6\2\u0096\u0095\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\5\2\2\2\u0099"+
		"\21\3\2\2\2\u009a\u009c\7\67\2\2\u009b\u009d\5\n\6\2\u009c\u009b\3\2\2"+
		"\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\5\2\2\2\u009f\23"+
		"\3\2\2\2\u00a0\u00a1\7\7\2\2\u00a1\u00ae\7\b\2\2\u00a2\u00a3\7\7\2\2\u00a3"+
		"\u00a8\5\26\f\2\u00a4\u00a5\7\13\2\2\u00a5\u00a7\5\26\f\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\b\2\2\u00ac\u00ae\3\2"+
		"\2\2\u00ad\u00a0\3\2\2\2\u00ad\u00a2\3\2\2\2\u00ae\25\3\2\2\2\u00af\u00b0"+
		"\b\f\1\2\u00b0\u00b1\7\20\2\2\u00b1\u00c1\5\26\f\2\u00b2\u00b3\7!\2\2"+
		"\u00b3\u00c1\5\26\f\2\u00b4\u00c1\78\2\2\u00b5\u00c1\5\20\t\2\u00b6\u00c1"+
		"\5\22\n\2\u00b7\u00c1\5\24\13\2\u00b8\u00c1\7#\2\2\u00b9\u00c1\7$\2\2"+
		"\u00ba\u00c1\7\62\2\2\u00bb\u00c1\7\63\2\2\u00bc\u00bd\7\3\2\2\u00bd\u00be"+
		"\5\26\f\2\u00be\u00bf\7\4\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00af\3\2\2\2"+
		"\u00c0\u00b2\3\2\2\2\u00c0\u00b4\3\2\2\2\u00c0\u00b5\3\2\2\2\u00c0\u00b6"+
		"\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c0"+
		"\u00ba\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\u0101\3\2"+
		"\2\2\u00c2\u00c3\6\f\3\3\u00c3\u00c4\7\27\2\2\u00c4\u0100\5\26\f\2\u00c5"+
		"\u00c6\6\f\4\3\u00c6\u00c7\7\37\2\2\u00c7\u0100\5\26\f\2\u00c8\u00c9\6"+
		"\f\5\3\u00c9\u00ca\7\"\2\2\u00ca\u0100\5\26\f\2\u00cb\u00cc\6\f\6\3\u00cc"+
		"\u00cd\7!\2\2\u00cd\u0100\5\26\f\2\u00ce\u00cf\6\f\7\3\u00cf\u00d0\7 "+
		"\2\2\u00d0\u0100\5\26\f\2\u00d1\u00d2\6\f\b\3\u00d2\u00d3\7\36\2\2\u00d3"+
		"\u0100\5\26\f\2\u00d4\u00d5\6\f\t\3\u00d5\u00d6\7\23\2\2\u00d6\u0100\5"+
		"\26\f\2\u00d7\u00d8\6\f\n\3\u00d8\u00d9\7\24\2\2\u00d9\u0100\5\26\f\2"+
		"\u00da\u00db\6\f\13\3\u00db\u00dc\7\25\2\2\u00dc\u0100\5\26\f\2\u00dd"+
		"\u00de\6\f\f\3\u00de\u00df\7\26\2\2\u00df\u0100\5\26\f\2\u00e0\u00e1\6"+
		"\f\r\3\u00e1\u00e2\7\5\2\2\u00e2\u0100\5\26\f\2\u00e3\u00e4\6\f\16\3\u00e4"+
		"\u00e5\7\6\2\2\u00e5\u0100\5\26\f\2\u00e6\u00e7\6\f\17\3\u00e7\u00e8\7"+
		"\30\2\2\u00e8\u0100\5\26\f\2\u00e9\u00ea\6\f\20\3\u00ea\u00eb\7\31\2\2"+
		"\u00eb\u0100\5\26\f\2\u00ec\u00ed\6\f\21\3\u00ed\u00ee\7\32\2\2\u00ee"+
		"\u0100\5\26\f\2\u00ef\u00f0\6\f\22\3\u00f0\u00f1\7\33\2\2\u00f1\u0100"+
		"\5\26\f\2\u00f2\u00f3\6\f\23\3\u00f3\u00f4\7\34\2\2\u00f4\u0100\5\26\f"+
		"\2\u00f5\u00f6\6\f\24\3\u00f6\u00f7\7\35\2\2\u00f7\u0100\5\26\f\2\u00f8"+
		"\u00f9\6\f\25\3\u00f9\u00fa\7\f\2\2\u00fa\u0100\5\20\t\2\u00fb\u00fc\6"+
		"\f\26\3\u00fc\u0100\7\21\2\2\u00fd\u00fe\6\f\27\3\u00fe\u0100\7\22\2\2"+
		"\u00ff\u00c2\3\2\2\2\u00ff\u00c5\3\2\2\2\u00ff\u00c8\3\2\2\2\u00ff\u00cb"+
		"\3\2\2\2\u00ff\u00ce\3\2\2\2\u00ff\u00d1\3\2\2\2\u00ff\u00d4\3\2\2\2\u00ff"+
		"\u00d7\3\2\2\2\u00ff\u00da\3\2\2\2\u00ff\u00dd\3\2\2\2\u00ff\u00e0\3\2"+
		"\2\2\u00ff\u00e3\3\2\2\2\u00ff\u00e6\3\2\2\2\u00ff\u00e9\3\2\2\2\u00ff"+
		"\u00ec\3\2\2\2\u00ff\u00ef\3\2\2\2\u00ff\u00f2\3\2\2\2\u00ff\u00f5\3\2"+
		"\2\2\u00ff\u00f8\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\27\3\2\2"+
		"\2\u0103\u0101\3\2\2\2\u0104\u0105\7%\2\2\u0105\u0106\7\3\2\2\u0106\u0107"+
		"\5\26\f\2\u0107\u0108\7\4\2\2\u0108\u0109\5\32\16\2\u0109\u010a\7&\2\2"+
		"\u010a\u010b\5\32\16\2\u010b\u0113\3\2\2\2\u010c\u010d\7%\2\2\u010d\u010e"+
		"\7\3\2\2\u010e\u010f\5\26\f\2\u010f\u0110\7\4\2\2\u0110\u0111\5\32\16"+
		"\2\u0111\u0113\3\2\2\2\u0112\u0104\3\2\2\2\u0112\u010c\3\2\2\2\u0113\31"+
		"\3\2\2\2\u0114\u0118\7\t\2\2\u0115\u0117\5\32\16\2\u0116\u0115\3\2\2\2"+
		"\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0135\7\n\2\2\u011c\u011d\78\2\2\u011d"+
		"\u011e\7\r\2\2\u011e\u011f\5\26\f\2\u011f\u0120\7\16\2\2\u0120\u0135\3"+
		"\2\2\2\u0121\u0135\5\30\r\2\u0122\u0123\7\'\2\2\u0123\u0124\7\3\2\2\u0124"+
		"\u0125\5\26\f\2\u0125\u0126\7\4\2\2\u0126\u0127\5\32\16\2\u0127\u0135"+
		"\3\2\2\2\u0128\u0129\7(\2\2\u0129\u012a\7\3\2\2\u012a\u012b\78\2\2\u012b"+
		"\u012c\7*\2\2\u012c\u012d\5\26\f\2\u012d\u012e\7\4\2\2\u012e\u012f\5\32"+
		"\16\2\u012f\u0135\3\2\2\2\u0130\u0131\7)\2\2\u0131\u0132\5\26\f\2\u0132"+
		"\u0133\7\16\2\2\u0133\u0135\3\2\2\2\u0134\u0114\3\2\2\2\u0134\u011c\3"+
		"\2\2\2\u0134\u0121\3\2\2\2\u0134\u0122\3\2\2\2\u0134\u0128\3\2\2\2\u0134"+
		"\u0130\3\2\2\2\u0135\33\3\2\2\2\u0136\u0137\7+\2\2\u0137\u0139\7\67\2"+
		"\2\u0138\u013a\5\6\4\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013d"+
		"\3\2\2\2\u013b\u013c\7,\2\2\u013c\u013e\5\b\5\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\5 \21\2\u0140\35\3\2\2"+
		"\2\u0141\u0142\7\61\2\2\u0142\u0144\7\67\2\2\u0143\u0145\5\6\4\2\u0144"+
		"\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0149\5\f"+
		"\7\2\u0147\u0148\7,\2\2\u0148\u014a\5\b\5\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\5\"\22\2\u014c\37\3\2\2"+
		"\2\u014d\u0151\7\t\2\2\u014e\u0150\5&\24\2\u014f\u014e\3\2\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0155\7\n\2\2\u0155!\3\2\2\2\u0156\u015a\7\t\2\2"+
		"\u0157\u0159\5\32\16\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0161\3\2\2\2\u015c\u015a\3\2\2\2\u015d"+
		"\u015e\7.\2\2\u015e\u015f\5\2\2\2\u015f\u0160\7\16\2\2\u0160\u0162\3\2"+
		"\2\2\u0161\u015d\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0166\3\2\2\2\u0163"+
		"\u0165\5&\24\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016a\7\n\2\2\u016a#\3\2\2\2\u016b\u016c\7-\2\2\u016c\u016d\78\2\2\u016d"+
		"\u016e\5\16\b\2\u016e\u016f\5\32\16\2\u016f\u0170\7\16\2\2\u0170%\3\2"+
		"\2\2\u0171\u0172\7-\2\2\u0172\u0173\78\2\2\u0173\u0174\5\16\b\2\u0174"+
		"\u0175\5(\25\2\u0175\'\3\2\2\2\u0176\u0179\5\32\16\2\u0177\u0179\7\16"+
		"\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179)\3\2\2\2\u017a\u0188"+
		"\5\32\16\2\u017b\u017c\5\32\16\2\u017c\u017d\5*\26\2\u017d\u0188\3\2\2"+
		"\2\u017e\u017f\5$\23\2\u017f\u0180\5*\26\2\u0180\u0188\3\2\2\2\u0181\u0182"+
		"\5\34\17\2\u0182\u0183\5*\26\2\u0183\u0188\3\2\2\2\u0184\u0185\5\36\20"+
		"\2\u0185\u0186\5*\26\2\u0186\u0188\3\2\2\2\u0187\u017a\3\2\2\2\u0187\u017b"+
		"\3\2\2\2\u0187\u017e\3\2\2\2\u0187\u0181\3\2\2\2\u0187\u0184\3\2\2\2\u0188"+
		"+\3\2\2\2\u0189\u018a\5*\26\2\u018a\u018b\7\2\2\3\u018b-\3\2\2\2$\66;"+
		"EISW]ahsx\u0086\u008b\u008e\u0096\u009c\u00a8\u00ad\u00c0\u00ff\u0101"+
		"\u0112\u0118\u0134\u0139\u013d\u0144\u0149\u0151\u015a\u0161\u0166\u0178"+
		"\u0187";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}

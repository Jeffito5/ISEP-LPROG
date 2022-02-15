// Generated from AvariaFisica.g4 by ANTLR 4.9.2
package Sprint C/src/avariafisica;
// classes a incluir

import java.util.*;
import java.lang.*;
import java.io.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AvariaFisicaParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, LOCAL_EQUIPAMENTO = 2, DESCRICAO = 3, ANO4 = 4, JAN = 5, FEB = 6, MAR = 7,
            APR = 8, MAY = 9, JUN = 10, JUL = 11, AUG = 12, SEP = 13, OCT = 14, NOV = 15, DEC = 16,
            DIGIT1 = 17, DIGIT2 = 18, TRINTA = 19, TRINTA_E_UM = 20, SEPARATOR = 21, NEWLINE = 22,
            WS = 23;
    public static final int
            RULE_inicio = 0, RULE_expr = 1, RULE_data = 2, RULE_mes = 3, RULE_dia = 4,
            RULE_loc_equip = 5, RULE_desc = 6;

    private static String[] makeRuleNames() {
        return new String[]{
                "inicio", "expr", "data", "mes", "dia", "loc_equip", "desc"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "';'", null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, "'30'", "'31'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, "LOCAL_EQUIPAMENTO", "DESCRICAO", "ANO4", "JAN", "FEB", "MAR",
                "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC", "DIGIT1",
                "DIGIT2", "TRINTA", "TRINTA_E_UM", "SEPARATOR", "NEWLINE", "WS"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "AvariaFisica.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    // HashMap para guardar valores das varia�?veis
    Map<String, Integer> memory = new HashMap<String, Integer>();

    public static void main(String[] args) {
        System.out.println("sadasdasd");
    }

    public AvariaFisicaParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class InicioContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public InicioContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_inicio;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof AvariaFisicaVisitor)
                return ((AvariaFisicaVisitor<? extends T>) visitor).visitInicio(this);
            else return visitor.visitChildren(this);
        }
    }

    public final InicioContext inicio() throws RecognitionException {
        InicioContext _localctx = new InicioContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_inicio);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(15);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(14);
                            expr();
                        }
                    }
                    setState(17);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DESCRICAO || _la == WS);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExprContext extends ParserRuleContext {
        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        public ExprContext() {
        }

        public void copyFrom(ExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class DescLocEquipDataContext extends ExprContext {
        public DescContext a;
        public Loc_equipContext b;
        public Loc_equipContext c;
        public DataContext d;

        public DescContext desc() {
            return getRuleContext(DescContext.class, 0);
        }

        public List<Loc_equipContext> loc_equip() {
            return getRuleContexts(Loc_equipContext.class);
        }

        public Loc_equipContext loc_equip(int i) {
            return getRuleContext(Loc_equipContext.class, i);
        }

        public DataContext data() {
            return getRuleContext(DataContext.class, 0);
        }

        public DescLocEquipDataContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof AvariaFisicaVisitor)
                return ((AvariaFisicaVisitor<? extends T>) visitor).visitDescLocEquipData(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class locEquipDataContext extends ExprContext {
        public Loc_equipContext b;
        public Loc_equipContext c;
        public DataContext d;

        public DescContext desc() {
            return getRuleContext(DescContext.class, 0);
        }

        public List<Loc_equipContext> loc_equip() {
            return getRuleContexts(Loc_equipContext.class);
        }

        public Loc_equipContext loc_equip(int i) {
            return getRuleContext(Loc_equipContext.class, i);
        }

        public DataContext data() {
            return getRuleContext(DataContext.class, 0);
        }

        public locEquipDataContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof AvariaFisicaVisitor)
                return ((AvariaFisicaVisitor<? extends T>) visitor).visitlocEquipData(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExprContext expr() throws RecognitionException {
        ExprContext _localctx = new ExprContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_expr);
        try {
            _localctx = new DescLocEquipDataContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(19);
                ((DescLocEquipDataContext) _localctx).a = desc();
                setState(20);
                match(T__0);
                setState(21);
                ((DescLocEquipDataContext) _localctx).b = loc_equip();
                setState(22);
                match(T__0);
                setState(23);
                ((DescLocEquipDataContext) _localctx).c = loc_equip();
                setState(24);
                match(T__0);
                setState(25);
                ((DescLocEquipDataContext) _localctx).d = data();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DataContext extends ParserRuleContext {
        public TerminalNode WS() {
            return getToken(AvariaFisicaParser.WS, 0);
        }

        public DiaContext dia() {
            return getRuleContext(DiaContext.class, 0);
        }

        public List<TerminalNode> SEPARATOR() {
            return getTokens(AvariaFisicaParser.SEPARATOR);
        }

        public TerminalNode SEPARATOR(int i) {
            return getToken(AvariaFisicaParser.SEPARATOR, i);
        }

        public MesContext mes() {
            return getRuleContext(MesContext.class, 0);
        }

        public TerminalNode ANO4() {
            return getToken(AvariaFisicaParser.ANO4, 0);
        }

        public DataContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_data;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof AvariaFisicaVisitor)
                return ((AvariaFisicaVisitor<? extends T>) visitor).visitData(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DataContext data() throws RecognitionException {
        DataContext _localctx = new DataContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_data);
        try {
            setState(40);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(27);
                    match(WS);
                    setState(28);
                    dia();
                    setState(29);
                    match(SEPARATOR);
                    setState(30);
                    mes();
                    setState(31);
                    match(SEPARATOR);
                    setState(32);
                    match(ANO4);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(34);
                    dia();
                    setState(35);
                    match(SEPARATOR);
                    setState(36);
                    mes();
                    setState(37);
                    match(SEPARATOR);
                    setState(38);
                    match(ANO4);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MesContext extends ParserRuleContext {
        public TerminalNode JAN() {
            return getToken(AvariaFisicaParser.JAN, 0);
        }

        public TerminalNode FEB() {
            return getToken(AvariaFisicaParser.FEB, 0);
        }

        public TerminalNode MAR() {
            return getToken(AvariaFisicaParser.MAR, 0);
        }

        public TerminalNode APR() {
            return getToken(AvariaFisicaParser.APR, 0);
        }

        public TerminalNode MAY() {
            return getToken(AvariaFisicaParser.MAY, 0);
        }

        public TerminalNode JUN() {
            return getToken(AvariaFisicaParser.JUN, 0);
        }

        public TerminalNode JUL() {
            return getToken(AvariaFisicaParser.JUL, 0);
        }

        public TerminalNode AUG() {
            return getToken(AvariaFisicaParser.AUG, 0);
        }

        public TerminalNode SEP() {
            return getToken(AvariaFisicaParser.SEP, 0);
        }

        public TerminalNode OCT() {
            return getToken(AvariaFisicaParser.OCT, 0);
        }

        public TerminalNode NOV() {
            return getToken(AvariaFisicaParser.NOV, 0);
        }

        public TerminalNode DEC() {
            return getToken(AvariaFisicaParser.DEC, 0);
        }

        public MesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mes;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof AvariaFisicaVisitor)
                return ((AvariaFisicaVisitor<? extends T>) visitor).visitMes(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MesContext mes() throws RecognitionException {
        MesContext _localctx = new MesContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_mes);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(42);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAN) | (1L << FEB) | (1L << MAR) | (1L << APR) | (1L << MAY) | (1L << JUN) | (1L << JUL) | (1L << AUG) | (1L << SEP) | (1L << OCT) | (1L << NOV) | (1L << DEC))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DiaContext extends ParserRuleContext {
        public TerminalNode DIGIT1() {
            return getToken(AvariaFisicaParser.DIGIT1, 0);
        }

        public TerminalNode DIGIT2() {
            return getToken(AvariaFisicaParser.DIGIT2, 0);
        }

        public TerminalNode TRINTA() {
            return getToken(AvariaFisicaParser.TRINTA, 0);
        }

        public TerminalNode TRINTA_E_UM() {
            return getToken(AvariaFisicaParser.TRINTA_E_UM, 0);
        }

        public TerminalNode WS() {
            return getToken(AvariaFisicaParser.WS, 0);
        }

        public DiaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dia;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof AvariaFisicaVisitor)
                return ((AvariaFisicaVisitor<? extends T>) visitor).visitDia(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DiaContext dia() throws RecognitionException {
        DiaContext _localctx = new DiaContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_dia);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(44);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT1) | (1L << DIGIT2) | (1L << TRINTA) | (1L << TRINTA_E_UM) | (1L << WS))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Loc_equipContext extends ParserRuleContext {
        public List<TerminalNode> LOCAL_EQUIPAMENTO() {
            return getTokens(AvariaFisicaParser.LOCAL_EQUIPAMENTO);
        }

        public TerminalNode LOCAL_EQUIPAMENTO(int i) {
            return getToken(AvariaFisicaParser.LOCAL_EQUIPAMENTO, i);
        }

        public List<TerminalNode> WS() {
            return getTokens(AvariaFisicaParser.WS);
        }

        public TerminalNode WS(int i) {
            return getToken(AvariaFisicaParser.WS, i);
        }

        public Loc_equipContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_loc_equip;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof AvariaFisicaVisitor)
                return ((AvariaFisicaVisitor<? extends T>) visitor).visitLoc_equip(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Loc_equipContext loc_equip() throws RecognitionException {
        Loc_equipContext _localctx = new Loc_equipContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_loc_equip);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(47);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(46);
                            _la = _input.LA(1);
                            if (!(_la == LOCAL_EQUIPAMENTO || _la == WS)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                        }
                    }
                    setState(49);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == LOCAL_EQUIPAMENTO || _la == WS);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DescContext extends ParserRuleContext {
        public List<TerminalNode> DESCRICAO() {
            return getTokens(AvariaFisicaParser.DESCRICAO);
        }

        public TerminalNode DESCRICAO(int i) {
            return getToken(AvariaFisicaParser.DESCRICAO, i);
        }

        public List<TerminalNode> WS() {
            return getTokens(AvariaFisicaParser.WS);
        }

        public TerminalNode WS(int i) {
            return getToken(AvariaFisicaParser.WS, i);
        }

        public DescContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_desc;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof AvariaFisicaVisitor)
                return ((AvariaFisicaVisitor<? extends T>) visitor).visitDesc(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DescContext desc() throws RecognitionException {
        DescContext _localctx = new DescContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_desc);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(52);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(51);
                            _la = _input.LA(1);
                            if (!(_la == DESCRICAO || _la == WS)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                        }
                    }
                    setState(54);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DESCRICAO || _la == WS);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31;\4\2\t\2\4\3\t" +
                    "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\6\3\6\3\7\6\7\62\n\7\r\7\16\7\63\3\b" +
                    "\6\b\67\n\b\r\b\16\b8\3\b\2\2\t\2\4\6\b\n\f\16\2\6\3\2\7\22\4\2\23\26" +
                    "\31\31\4\2\4\4\31\31\4\2\5\5\31\31\2\67\2\21\3\2\2\2\4\25\3\2\2\2\6*\3" +
                    "\2\2\2\b,\3\2\2\2\n.\3\2\2\2\f\61\3\2\2\2\16\66\3\2\2\2\20\22\5\4\3\2" +
                    "\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2" +
                    "\25\26\5\16\b\2\26\27\7\3\2\2\27\30\5\f\7\2\30\31\7\3\2\2\31\32\5\f\7" +
                    "\2\32\33\7\3\2\2\33\34\5\6\4\2\34\5\3\2\2\2\35\36\7\31\2\2\36\37\5\n\6" +
                    "\2\37 \7\27\2\2 !\5\b\5\2!\"\7\27\2\2\"#\7\6\2\2#+\3\2\2\2$%\5\n\6\2%" +
                    "&\7\27\2\2&\'\5\b\5\2\'(\7\27\2\2()\7\6\2\2)+\3\2\2\2*\35\3\2\2\2*$\3" +
                    "\2\2\2+\7\3\2\2\2,-\t\2\2\2-\t\3\2\2\2./\t\3\2\2/\13\3\2\2\2\60\62\t\4" +
                    "\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\r\3\2" +
                    "\2\2\65\67\t\5\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\17" +
                    "\3\2\2\2\6\23*\638";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
package x3;
import java.lang.StringBuilder;
import java.util.*;
import java.util.logging.*;
import java.io.IOException;
public class Utils {

  public static final Logger LOGGER = Logger.getLogger("InfoLogging");
  private static FileHandler fileTxt;
  private static final SimpleFormatter formatter = new SimpleFormatter();


  public static void initLogging() throws IOException {
    fileTxt = new FileHandler("log.txt");
    // prevent console output
    LOGGER.setUseParentHandlers(false);
    LOGGER.setLevel(Level.INFO);
    fileTxt.setFormatter(formatter);
    LOGGER.addHandler(fileTxt);
  }

  public static void log(String s) {
    LOGGER.info(s);
  }

  public static void tokenizeAngleList(StringBuilder b, List<? extends Tokenizable> elts) {
    tokenizeList('<', '>', b, elts);
  }

  public static void tokenizeParenList(StringBuilder b, List<? extends Tokenizable> elts) {
    tokenizeList('(', ')', b, elts);
  }

  public static void tokenizeList(char open, char close, StringBuilder b,
      List<? extends Tokenizable> elts) {
    b.append(open);
    b.append(' ');
    if (elts.size() > 0) {
      elts.get(0).tokenize(b);
      for (int i = 1; i < elts.size(); i++) {
        Utils.log("tokenizing an element in a list ");
        b.append(", ");
        elts.get(i).tokenize(b);
      }
    }
    b.append(close);
    b.append(' ');
  }

  public static void acceptList(ASTVisitor v, Collection<? extends ASTNode> lst) {
    for (ASTNode n : lst) {
      n.accept(v);
    }
  }

  public static ClassContext getInitialClassContext() {
    ClassContext initialContext = new ClassContext();
    initialContext = initialContext.addClassScheme(getIterableScheme());
    initialContext = initialContext.addClassScheme(getBooleanScheme());
    initialContext = initialContext.addClassScheme(getIntegerScheme());
    initialContext = initialContext.addClassScheme(getCharacterScheme());
    initialContext = initialContext.addClassScheme(getStringScheme());

    return initialContext;
  }

  static NamedType getBooleanType() {
    return new NamedType("Boolean", new ArrayList<Type>());
  }

  static NamedType getIntegerType() {
    return new NamedType("Integer", new ArrayList<Type>());
  }

  static NamedType getStringType() {
    return new NamedType("String", new ArrayList<Type>());
  }

  static NamedType getCharacterType() {
    return new NamedType("Character", new ArrayList<Type>());
  }

  static NamedType getIterableType(Type t) {
    List<Type> params = new ArrayList<Type>();
    params.add(t);
    return new NamedType("Iterable", params);
  }

  static ClassScheme getIterableScheme() {
    KindContext ktxt = new KindContext();
    ktxt = ktxt.addKind(new VarType("E"));
    ClassScheme iter = new ClassScheme(false, new TypeName("Iterable"),
        ktxt, new TopType(), new ArrayList<FunctionScheme>());
    return iter;
  }

  static ClassScheme getBooleanScheme() {
    KindContext emptyk = new KindContext();
    TypeContext emptyc = new TypeContext();
    TypeContext thatBoolc = emptyc.add(new Name("that"), getBooleanType());
    List<FunctionScheme> methods = new ArrayList<FunctionScheme>();

    FunctionScheme negate = new FunctionScheme(new Name("negate"),
        emptyk, emptyc, getBooleanType());
    FunctionScheme and = new FunctionScheme(new Name("and"), emptyk, thatBoolc, getBooleanType());
    FunctionScheme or = new FunctionScheme(new Name("or"), emptyk, thatBoolc, getBooleanType());

    TypeContext throughc = emptyc.add(new Name("upper"), getBooleanType());
    throughc = throughc.add(new Name("includeLower"), getBooleanType());
    throughc = throughc.add(new Name("includeUpper"), getBooleanType());
    FunctionScheme through = new FunctionScheme(new Name("through"),
        emptyk, throughc, getIterableType(getBooleanType()));

    TypeContext onwardsc = emptyc.add(new Name("inclusive"), getBooleanType());
    FunctionScheme onwards = new FunctionScheme(new Name("onwards"),
        emptyk, onwardsc, getIterableType(getBooleanType()));

    TypeContext lessThanc = emptyc.add(new Name("that"), getBooleanType());
    lessThanc = lessThanc.add(new Name("strict"), getBooleanType());
    FunctionScheme lessThan = new FunctionScheme(new Name("lessThan"),
        emptyk, lessThanc, getBooleanType());

    FunctionScheme equals = new FunctionScheme(new Name("equals"), emptyk, thatBoolc, getBooleanType());

    methods.add(negate);
    methods.add(and);
    methods.add(or);
    methods.add(through);
    methods.add(onwards);
    methods.add(lessThan);
    methods.add(equals);

    ClassScheme bool = new ClassScheme(false, new TypeName("Boolean"), emptyk, new TopType(), methods);
    return bool;
  }

  static ClassScheme getIntegerScheme() {
    KindContext emptyk = new KindContext();
    TypeContext emptyc = new TypeContext();
    List<FunctionScheme> methods = new ArrayList<FunctionScheme>();

    FunctionScheme negative = new FunctionScheme(new Name("negative"), emptyk, emptyc, getIntegerType());

    TypeContext timesc = emptyc.add(new Name("factor"), getIntegerType());
    FunctionScheme times = new FunctionScheme(new Name("times"), emptyk, timesc, getIntegerType());

    TypeContext dividec = emptyc.add(new Name("divisor"), getIntegerType());
    FunctionScheme divide = new FunctionScheme(new Name("divide"),
        emptyk, dividec, getIterableType(getIntegerType()));

    TypeContext moduloc = emptyc.add(new Name("modulus"), getIntegerType());
    FunctionScheme modulo = new FunctionScheme(new Name("modulo"),
        emptyk, moduloc, getIterableType(getIntegerType()));

    TypeContext plusc  = emptyc.add(new Name("summand"), getIntegerType());
    FunctionScheme plus = new FunctionScheme(new Name("plus"), emptyk, plusc, getIntegerType());

    TypeContext minusc  = emptyc.add(new Name("subtrahend"), getIntegerType());
    FunctionScheme minus = new FunctionScheme(new Name("minus"), emptyk, minusc, getIntegerType());

    TypeContext throughc = emptyc.add(new Name("upper"), getIntegerType());
    throughc = throughc.add(new Name("includeLower"), getBooleanType());
    throughc = throughc.add(new Name("includeUpper"), getBooleanType());
    FunctionScheme through = new FunctionScheme(new Name("through"), emptyk, throughc,
        getIterableType(getIntegerType()));

    TypeContext onwardsc = emptyc.add(new Name("inclusive"), getBooleanType());
    FunctionScheme onwards = new FunctionScheme(new Name("onwards"), emptyk, onwardsc,
        getIterableType(getIntegerType()));

    TypeContext lessThanc = emptyc.add(new Name("that"), getIntegerType());
    lessThanc = lessThanc.add(new Name("strict"), getBooleanType());
    FunctionScheme lessThan = new FunctionScheme(new Name("lessThan"), emptyk, lessThanc, getBooleanType());

    TypeContext equalsc = emptyc.add(new Name("that"), getIntegerType());
    FunctionScheme equals = new FunctionScheme(new Name("equals"), emptyk, equalsc, getBooleanType());

    methods.add(negative);
    methods.add(times);
    methods.add(divide);
    methods.add(modulo);
    methods.add(plus);
    methods.add(minus);
    methods.add(through);
    methods.add(onwards);
    methods.add(lessThan);
    methods.add(equals);

    ClassScheme integer = new ClassScheme(false, new TypeName("Integer"), emptyk, new TopType(), methods);

    return integer;
  }

  static ClassScheme getStringScheme() {
    KindContext emptyk = new KindContext();
    TypeContext emptyc = new TypeContext();

    List<FunctionScheme> methods = new ArrayList<FunctionScheme>();

    TypeContext equalsc = emptyc.add(new Name("that"), getStringType());
    FunctionScheme equals = new FunctionScheme(new Name("equals"), emptyk, equalsc, getBooleanType());

    methods.add(equals);

    ClassScheme string = new ClassScheme(false, new TypeName("String"), emptyk,
        getIterableType(getCharacterType()), methods);

    return string;
  }

  static ClassScheme getCharacterScheme() {
    KindContext emptyk = new KindContext();
    TypeContext emptyc = new TypeContext();

    List<FunctionScheme> methods = new ArrayList<FunctionScheme>();

    FunctionScheme unicode = new FunctionScheme(new Name("unicode"), emptyk, emptyc, getIntegerType());

    TypeContext equalsc = emptyc.add(new Name("that"), getCharacterType());
    FunctionScheme equals = new FunctionScheme(new Name("equals"), emptyk, equalsc, getBooleanType());

    methods.add(unicode);
    methods.add(equals);

    ClassScheme character = new ClassScheme(false, new TypeName("String"), emptyk,
        getIterableType(getCharacterType()), methods);

    return character;
  }

  static FunctionContext getInitialFunctionContext() {
    KindContext emptyk = new KindContext();
    TypeContext emptyc = new TypeContext();
    FunctionContext init = new FunctionContext();


    TypeContext characterc = emptyc.add(new Name("unicode"), getIntegerType());
    FunctionScheme character = new FunctionScheme(new Name("charater"), emptyk, characterc, getCharacterType());

    TypeContext stringc = emptyc.add(new Name("characters"), getIterableType(getCharacterType()));
    FunctionScheme string = new FunctionScheme(new Name("string"), emptyk, stringc, getStringType());

    init = init.add(character);
    init = init.add(string);

    return init;
  }

  static TypeContext getInitialVariableContext() {
    TypeContext init = new TypeContext();
    init = init.add(new Name("input"), getIterableType(getStringType()));
    return init;
  }
}

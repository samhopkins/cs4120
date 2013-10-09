package x3;
import java.util.*;

public class Tests {
  public static void main(String[] args) throws Exception {
    testSubtyping();

  }

  public static void testSubtyping() throws NoSuchTypeException {
    ClassContext initClassCtxt = Utils.getInitialClassContext();
    KindContext emptyk = new KindContext();
    NamedType foo = new NamedType("Foo", new ArrayList<Type>());
    NamedType bar = new NamedType("Bar", new ArrayList<Type>());
    IntersectionType fooAndBar = new IntersectionType(foo, bar);

    ClassScheme fooScheme = new ClassScheme(false, new TypeName("Foo"),
        new KindContext(), new TopType(), new ArrayList<FunctionScheme>());

    ClassScheme barScheme = new ClassScheme(false, new TypeName("Bar"),
        new KindContext(), foo, new ArrayList<FunctionScheme>());

    ClassContext initPlusBar = initClassCtxt.addClassScheme(fooScheme);
    initPlusBar = initPlusBar.addClassScheme(barScheme);

    List<Type> singleFoo = new ArrayList<Type>();
    singleFoo.add(foo);

    Type t1;
    Type t2;

    t1 = new NamedType("Foo", new ArrayList<Type>());
    t2 = new NamedType("Foo", new ArrayList<Type>());
    p("Foo <: Foo");
    assert(t1.isSubtypeOf(t2, initPlusBar, emptyk));

    t2 = new NamedType("Bar", new ArrayList<Type>());
    p("not Foo <: Bar");
    assert(!(foo.isSubtypeOf(bar, initPlusBar, emptyk)));

    p("Foo & Bar <: Foo");
    assert(fooAndBar.isSubtypeOf(foo, initPlusBar, emptyk));
    p("Foo & Bar <: Bar");
    assert(fooAndBar.isSubtypeOf(bar, initPlusBar, emptyk));

    p("Bar <: Foo");
    assert(bar.isSubtypeOf(foo, initPlusBar, emptyk));

    KindContext singleA = emptyk.addKind(new VarType("A"));
    List<Type> singleInt = new ArrayList<Type>();
    singleInt.add(Utils.getIntegerType());

    List<Type> singleVar = new ArrayList<Type>();
    singleVar.add(new VarType("A"));

    NamedType parent = new NamedType("Parent", singleInt);
    NamedType child = new NamedType("Child", singleInt);
    NamedType gchild = new NamedType("Grandchild", singleInt);


    ClassScheme parentScheme = new ClassScheme(false, new TypeName("Parent"),
        singleA, new TopType(), new ArrayList<FunctionScheme>());
    ClassScheme childScheme = new ClassScheme(false, new TypeName("Child"),
        singleA, new NamedType("Parent", singleVar), new ArrayList<FunctionScheme>());
    ClassScheme gchildScheme = new ClassScheme(false, new TypeName("Grandchild"),
        singleA, new NamedType("Child", singleVar), new ArrayList<FunctionScheme>());

    ClassContext family = initClassCtxt.addClassScheme(parentScheme);
    family = family.addClassScheme(childScheme);
    family = family.addClassScheme(gchildScheme);


    p("gchild<Integer<>> <: parent<Integer<>>");
    assert(gchild.isSubtypeOf(parent, family, emptyk));


    System.out.println("all subtyping tests pass");
  }

  static void p(String s) {
    System.out.println(s);
  }
}








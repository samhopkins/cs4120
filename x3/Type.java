package x3;
import java.util.*;
abstract class Type {

  // TODO: remove exceptions

  abstract boolean isSubtypeOf(Type other, ClassContext cctxt, KindContext kctxt)
      throws NoSuchTypeException;

  abstract Type getConstructibleComponent()
    throws UnimplementedException, NoConstructibleComponentException;

  abstract Type substitute(List<Type> types, KindContext vars);

  abstract boolean isValid(ClassContext cctxt, KindContext kctxt);
  abstract Type isValidConstructible(ClassContext cctxt, KindContext kctxt);

  abstract Type join(Type other, ClassContext cctxt, KindContext kctxt);

}

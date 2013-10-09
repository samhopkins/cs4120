package x3;
abstract class Type {

  // TODO: remove exceptions

  abstract boolean isSubtypeOf(Type other, ClassContext cctxt, KindContext kctxt) throws UnimplementedException;

  abstract Type getConstructibleComponent() 
    throws UnimplementedException, NoConstructibleComponentException;

}

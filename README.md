Basic Java type optionality annotations
@NonNull
@Nullable

Android declares them in support.annotation but does not enforce them (the compiler does not make any conclusions about it)

Java declares and enforces them since JDK 1.8

So by using this package, code can be annotated universally regardless of the platform. Once Android adopts 1.8, the code does not need any change, just importing a different package.

Annotation is The Right Thing To Do (TM) even if just as a meta documentation and a design thinking enforcer.

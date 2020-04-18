package visitor;

public interface Element {
    float accept(MyVisitor visitor);
}

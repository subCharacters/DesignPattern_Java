package Visitor;

public interface DocumentVisitor {
    void visit(Text text);
    void visit(Image image);
}

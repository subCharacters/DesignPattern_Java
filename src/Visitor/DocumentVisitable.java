package Visitor;

public interface DocumentVisitable {
    void accept(DocumentVisitor visitor);
}

package Visitor;

public class PrintVisitor implements DocumentVisitor {
    @Override
    public void visit(Text text) {
        System.out.println("텍스트: " + text.getContent());
    }

    @Override
    public void visit(Image image) {
        System.out.println("이미지 파일: " + image.getFilename());
    }
}

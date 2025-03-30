package Composite;

public class Main {
    /*
       개별 객체와 객체의 그룹을 동익한 방식으로 다룰 수 있도록 트리 구조록 구성하는 패턴.
       리눅스나 윈도우 등에서 사용하는 파일, 폴더 시스템을 생각하면 이해하기 쉽다.
    */
    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.add(new File("a.txt", 1000));
        root.add(new File("b.txt", 2000));

        Folder folder1 = new Folder("folder1");
        root.add(folder1);
        folder1.add(new File("aa.txt", 100));
        Folder folder1Subfolder1 = new Folder("folder1Subfolder1");
        folder1.add(folder1Subfolder1);

        Folder folder2 = new Folder("folder2");
        root.add(folder2);
        folder2.add(new File("AA.txt", 200));
        folder2.add(new File("BB.txt", 250));

        root.list();
    }
}

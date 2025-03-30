package Composite;

import java.util.Iterator;
import java.util.LinkedList;

public class Folder extends Unit{
    private LinkedList<Unit> units = new LinkedList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Unit> iterator = units.iterator();
        while (iterator.hasNext()) {
            size += iterator.next().getSize();
        }
        return size;
    }

    public boolean add(Unit unit) {
        units.add(unit);
        return true;
    }

    private void list(String indent, Unit unit) {
        if (unit instanceof File) {
            System.out.println(indent + unit);
        } else {
            Folder dir = (Folder) unit;
            Iterator<Unit> iterator = dir.units.iterator();
            System.out.println(indent + "+ " + unit);
            while (iterator.hasNext()) {
                list(indent + "  ", iterator.next());
            }
        }
    }

    public void list() {
        list("", this);
    }
}

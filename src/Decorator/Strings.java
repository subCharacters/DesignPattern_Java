package Decorator;

import java.util.ArrayList;
import java.util.Iterator;

public class Strings extends Item {
    private ArrayList<String> strings = new ArrayList<>();

    public void add(String item) {
        strings.add(item);
    }

    @Override
    public int getLineCount() {
        return strings.size();
    }

    @Override
    public int getMaxLength() {
        Iterator<String> iterator = strings.iterator();
        int maxWidth = 0;
        while (iterator.hasNext()) {
            String string = iterator.next();
            int windth = string.length();
            if (windth > maxWidth) {
                maxWidth = windth;
            }
        }
        return maxWidth;
    }

    @Override
    public int getLength(int index) {
        String string = strings.get(index);
        return string.length();
    }

    @Override
    public String getString(int index) {
        String string = strings.get(index);
        return string;
    }
}

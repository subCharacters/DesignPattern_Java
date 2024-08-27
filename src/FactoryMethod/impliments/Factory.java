package FactoryMethod.impliments;

public abstract class Factory {
    public Item create(String name) {
        boolean isCreatable = isCreatable(name);

        if (isCreatable) {
            Item item = createItem(name);
            postprocess(name);
            return item;
        }

        return null;
    }


    public abstract boolean isCreatable(String name);

    public abstract Item createItem(String name);

     public abstract void postprocess(String name);
}

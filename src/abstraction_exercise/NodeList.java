package abstraction_exercise;

interface NodeList {
    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem itemToRemove);

    void traverse(ListItem root);
}

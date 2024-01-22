package exercise;

public class SearchTree implements NodeList{

    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){// the list was empty so this item becomes the head of the list
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null){

            if(currentItem.compareTo(newItem) < 0){
                if(currentItem.next() != null){
                    currentItem = currentItem.next();

                } else {// the next item is not present, so we insert the item at the end of the list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (currentItem.compareTo(newItem) > 0) {
                if(currentItem.previous()!= null){
                    currentItem.previous().setNext(newItem.setPrevious(currentItem.previous()).setNext(currentItem).setPrevious(newItem));
                } else {
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null) {
            System.out.println("Deleting item " + item.getValue());

        }
        ListItem currentItem = this.root;
        while(currentItem != null) {
            if(currentItem.compareTo(item) == 0){
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if(currentItem.compareTo(item) < 0) {
                currentItem = currentItem.next();
            } else{ // comparison > 0
                return false;
            }
        }// Reached end of list with no remaining items
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.leftLink);
            System.out.println(root.value);
            traverse(root.rightLink);
        }
    }

    private void performRemoval(ListItem itemToRemove, ListItem root){

    }
}

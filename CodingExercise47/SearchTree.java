public class SearchTree implements NodeList {
    private ListItem root;
    
    public SearchTree(ListItem root) {
        this.root = root;
    }
    
    @Override
    public ListItem getRoot() {
        return root;
    }
    
    @Override
    public boolean addItem(ListItem item) {
        if (root == null) {
            root = item;
            return true;
        }
        
        ListItem current = root;
        while (true) {
            if (current.compareTo(item) == 0) {
                return false;
            } else if (current.compareTo(item) == 1) {
                current.setPrevious(item);
                return true;
            } else if (current.next() == null) {
                current.setNext(item);
                return true;
            }
            
            current = current.next();
        }
    }
    
    @Override
    public boolean removeItem(ListItem item) {
        if (root == null || item == null) {
            return false;
        }
        
        ListItem previous = null;
        while (true) {
            if (root.compareTo(item) == 0) {
                performRemoval(item, previous);
                return true;
            }
            
            if (root.next() == null) {
                return false;
            }
            
            previous = root;
            root = root.next();
        }
    }
    
    private void performRemoval(ListItem remove, ListItem parent) {
        if (remove.next() == null) {
            if (parent.next() == remove) {
                parent.setNext(remove.previous());
            } else if (parent.previous() == remove) {
                parent.setPrevious(remove.previous());
            } else {
                root = remove.previous();
            }
        } else if (remove.previous() == null) {
            if (parent.next() == remove) {
                parent.setNext(remove.next());
            } else if (parent.previous() == remove) {
                parent.setPrevious(remove.next());
            } else {
                root = remove.next();
            }
        } else {
            ListItem current = remove.next();
            ListItem leftMostParent = remove;
     
            while (current.previous() != null) {
                leftMostParent = current;
                current = current.previous();
            }
     
            remove.setValue(current.getValue());
     
            if (leftMostParent == remove) {
                remove.setNext(current.next());
            } else {
                leftMostParent.setPrevious(current.next());
            }
        }
    }
    
    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            return;
        }
        traverse(root.previous());
        System.out.println(root.getValue());
        traverse(root.next());
    }
}

public class MyLinkedList implements NodeList {
    private ListItem root;
    
    public MyLinkedList(ListItem root) {
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
            if (current.next() == null) {
                current.setNext(item);
                item.setPrevious(current);
                return true;
            }
            
            if (current.compareTo(item) == 1) {
                root = item;
                root.setNext(current);
                current.setPrevious(root);
                return true;
            }
            return false;
        }
    }
    
    @Override
    public boolean removeItem(ListItem item) {
        if (root == null || item == null) {
            return false;
        }
        
        while (true) {
            if (root.compareTo(item) == 0) {
                root.previous().setNext(null);
                return true;
            }
            
            root = root.next();
            if (root == null) {
                return false;
            }
        }
    }
    
    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } 
        
        while (root != null) {
            System.out.println(root.getValue());
            root = root.next();
        }
    }
}

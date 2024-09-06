public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }
    
    @Override
    ListItem next() {
        return rightLink;
    }
    
    @Override
    ListItem setNext(ListItem right) {
        return this.rightLink = right;
    }
    
    @Override
    ListItem previous() {
        return leftLink;
    }
    
    @Override
    ListItem setPrevious(ListItem left) {
        return this.leftLink = left;
    }
    
    @Override
    int compareTo(ListItem item) {
        int x = Integer.parseInt(String.valueOf(this.getValue()));
        int y = Integer.parseInt(String.valueOf(item.getValue()));
        if (x == y) {
            return 0;
        } else {
            return (x > y) ? 1 : -1;
        }
    }
}

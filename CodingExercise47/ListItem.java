public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;
    
    public ListItem(Object value) {
        this.value = value;
    }
    
    abstract ListItem next();
    abstract ListItem setNext(ListItem right);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem left);
    abstract int compareTo(ListItem item);
    
    public Object getValue() {
        return value;
    }
    
    public void setValue(Object value) {
        this.value = value;
    }
}

package AbstractClass.Challenge;

public abstract class ListItem {
    //The protected keyword is an access modifier used for attributes, methods and constructors, making them accessible in the same package and subclasses.
    protected ListItem rightlink = null;
    protected ListItem leftlink = null;

    protected Object value;
    public ListItem(Object value){
        this.value = value;
    }
    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo ( ListItem item);

    public Object getValue(){
        return value;
    }
    public void setValue(Object value){
        this.value = value;
    }

}

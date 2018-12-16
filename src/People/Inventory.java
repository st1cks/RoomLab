package People;

public class Inventory {
    private int ItemCount;
    private final int MAX_ITEMS = 5;
    private String[] inventory;


    public Inventory(){
        this.inventory = new String[MAX_ITEMS];
        ItemCount = 0;
    }

    public String pickUp(String Item) {
        pickUp = Item;
    }


    public obtainItem() {
        return pickUp;

    }
}

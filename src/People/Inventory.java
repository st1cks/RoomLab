package People;

public class Inventory extends Person{
    private int ItemCount;
    private final int MAX_ITEMS = 5;
    private String[] inventory;
    private int atkIncrease;
    private int hpIncrease;


    Person person1 = new Person();

    public Inventory(){
        this.inventory = new String[MAX_ITEMS];
        this.ItemCount = 0;
    }

    public void modifyStats(){
        int rustysword = 0;
        int rustyarmor = 0;
        int brokenstick = 0;
        for(int i = 0; i< inventory.length; i++){
                if(inventory[i].equals("Rusty Sword")){
                    rustysword +=1;
                }
                if(inventory[i].equals("Rusty Armor")){
                    rustyarmor += 1;
                }
                if(inventory[i].equals("Broken Stick")){
                    brokenstick += 1;
            }
        }
    }
}

package People;

public class Inventory {
    private int ItemCount;
    private final int MAX_ITEMS = 5;
    private String[] inventory;


    public Inventory(){
        this.inventory = new String[MAX_ITEMS];
        ItemCount = 0;
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
            int StrengthIncrease = rustysword *3 + brokenstick*5;
            int MaxHPIncrease = rustyarmor*5;
        }
    }
}

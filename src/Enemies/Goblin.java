package Enemies;

public class Goblin extends Enemy{
    private int HP;
    private int ATK;
    private int droppedGold;
    private String totalStats;

    public Goblin(){
        this.HP = HP;
        this.ATK = ATK;
       this.droppedGold = droppedGold;
       this.totalStats = totalStats;
    }

    public String GoblinHP(){
        HP = 10;
        ATK = 3;
        totalStats = "HP = "+HP+"";
        return totalStats;
    }
}

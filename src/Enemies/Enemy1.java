package Enemies;

public class Enemy1 implements Enemy {
        private int HP;
       private int ATK;

    public String getName(){
        return "Chad the Business Man";
    }

    public Enemy1(int HP, int ATK){
        this.HP = HP;
        this.ATK = ATK;
    }

    //Return battle stats.
    public int getHP(){
        return HP;
    }
    public int getATK(){
        return ATK;
    }

    public void printEnemy(){
        System.out.println ("    /:''|    ");
        System.out.println ("   |: 66|_   ");
        System.out.println ("   C     _)  ");
        System.out.println ("    \\ ._|      ");
        System.out.println ("     ) /       ");
        System.out.println ("   /`\\       ");
        System.out.println ("   || |Y|       ");
        System.out.println ("   || |#|       ");
        System.out.println ("   || |#|       ");
        System.out.println ("   || |#|       ");
        System.out.println ("   :| |=:       ");
        System.out.println ("   ||_|,|      ");
        System.out.println ("   \\)))||     ");
        System.out.println ("|~~~`-`~~~|   ");
        System.out.println ("|         |    ");
        System.out.println ("|_________|    ");
        System.out.println ("|_________|    ");
        System.out.println ("    | ||       ");
        System.out.println ("    |_||__        ");
        System.out.println ("    (____))    ");
    }

public int goldDrop(){
        return 5;
}

}

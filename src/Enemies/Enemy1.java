package Enemies;

public class Enemy1 implements Enemy {
        private int HP;
        private final int MAX_HP= 15;
        private final int Strength = 3;

    public String getName(){
        return "Chad the Business Man";
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
        return 0;
}

}

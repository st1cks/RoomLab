package Rooms;
import Game.Runner;
import People.Person;

    public class BattleRoom extends Room{
        public BattleRoom(int x, int y) {
        super(x, y);
        }

        public void EnterBattle(Person x){
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);

        System.out.println("You have entered the Battle Room.");
    }

    public void spawnEnemy(){

    }
}

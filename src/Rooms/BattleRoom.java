package Rooms;
import Enemies.Enemy;
import Game.Runner;
import People.Person;
import Enemies.Enemy1;
import Enemies.Enemy2;

import java.util.ArrayList;
import java.util.List;


public class BattleRoom extends Room{
        public BattleRoom(int x, int y) {
        super(x, y);
        }

        Enemy1 Chad = new Enemy1(15,5);
        Enemy2 HandCat = new Enemy2(230, 8);

        public String[] RandomEnemy = new String[2];
        public void EnterBattle(Person x){
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);

        System.out.println("You have entered the Battle Room.");
    }



}

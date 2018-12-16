package People;

public class Apple implements Consumable{

    public void eat(Person P){
        P.restoreHealth(10);
        P.gainMaxHealth(10);
    }

    public String getName(){
        return "Healthy Apple";
    }
}

// this?^okay u
There's no method to spawn items yet
My overarching class? huh
There's a runner to run the game
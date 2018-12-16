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

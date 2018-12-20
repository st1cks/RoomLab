package People;


//This is actually the only consumable
public class Apple implements Consumable{

    @Override
    public void eat(Person P){
        P.restoreHealth(10);
    }
    @Override
    public String getName(){
        return "Healthy Apple";
    }
}
